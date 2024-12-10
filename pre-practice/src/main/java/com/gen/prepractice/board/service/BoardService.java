package com.gen.prepractice.board.service;

import com.gen.prepractice.board.dto.request.AddBoardRequest;
import com.gen.prepractice.board.dto.request.ModBoardRequest;
import com.gen.prepractice.board.dto.response.GetAllBoardResponse;
import com.gen.prepractice.board.dto.response.GetBoardResponse;
import com.gen.prepractice.member.domain.Member;

import java.util.List;

public interface BoardService {

    List<GetAllBoardResponse> getAllBoard();

    GetBoardResponse getBoard(Long boardId);

    Long addBoard(AddBoardRequest request, Member member);

    Long modBoard(ModBoardRequest request);

}
