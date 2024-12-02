package com.gen.prepractice.board;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Getter
@Entity
@Builder
@Table(name ="tb_board")
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "제목은 곱백일 수 없습니다.")
    private String title;

    private String category;

    @NotBlank(message = "내용은 공백일 수 없습니다.")
    private String Content;


}
