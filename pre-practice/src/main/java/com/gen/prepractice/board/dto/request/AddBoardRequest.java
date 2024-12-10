package com.gen.prepractice.board.dto.request;

import com.gen.prepractice.board.domain.Board;
import com.gen.prepractice.member.domain.Member;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class AddBoardRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String password;

    @NotBlank
    private String content;

    private Long memberId;

    @NotBlank
    private String userName;

    private String authorName;

    public static Board toAddBoard(AddBoardRequest request, Member member) {
        if (request.authorName.isBlank()) {
            request.authorName = member.getUsername();
        }
        return new Board(request.title, request.password, request.content, request.authorName, member);
    }
}
