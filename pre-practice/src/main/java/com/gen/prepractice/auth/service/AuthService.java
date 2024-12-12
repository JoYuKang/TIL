package com.gen.prepractice.auth.service;

import com.gen.prepractice.auth.dto.request.SignInRequest;
import com.gen.prepractice.config.dto.JwtDto;

public interface AuthService {
    JwtDto signIn(SignInRequest request);

    JwtDto reissue(JwtDto jwtDto);

}
