package com.smhrd.textminer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
public class LoginDTO {
	
	@NonNull
	private String id;
	@NonNull
	private String pw;
	private String mb_name;
	private String mb_email;
	private String mb_co;
	private String mb_call;
	private int admin;
	
}
