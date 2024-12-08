package com.gen.prepractice.board.domain;

import com.gen.prepractice.comon.entity.BaseEntity;
import com.gen.prepractice.member.domain.Member;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@Table(name ="tb_board")
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "제목은 공백일 수 없습니다.")
    private String title;

    @NotBlank(message = "내용은 공백일 수 없습니다.")
    private String content;

    @NotBlank(message = "비밀번호는 공백일 수 없습니다.")
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    private String memberName;

    private String authorName;

    public Board(String title, String password, String content,String authorName, Member member) {
        this.title = title;
        this.password = password;
        this.content = content;
        this.member = member;
        this.authorName = authorName;
        this.memberName = member.getUsername();
    }
}
