package com.gen.prepractice.member.service.exception;

public class SignUpDuplicateException extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "이미 존재하는 사용자입니다.";

    public SignUpDuplicateException() {
        super(DEFAULT_MESSAGE);
    }

}
