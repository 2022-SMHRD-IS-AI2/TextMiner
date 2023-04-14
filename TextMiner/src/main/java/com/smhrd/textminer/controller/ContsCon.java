package com.smhrd.textminer.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.smhrd.textminer.dto.contsDTO;
import com.smhrd.textminer.mapper.ContsMapper;

@Controller
public class ContsCon {
	
	@Autowired
	ContsMapper ContsMapper;
	HttpServletResponse response; 
	
	@RequestMapping("/conts")
	public String servletReqeust(HttpServletRequest httpRequest) throws IOException {
		System.out.println("다 돌음1");
//		Integer b_seq = Integer.parseInt(httpRequest.getParameter("b_seq"));
//		String b_keyword = httpRequest.getParameter("b_keyword").toString();
//		String b_title = httpRequest.getParameter("b_title").toString();
//		String b_region = httpRequest.getParameter("b_region").toString();
//		String b_url = httpRequest.getParameter("b_url =").toString();
//		String b_or = httpRequest.getParameter("b_or").toString();
//		String b_sor = httpRequest.getParameter("b_sor").toString();
//		String b_conts = httpRequest.getParameter("b_conts").toString();
//		String b_date = httpRequest.getParameter("b_date").toString();
		
		contsDTO conts = new contsDTO();
		ContsMapper.conts(1);
		
		
		HttpSession session = httpRequest.getSession();
		session.setAttribute("conts", conts);
		
		System.out.println("다 돌음2");


		return "conts";
}
}	
	