package com.crizen.task2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crizen.task2.service.BoardService;
import com.crizen.task2.vo.BoardVO;
import com.crizen.task2.vo.ReplyVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("main.do")
	public String main() {
		log.info("main()");
		
		return "main";
	}

	// 글등록 폼으로 이동
	@RequestMapping("boardWriteForm.do")
	public String boardWriteForm() {
		log.info("boardWrite()");
		
		return "board_write";
	}

	// 글등록
	@RequestMapping("boardWritePro.do")
	public String boardWritePro(BoardVO board, Model model) {
		log.info("boardWritePro()");
		System.out.println(board);
		
		int insertCount = service.registBoard(board);
		
		if(insertCount == 0) {
			model.addAttribute("msg", "등록 실패");
			return "fail_back";
		}
	
		return "redirect:/boardList.do";
	}

	
	// 글목록
	@RequestMapping("boardList.do")
	public String boardList(Model model) {
		log.info("boardList()");
		
		List<BoardVO> boardList = service.getBoardList();
		
		model.addAttribute("boardList", boardList);
		
		return "board_list";
	}

	// 글상세보기
	@RequestMapping("boardDetail.do")
	public String boardDetail(@RequestParam int seq_counsel, Model model) {
		log.info("boardDetail()");
		
		BoardVO board = service.getBoard(seq_counsel);
		List<ReplyVO> replyList = service.getReplyList(seq_counsel);
		model.addAttribute("board", board);
		model.addAttribute("replyList", replyList);
		
		System.out.println(replyList);
		
		return "board_detail";
	}

	// 글삭제
	@RequestMapping("boardDelete.do")
	public String boardDelete(@RequestParam int seq_counsel, Model model) {
		log.info("boardDelete()");
		
		int deleteCount = service.removeBoard(seq_counsel);
		
		if(deleteCount == 0) {
			model.addAttribute("msg", "삭제 실패");
			return "fail_back";
		}
		
		return "redirect:/boardList.do";
	}
	
	// 글수정 폼으로 이동
	@RequestMapping("boardModifyForm.do")
	public String boardModifyForm(@RequestParam int seq_counsel, Model model) {
		log.info("boardModifyForm()");
		
		BoardVO board = service.getBoard(seq_counsel);
		model.addAttribute("board", board);
		
		return "board_modify";
	}

	// 글수정
	@RequestMapping("boardModifyPro.do")
	public String boardModifyPro(BoardVO board, Model model) {
		log.info("boardModifyPro()");
		System.out.println(board);
		
		int updateCount = service.modifyBoard(board);
		
		if(updateCount == 0) {
			model.addAttribute("msg", "수정 실패");
			return "fail_back";
		}
		
		return "redirect:/boardList.do";
	}
		
	
	
	
}
