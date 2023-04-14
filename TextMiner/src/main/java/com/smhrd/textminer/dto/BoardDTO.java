package com.smhrd.textminer.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoardDTO {
	
	private int b_seq;
	private String b_keyword;
	private String b_title;
	private String b_or;
	private String b_sor;
	private String b_conts;
	private String b_region;
	private String b_url;
	private Date b_date;

}
