package com.gen.prepractice.board.service.exception;

public class UnauthorizedException extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "인증이 필요합니다.";

    public UnauthorizedException() {
        super(DEFAULT_MESSAGE);
    }
}
