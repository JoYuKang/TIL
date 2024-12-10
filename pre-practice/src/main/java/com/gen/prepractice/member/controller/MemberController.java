package com.gen.prepractice.member.controller;

import com.gen.prepractice.member.domain.Member;
import com.gen.prepractice.member.dto.request.SignUpRequest;
import com.gen.prepractice.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@Valid @RequestBody SignUpRequest request) {

        memberService.signUp(request);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }




}
