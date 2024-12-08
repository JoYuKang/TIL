package com.gen.prepractice.board.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gen.prepractice.board.domain.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class GetAllBoardResponse {

    private String title;

    private String userName;

    private String content;

    private String authorName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime createDate;

    public GetAllBoardResponse(Board board) {
        this.title = board.getTitle();
        this.userName = board.getMemberName();
        this.content = board.getContent();
        this.authorName = board.getAuthorName();
        this.createDate = board.getCreatedDate();
    }

}
