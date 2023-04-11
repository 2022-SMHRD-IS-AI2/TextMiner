package com.smhrd.textminer.controller;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.textminer.dto.TestDTO;
import com.smhrd.textminer.mapper.TestMapper;





@Controller
public class UrlMappingCon {
	
	TestDTO dto = new TestDTO(null);
	
	
	//@Autowired TestMapper TestMapper;
	
	@GetMapping("/")
	public String root() {
		System.out.println("메인페이지 출력");
		return "main";
	}
	

	 @GetMapping("/signin")
	public String signView() {
		System.out.println("회원가입페이지 출력");
		return "signin";
	}
	
	
	 @RequestMapping("/login")
	 public String loginView() {
			System.out.println("로그인 페이지 출력");
			return "login";
		}
//	 public String loginView() {
//		 String a = TestMapper.selectSampleData();
//		 // dto.setTest(a);
//		 //model.addAttribute("sample",dto);
//		 System.out.println(a);	
//		 return "login";
//		 
//		 
//	 }
	 @GetMapping("/board")
		public String boardView() {
			System.out.println("모집공고 페이지 출력");
			return "board";
		}
	 @GetMapping("/conts")
		public String contsView() {
			System.out.println("세부내역페이지 출력");
			return "conts";
		}
	 
	 @GetMapping("/mypage")
		public String mypageView() {
			System.out.println("마이페이지 출력");
			return "mypage";
		}
	 
	 
	
	 
	
	
	
	
}
