package com.gen.prepractice.board.dto.response;

import com.gen.prepractice.board.domain.Board;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class GetBoardResponse {

    private String title;

    private String userName;

    private String content;

    private String authorName;

    private LocalDateTime createDate;

    public GetBoardResponse(Board board) {
        this.title = board.getTitle();
        this.userName = board.getMemberName();
        this.content = board.getContent();
        this.authorName = board.getAuthorName();
        this.createDate = board.getCreatedDate();
    }
}
