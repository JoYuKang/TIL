package com.gen.prepractice.member;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
public class MemberController {

    @PostMapping("/signup")
    public ResponseEntity<Void> signup(@Valid @RequestBody Member member) {

        // service

        return new ResponseEntity<>(HttpStatus.CREATED);
    }



}
