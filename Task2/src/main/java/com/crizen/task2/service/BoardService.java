package com.crizen.task2.service;

import java.util.List;

import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;

public interface BoardService {

	// 글등록
	int registBoard(BoardVO board);

	// 글목록
	List<BoardVO> getBoardList();

	// 글상세보기
	BoardVO getBoard(int seq_counsel);
	
	// 댓글목록
	List<ReplyVO> getReplyList(int seq_counsel);

	// 글삭제
	int removeBoard(int seq_counsel);

	// 글수정
	int modifyBoard(BoardVO board);

	

	
}
