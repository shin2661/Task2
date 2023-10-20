package com.crizen.task2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crizen.task2.mapper.BoardMapper;
import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardMapper mapper;

	// 글등록
	public int registBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}

	// 글목록
	public List<BoardVO> getBoardList() {
		return mapper.selectBoardList();
	}

	// 글상세보기
	public BoardVO getBoard(int seq_counsel) {
		return mapper.selectBoard(seq_counsel);
	}
	
	// 댓글목록
	public List<ReplyVO> getReplyList(int seq_counsel) {
		return mapper.selectReplyList(seq_counsel);
	}
		

	// 글삭제
	public int removeBoard(int seq_counsel) {
		return mapper.deleteBoard(seq_counsel);
	}

	// 글수정
	public int modifyBoard(BoardVO board) {
		return mapper.updateBoard(board);
	}

	
	
	
}
