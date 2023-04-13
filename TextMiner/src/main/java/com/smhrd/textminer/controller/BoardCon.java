package com.smhrd.textminer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.mapper.BoardMapper;
import com.smhrd.textminer.service.BoardServices;

@Controller
public class BoardCon {
	
//	@RequestMapping("/board")
//	public String boardList(Model model) throws Exception{
//		List<BoardVO> list = boardService.boardList();
//		model.addAllAttributes("list", list);
//		return "boardList";
//	}
	
}