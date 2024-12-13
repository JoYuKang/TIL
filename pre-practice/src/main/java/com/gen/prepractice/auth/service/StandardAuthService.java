package com.gen.prepractice.auth.service;

import com.gen.prepractice.auth.domain.RefreshToken;
import com.gen.prepractice.auth.dto.request.SignInRequest;
import com.gen.prepractice.auth.repository.RefreshTokenRepository;
import com.gen.prepractice.config.dto.JwtDto;
import com.gen.prepractice.config.jwt.JwtTokenProvider;
import com.gen.prepractice.member.domain.Member;
import com.gen.prepractice.member.dto.request.SignUpRequest;
import com.gen.prepractice.member.dto.response.MemberResponseDto;
import com.gen.prepractice.member.repository.MemberRepository;
import com.gen.prepractice.member.service.exception.SignUpDuplicateException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class StandardAuthService implements AuthService, UserDetailsService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final RefreshTokenRepository refreshTokenRepository;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    @Override
    @Transactional
    public MemberResponseDto signup(SignUpRequest signupRequest) {
        memberRepository.findByUsername(signupRequest.getUsername())
                .ifPresent(member -> {
                    throw new SignUpDuplicateException();
                });
        Member member = signupRequest.toMember(passwordEncoder);
        return MemberResponseDto.of(memberRepository.save(member));
    }
    @Override
    @Transactional
    public JwtDto signIn(SignInRequest request) {
        // 1. Login ID/PW 를 기반으로 AuthenticationToken 생성
        UsernamePasswordAuthenticationToken authenticationToken = request.toAuthentication();

        // 2. 실제로 검증 (사용자 비밀번호 체크) 이 이루어지는 부분
        //    authenticate 메서드가 실행이 될 때 CustomUserDetailsService 에서 만들었던 loadUserByUsername 메서드가 실행됨
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        if (authentication == null) {
            log.error("AuthenticationManager is null. Ensure it is properly configured.");
            throw new IllegalStateException("AuthenticationManager is not configured.");
        }

        // 3. 인증 정보를 기반으로 JWT 토큰 생성
        JwtDto tokenDto = jwtTokenProvider.createToken(authentication);

        // 4. RefreshToken 저장
        RefreshToken refreshToken = RefreshToken.builder()
                .key(authentication.getName())
                .value(tokenDto.getRefreshToken())
                .build();

        refreshTokenRepository.save(refreshToken);

        // 5. 토큰 발급
        return tokenDto;
    }

    @Override
    @Transactional
    public JwtDto reissue(JwtDto jwtDto) {
        // 1. Refresh Token 검증
        if (!jwtTokenProvider.validateToken(jwtDto.getRefreshToken())) {
            throw new RuntimeException("Refresh Token 이 유효하지 않습니다.");
        }

        // 2. Access Token 에서 Member ID 가져오기
        Authentication authentication = jwtTokenProvider.getAuthentication(jwtDto.getAccessToken());

        // 3. 저장소에서 Member ID 를 기반으로 Refresh Token 값 가져옴
        RefreshToken refreshToken = refreshTokenRepository.findByKey(authentication.getName())
                .orElseThrow(() -> new RuntimeException("로그아웃 된 사용자입니다."));

        // 4. Refresh Token 일치하는지 검사
        if (!refreshToken.getValue().equals(jwtDto.getRefreshToken())) {
            throw new RuntimeException("토큰의 유저 정보가 일치하지 않습니다.");
        }

        // 5. 새로운 토큰 생성
        JwtDto tokenDto = jwtTokenProvider.createToken(authentication);

        // 6. 저장소 정보 업데이트
        RefreshToken newRefreshToken = refreshToken.updateValue(tokenDto.getRefreshToken());
        refreshTokenRepository.save(newRefreshToken);

        // 토큰 발급
        return tokenDto;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return memberRepository.findByUsername(username)
                .map(this::createUserDetails).orElseThrow(() -> new UsernameNotFoundException(username + " 를 찾을 수 없습니다."));
    }

    private UserDetails createUserDetails(Member member) {
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(member.getRole().toString());

        return new User(
                String.valueOf(member.getId()),
                member.getPassword(),
                Collections.singleton(grantedAuthority)
        );
    }
}
