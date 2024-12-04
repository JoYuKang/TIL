package com.gen.prepractice.member;

import com.gen.prepractice.member.enums.Role;
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

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;

}
