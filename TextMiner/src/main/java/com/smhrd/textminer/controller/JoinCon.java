package com.smhrd.textminer.controller;

import java.util.HashMap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.textminer.dto.JoinDTO;
import com.smhrd.textminer.dto.TestDTO;
import com.smhrd.textminer.mapper.TestMapper;

import jakarta.servlet.http.HttpServletRequest;


import com.smhrd.textminer.mapper.JoinMapper;



@Controller

public class JoinCon {
	
	//HttpServletRequest service;
	
	
	@Autowired
	JoinMapper joinMapper;

	//JoinDTO dto = new JoinDTO(null, null, null, null, null, null);

	//@PostMapping("/main")
	//public String sampleView(@RequestBody HashMap<String, String> map) {
	//	String id = map.get("mb_id");
	//	System.out.println(id);
		//String a = JoinMapper.selectJoinData();
		//dto.setTest(a);
		//model.addAttribute("sample", dto);
		//System.out.println(a);
	//	return "main";
	//}
	@PostMapping("/main")
	public void servletReqeust(HttpServletRequest httpRequest) {
	    String mb_id = httpRequest.getParameter("mb_id").toString();
	    String mb_pw = httpRequest.getParameter("mb_pw").toString();
	    String mb_name = httpRequest.getParameter("mb_name").toString();
	    String mb_email = httpRequest.getParameter("mb_email").toString();
	    String mb_co = httpRequest.getParameter("mb_co").toString();
	    String mb_call = httpRequest.getParameter("mb_call").toString();
	    
	    System.out.println(mb_id);
	    JoinDTO dto = new JoinDTO(mb_id, mb_pw, mb_name, mb_email, mb_co, mb_call);
	    
	    joinMapper.InsertJoinData(dto);
	    
	    
	    
	    
	}
	
	
}

