package com.crizen.task2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;
import com.crizen.task2.vo.SlangVO;

@Mapper
public interface ModifySlangMapper {

	// 비속어 리스트 조회
	List<SlangVO> selectSlangList();
	
	// 게시글 리스트 조회
	List<BoardVO> selectBoardList();

	// 답글 리스트 조회
	List<ReplyVO> selectReplyList();

	// 게시글 비속어 마스킹
	void updateBoardSlang(BoardVO board);

	// 답글 비속어 마스킹
	void updateReplySlang(ReplyVO reply);







}
