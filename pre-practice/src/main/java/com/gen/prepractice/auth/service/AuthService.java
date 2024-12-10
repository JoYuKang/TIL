package com.gen.prepractice.auth.service;

import com.gen.prepractice.auth.dto.request.SignInRequest;

public interface AuthService {
    void signIn(SignInRequest request);
}
