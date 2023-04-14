package com.smhrd.textminer.controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.mapper.BoardMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@Controller

public class BoardCon{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@RequestMapping("/board")
	public @ResponseBody List<BoardDTO> selectBoardList(){
		List<BoardDTO> list = boardMapper.selectBoardList();
		return list;
	
		
		
		
//	어려워 시도
//	public String boardTest(Model model) {
//		model.addAllAttributes("selectBoardAll",boardMapper.selectBoardAll());
//		return "/board";
//	}
//	
	
	
	
	
	
	
	
	
	
	
//	기존방법
//	@Autowired
//	BoardMapper boardMapper;
//	HttpServletResponse response;
//	
//	@RequestMapping("/board")
//	public String servletRequest(HttpServletRequest httpRequest) throws IOException{
//		System.out.println("보드매퍼 오는지?");
//		BoardDTO board = new BoardDTO();
//		boardMapper.allBoard(board);
//		
//		
//		HttpSession session = httpRequest.getSession();
//		session.setAttribute("board", board);
//		
//		System.out.println("보드매퍼2 오는지?");
//		
//		return "board";
		
		
	}
	
	
	
}

