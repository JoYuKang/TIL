package com.gen.prepractice.auth.controller;

import com.gen.prepractice.auth.dto.request.SignInRequest;
import com.gen.prepractice.auth.service.AuthService;
import com.gen.prepractice.config.dto.JwtDto;
import com.gen.prepractice.member.dto.request.SignUpRequest;
import com.gen.prepractice.member.dto.response.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity<MemberResponseDto> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authService.signup(signUpRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@RequestBody SignInRequest signInRequest) {
        return ResponseEntity.ok(authService.signIn(signInRequest));
    }

    @PostMapping("/reissue")
    public ResponseEntity<JwtDto> reissue(@RequestBody JwtDto tokenRequestDto) {
        return ResponseEntity.ok(authService.reissue(tokenRequestDto));
    }

}
