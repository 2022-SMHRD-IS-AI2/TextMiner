package com.smhrd.textminer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.dto.MainDTO;
import com.smhrd.textminer.mapper.mainMapper;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainCon {
	
	@Autowired
	private mainMapper mainMapper;
	
	@RequestMapping("/main_loginsuccess")
	// @PostMapping("/")
	public String servletReqeust(HttpServletRequest request) {
		
			List<MainDTO> MainList = mainMapper.selectMainList();
			System.out.println("*");
			
			// MainDTO mainDTO = new MainDTO();

			/*
			 * mainDTO.setB_title(request.getParameter("b_title"));
			 * mainDTO.setB_sdate(request.getParameter("b_sdate"));
			 * mainDTO.setB_edate(request.getParameter("b_edate"));
			 * mainDTO.setB_conts(request.getParameter("b_conts"));
			 */
			
			// mainDTO.addAttribute("mainDTO", mainDTO);
			
			HttpSession session = request.getSession();
		      
		    session.setAttribute("list", MainList);
			
			return "main_loginsuccess";
			
			 
}
/*
 * public String confirmId(MainDTO mainDTO) {
 * 
 * return "mainDTO/main";
 * 
 * }
 */
}
