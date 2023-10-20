package com.crizen.task2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crizen.task2.service.ReplyService;
import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService service;
	
	// 댓글등록
	@RequestMapping("replyWritePro.do")
	public String replyWritePro(ReplyVO reply, Model model) {
		log.info("replyWritePro()");
		
		int insertCount = service.registReply(reply);
		
		if(insertCount == 0) {
			model.addAttribute("msg", "등록 실패");
			return "fail_back";
		}
	
		return "redirect:/boardList.do";
	}
	
	// 댓글삭제
	@RequestMapping("replyDelete.do")
	public String replyDelete(@RequestParam int seq_reply, Model model) {
		log.info("boardDelete()");
		
		int deleteCount = service.removeReply(seq_reply);
		
		if(deleteCount == 0) {
			model.addAttribute("msg", "삭제 실패");
			return "fail_back";
		}
		
		return "redirect:/boardList.do";
	}
	
	// 댓글수정
	@RequestMapping("replyModifyPro.do")
	public String replyModifyPro(ReplyVO reply, Model model) {
		log.info("boardModifyPro()");
		System.out.println(reply);
		
		int updateCount = service.modifyReply(reply);
		
		if(updateCount == 0) {
			model.addAttribute("msg", "수정 실패");
			return "fail_back";
		}
		
		return "redirect:/boardList.do";
	}
}
