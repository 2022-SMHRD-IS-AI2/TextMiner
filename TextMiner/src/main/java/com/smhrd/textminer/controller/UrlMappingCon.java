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
	
	
	@Autowired TestMapper TestMapper;
	
	@GetMapping("/")
	public String root() {
		System.out.println("메인페이지 출력");
		return "main";
	}
	
	 @GetMapping("/signin")
	public String joinView() {
		System.out.println("되나?");
		return "signin";
	}
	
	
	 @RequestMapping("/login")
	 public String sampleView() {
		 //String a = TestMapper.selectSampleData();
		 // dto.setTest(a);
		 //model.addAttribute("sample",dto);
		 //System.out.println(a);
		 return "login";
	 }
	 
	
	 
	
	
	
	
}
