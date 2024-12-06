package com.gen.prepractice.board.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AddBoardRequest {

    @NotBlank
    String title;

    @NotBlank
    String password;

    @NotBlank
    String content;

    @NotBlank
    String userName;
}
