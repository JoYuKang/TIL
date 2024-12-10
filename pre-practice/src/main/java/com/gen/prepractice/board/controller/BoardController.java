package com.gen.prepractice.board.controller;

import com.gen.prepractice.board.domain.Board;
import com.gen.prepractice.board.dto.request.AddBoardRequest;
import com.gen.prepractice.board.dto.response.GetAllBoardResponse;
import com.gen.prepractice.board.service.BoardService;
import com.gen.prepractice.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/{boardId}")
    public ResponseEntity getBoard(@PathVariable Long boardId) {
        return new ResponseEntity(boardService.getBoard(boardId), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<GetAllBoardResponse> getBoardList() {
        return new ResponseEntity(boardService.getAllBoard(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Long> createBoard(@RequestBody AddBoardRequest request, Member member) {

        Long boardId = boardService.addBoard(request, member);

        return new ResponseEntity(boardId, HttpStatus.CREATED);
    }
}
