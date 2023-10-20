package com.crizen.task2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;

@Mapper
public interface BoardMapper {

	// 글등록
	int insertBoard(BoardVO board);

	// 글목록
	List<BoardVO> selectBoardList();

	// 글상세보기
	BoardVO selectBoard(int seq_counsel);
	
	// 댓글목록
	List<ReplyVO> selectReplyList(int seq_counsel);

	// 글삭제
	int deleteBoard(int seq_counsel);

	// 글수정
	int updateBoard(BoardVO board);

	

}
