package com.crizen.task2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;
import com.crizen.task2.vo.SlangVO;

@Mapper
public interface ModifySlangMapper {

	// 비속어 리스트 조회
	List<SlangVO> selectSlangList();
	
	// 게시글 비속어 리스트 조회
	List<BoardVO> selectBoardSlangList(List<SlangVO> slangList);

	// 답글 비속어 리스트 조회
	List<ReplyVO> selectReplySlangList(List<SlangVO> slangList);

	// 게시글 비속어 마스킹
	void updateBoardSlang();

	// 답글 비속어 마스킹
	void updateReplySlang();


}
