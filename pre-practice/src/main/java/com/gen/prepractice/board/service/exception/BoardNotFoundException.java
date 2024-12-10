package com.gen.prepractice.board.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BoardNotFoundException extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "게시글을 찾을 수 없습니다.";

    public BoardNotFoundException() {
        super(DEFAULT_MESSAGE);
    }
}
