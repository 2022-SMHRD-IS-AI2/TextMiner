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



public class TestCon {
	
	TestDTO dto = new TestDTO(null); 
	
	
	@Autowired TestMapper TestMapper;
	
	@GetMapping("/")
	public String root() {
		System.out.println("메인페이지 출력");
		return "main";
	}
	
	@GetMapping("/what")
	public String sec() {
		System.out.println("다음");
		return "dbtest";
	}
	
	
	 @RequestMapping("/login")
	 public String sampleView(Model model) {
		 String a = TestMapper.selectSampleData();
		 dto.setTest(a);
		 model.addAttribute("sample",dto);
		 System.out.println(a);
		 return "login";
	 }
	 
	
	
	
	
}
