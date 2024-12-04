package com.gen.prepractice.member.dto.request;

import com.gen.prepractice.member.Member;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SignInRequest {
    @NotBlank(message = "이름은 필수값 입니다.")
    @Pattern(regexp = "^[a-z0-9]{4,10}$",
            message = "아이디는 4~10자의 소문자와 숫자만 포함해야 합니다.")
    private String username;

    @NotBlank(message = "비밀번호는 필수값 입니다.")
    @Pattern(
            regexp = "^[a-zA-Z0-9]{8,15}$",
            message = "비밀번호는 8~15자의 알파벳 대소문자와 숫자만 포함해야 합니다."
    )
    private String password;




}
