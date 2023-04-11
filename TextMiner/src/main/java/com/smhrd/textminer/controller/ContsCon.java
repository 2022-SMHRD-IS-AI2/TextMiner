package com.smhrd.textminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class ContsCon {
	
	
@Controller
@RequestMapping("/conts")
	public class UserController {
	 
@GetMapping("/conts")
	 public String showRegistrationForm() {
	        return "registration";
	    }
	}

}
