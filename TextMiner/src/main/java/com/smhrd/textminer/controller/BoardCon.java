package com.smhrd.textminer.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.mariadb.jdbc.plugin.authentication.standard.ed25519.math.ed25519.Ed25519LittleEndianEncoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.mapper.BoardMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;




@Controller
public class BoardCon{
   
   
   @Autowired
   private BoardMapper boardMapper;
   
   @RequestMapping("/board")
   public String BoardList(HttpServletRequest request) {
	   
	  // 페이지 관련 설정
	  String pageParam = request.getParameter("page");
	  int page =1; // 초기값 1설정
	  if(pageParam != null) {
		  page = Integer.parseInt(pageParam);
	  }
	  int limit = 10;
	  int offset = (page-1)*limit;
	  int totalCount = boardMapper.getBoardCount();
	  int totalPage = (totalCount % limit ==0) ? totalCount / limit : totalCount / limit + 1; 
	  
	  List<BoardDTO> boardList = boardMapper.selectBoardList(offset, limit);
      
      HttpSession session = request.getSession();
      
      session.setAttribute("list", boardList);
      
      session.setAttribute("cnt", totalCount); // 전체 데이터 갯수
      session.setAttribute("currentPage", page); // 현재페이지
      session.setAttribute("totalPage", totalPage); // 전체 페이지 갯수
      session.setAttribute("limit", limit); // 10 
      session.setAttribute("offset", offset); // 페이지 수
      
      System.out.println("offset :" + offset +"\t limit : " + limit);
      System.out.println("게시물 10개 출력" + boardList);
      System.out.println("총 게시물 수 구하기 "+ totalCount);
      System.out.println("현재 페이지"+ page);
     
      // 키워드 리스트 생성
	  List<String> keyList = new ArrayList<>(Arrays.asList("AI","창업지원","환경","메타버스","제조업","에너지","패션","농수산","시스템반도체","유통/물류","로봇","통신/보안","빅데이터","클라우드","광고/마케팅","스마트헬스케어","교육","예술/콘텐츠","모빌리티","뷰티","블록체인","핀테크","게임","헬스케어","바이오"));
	  // 랜덤 수 뽑아내기 Collections의 shuffle 함수
	  Collections.shuffle(keyList);
	  List<String> randomKeys = keyList.subList(0, 5);
	  System.out.println(randomKeys);
	  session.setAttribute("ranKeys", randomKeys);
	  
	   
      
      
      return "board";
      
   }
   
   
   
   
   }
   
   
   
