package com.smhrd.textminer.controller;

import java.io.IOException;

import com.smhrd.textminer.dto.LoginDTO;
import com.smhrd.textminer.mapper.LoginMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginCon extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String mb_id = request.getParameter("mb_id");
		String mb_pw = request.getParameter("mb_pw");
		
		System.out.println(mb_id + " " + mb_pw);
		
		LoginDTO dto = new LoginDTO(mb_id, mb_pw);
		System.out.println(dto);
		
		LoginDTO loginUser = LoginMapper.selectMember(dto);

		if(loginUser != null) {
			System.out.println("로그인 성공 !");
			HttpSession session = request.getSession();
			session.setAttribute("dto", loginUser);
			response.sendRedirect("main.jsp");
			
		} else {
			
			System.out.println("로그인 실패 !");
			
			
		}
	}
}
