package com.smhrd.textminer.controller;

import java.io.IOException;

import com.smhrd.textminer.dto.LoginDTO;
import com.smhrd.textminer.mapper.LoginMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginCon {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String mb_id = request.getParameter("mb_id");
		String mb_pw = request.getParameter("mb_pw");
		
		LoginDTO dto = new LoginDTO(mb_id, mb_pw);
		
		LoginMapper.selectMember(dto);
	    
		if(dto != null) {
			System.out.println("로그인 성공 !");
			
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			response.sendRedirect("main.jsp");
			
		} else {
			
			System.out.println("로그인 실패 !");
			
		}
	}
}
