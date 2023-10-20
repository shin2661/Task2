package com.crizen.task2.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.*;

import com.crizen.task2.vo.BoardVO;

@Mapper
@Repository
public interface RemoveOvertimeMapper {

	// 삭제할 게시물 리스트
	List<BoardVO> selectRemoveList();

	// 게시물삭제
	void removeOvertime(int seq_counsel);

}
