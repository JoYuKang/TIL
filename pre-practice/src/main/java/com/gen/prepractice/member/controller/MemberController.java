package com.gen.prepractice.member.controller;

import com.gen.prepractice.member.Member;
import com.gen.prepractice.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@Valid @RequestBody Member member) {

        // service


        return new ResponseEntity<>(HttpStatus.CREATED);
    }




}
