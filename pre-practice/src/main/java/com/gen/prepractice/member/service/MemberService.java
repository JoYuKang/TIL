package com.gen.prepractice.member.service;

import com.gen.prepractice.member.dto.request.SignUpRequest;

public interface MemberService {
    Long signUp(SignUpRequest signupRequest);

}
