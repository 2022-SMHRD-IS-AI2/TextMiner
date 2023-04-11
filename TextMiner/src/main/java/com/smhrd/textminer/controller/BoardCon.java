package com.smhrd.textminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class BoardCon {
	
	
@Controller
@RequestMapping("/board")
	public class UserController {
	 
@GetMapping("/board")
	 public String showRegistrationForm() {
	        return "registration";
	    }
	}

}
