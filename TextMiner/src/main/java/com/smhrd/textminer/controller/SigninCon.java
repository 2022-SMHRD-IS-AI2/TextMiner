package com.smhrd.textminer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.smhrd.textminer.dto.JoinDTO;
import com.smhrd.textminer.mapper.JoinMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.Getter;
import lombok.Setter;

@Controller
@Getter
@Setter
public class SigninCon {

	// HttpServletRequest service;

	@Autowired
	JoinMapper joinMapper;
	
	HttpServletResponse response;

	// JoinDTO dto = new JoinDTO(null, null, null, null, null, null);

	// @PostMapping("/main")
	// public String sampleView(@RequestBody HashMap<String, String> map) {
	// String id = map.get("mb_id");
	// System.out.println(id);
	// String a = JoinMapper.selectJoinData();
	// dto.setTest(a);
	// model.addAttribute("sample", dto);
	// System.out.println(a);
	// return "main";
	// }
	@PostMapping("/")
	public String servletReqeust(HttpServletRequest httpRequest) {
		String mb_id = httpRequest.getParameter("mb_id").toString();
		String mb_pw = httpRequest.getParameter("mb_pw").toString();
		String mb_name = httpRequest.getParameter("mb_name").toString();
		String mb_email = httpRequest.getParameter("mb_email").toString();
		String mb_firm = httpRequest.getParameter("mb_firm").toString();
		String mb_call = httpRequest.getParameter("mb_call").toString();
		String mb_key1 = httpRequest.getParameter("mb_key1");
		String mb_key2 = httpRequest.getParameter("mb_key2");
		String mb_key3 = httpRequest.getParameter("mb_key3");
		String mb_region = httpRequest.getParameter("mb_region");
		
		System.out.println(mb_id);
		
		JoinDTO dto = new JoinDTO(mb_id, mb_pw, mb_name, mb_email, mb_firm, mb_call, mb_key1, mb_key2, mb_key3, mb_region);

		joinMapper.InsertJoinData(dto);
		
		return "main";

	}

}
