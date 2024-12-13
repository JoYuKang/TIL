package com.gen.prepractice.auth.service;

import com.gen.prepractice.auth.dto.request.SignInRequest;
import com.gen.prepractice.config.dto.JwtDto;
import com.gen.prepractice.member.dto.request.SignUpRequest;
import com.gen.prepractice.member.dto.response.MemberResponseDto;

public interface AuthService {

    MemberResponseDto signup(SignUpRequest memberRequestDto);
    JwtDto signIn(SignInRequest request);

    JwtDto reissue(JwtDto jwtDto);

}
