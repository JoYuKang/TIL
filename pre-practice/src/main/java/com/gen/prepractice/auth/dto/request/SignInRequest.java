package com.gen.prepractice.auth.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SignInRequest {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;

}
