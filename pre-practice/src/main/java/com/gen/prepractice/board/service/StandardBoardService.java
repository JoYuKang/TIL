package com.gen.prepractice.board.service;

import com.gen.prepractice.board.domain.Board;
import com.gen.prepractice.board.dto.request.AddBoardRequest;
import com.gen.prepractice.board.dto.request.ModBoardRequest;
import com.gen.prepractice.board.dto.response.GetAllBoardResponse;
import com.gen.prepractice.board.dto.response.GetBoardResponse;
import com.gen.prepractice.board.repository.BoardRepository;
import com.gen.prepractice.board.service.exception.BoardNotFoundException;
import com.gen.prepractice.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StandardBoardService implements BoardService {

    private final BoardRepository boardRepository;

    // 다건 조회
    @Override
    public List<GetAllBoardResponse> getAllBoard() {

        return null;
    }

    // 단건 조회
    @Override
    public GetBoardResponse getBoard(Long boardId) {

        Board board = boardRepository.findBoardById(boardId).orElseThrow(() -> new BoardNotFoundException());

        GetBoardResponse getBoardResponse = new GetBoardResponse(board);

        return getBoardResponse;
    }
    @Override
    public Long addBoard(AddBoardRequest request, Member member) {

        Board addBoard = AddBoardRequest.toAddBoard(request, member);

        return boardRepository.save(addBoard).getId();
    }

    @Override
    public Long modBoard(ModBoardRequest request) {
        return null;
    }
}
