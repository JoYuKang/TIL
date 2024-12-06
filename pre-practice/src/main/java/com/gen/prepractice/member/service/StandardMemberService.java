package com.gen.prepractice.member.service;

import com.gen.prepractice.member.dto.request.SignUpRequest;
import com.gen.prepractice.member.repository.MemberRepository;
import com.gen.prepractice.member.service.exception.SignUpDuplicateException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StandardMemberService implements MemberService {

    @Autowired
    private final MemberRepository memberRepository;

    @Override
    public Long signUp(SignUpRequest signupRequest) {
        memberRepository.findByUsername(signupRequest.getUsername())
                .ifPresent(member -> {
                    throw new SignUpDuplicateException();
                });

        return memberRepository.save(SignUpRequest.toMember(signupRequest)).getId();
    }
}
