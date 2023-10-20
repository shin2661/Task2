package com.crizen.task2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.*;
import org.springframework.stereotype.Service;

import com.crizen.task2.mapper.RemoveOvertimeMapper;
import com.crizen.task2.vo.BoardVO;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("removeOvertimeService")
public class RemoveOvertimeServiceImpl implements RemoveOvertimeService {

	@Autowired
	private RemoveOvertimeMapper mapper;

	@Override
	public void removeOvertime() {
		System.out.println("----------------------------------RemoveOvertimeServiceImpl-----------------------------------------");
		List<BoardVO> removeList = mapper.selectRemoveList();
		
		System.out.println(removeList);
		
		for(BoardVO board : removeList) {
			mapper.removeOvertime(board.getSeq_counsel());
		}
		
		log.info("========== 게시물 삭제 ==========");
		log.info("게시물 : " + removeList.size() + "개 삭제 완료");
		log.info("=================================");
		
	}
	
//	private final RemoveOvertimeMapper mapper;
//	
//	public RemoveOvertimeServiceImpl(RemoveOvertimeMapper mapper) {
//		this.mapper = mapper;
//	}
	

}
