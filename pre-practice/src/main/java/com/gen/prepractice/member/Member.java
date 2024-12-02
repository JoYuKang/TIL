package com.gen.prepractice.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Entity
@Builder
@Table(name ="tb_member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
