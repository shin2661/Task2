package com.crizen.task2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crizen.task2.mapper.ModifySlangMapper;
import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;
import com.crizen.task2.vo.SlangVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("modifySlangService")
public class ModifySlangServiceImpl implements ModifySlangService {

	@Autowired
	private ModifySlangMapper mapper;
	
	@Override
	public void modifySlang() {
		
		List<SlangVO> slangList = mapper.selectSlangList();
		System.out.println(slangList);
		
		List<BoardVO> boardSlangList = mapper.selectBoardSlangList(slangList);
		List<ReplyVO> replySlangList = mapper.selectReplySlangList(slangList);
		System.out.println(boardSlangList);
		System.out.println(replySlangList);
		
		mapper.updateBoardSlang();
		mapper.updateReplySlang();
	}

}
