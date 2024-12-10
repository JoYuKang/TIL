package com.gen.prepractice.board.repository;

import com.gen.prepractice.board.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface BoardRepository extends JpaRepository<Board, Long> {

    Optional<Board> findBoardById(Long boardId);

    List<Board> findAllByOrderByCreatedDateDesc();

    

}
