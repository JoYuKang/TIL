package com.gen.prepractice.comon.exception;

import com.gen.prepractice.comon.entity.ErrorResponse;
import com.gen.prepractice.member.service.exception.SignUpDuplicateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SignUpDuplicateException.class)
    public ResponseEntity<ErrorResponse>handleSignUpDuplicateException(SignUpDuplicateException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

}
