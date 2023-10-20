package com.crizen.task2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crizen.task2.mapper.ReplyMapper;
import com.crizen.task2.vo.ReplyVO;

@Service("replyService")
public class ReplyServiceImpe implements ReplyService {

	@Autowired
	private ReplyMapper mapper;
	
	// 댓글등록
	public int registReply(ReplyVO reply) {
		return mapper.insertReply(reply);
	}

	// 댓글삭제
	public int removeReply(int seq_reply) {
		return mapper.deleteReply(seq_reply);
	}

	// 댓글수정
	public int modifyReply(ReplyVO reply) {
		return mapper.updateReply(reply);
	}

}
