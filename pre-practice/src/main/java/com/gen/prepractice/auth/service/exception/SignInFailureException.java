package com.gen.prepractice.auth.service.exception;

public class SignInFailureException extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "아이디 혹은 비밀번호가 틀립니다.";

    public SignInFailureException() {
        super(DEFAULT_MESSAGE);
    }
}
