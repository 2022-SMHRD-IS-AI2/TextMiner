package com.smhrd.textminer.controller;

import java.io.IOException;

import com.smhrd.textminer.dto.LoginDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginCon {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		LoginDTO dto = new LoginDTO(id, pw);
		
		
	}
}
