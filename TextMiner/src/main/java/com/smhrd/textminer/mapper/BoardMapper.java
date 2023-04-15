package com.smhrd.textminer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import com.smhrd.textminer.dto.BoardDTO;
import com.smhrd.textminer.dto.JoinDTO;
import com.smhrd.textminer.dto.LoginDTO;

 
@Component
public interface BoardMapper {
	
	// https://dlgkstjq623.tistory.com/305 참고했음
	
	
	// 게시글 번호의 내림차순으로 게시판 검색 --> ORDER BY b_seq DESC
	@Select("SELECT * FROM board ORDER BY b_seq DESC")
	public List<BoardDTO> selectBoardList();

	}
	
//	 해당 게시글 번호에 맞는 게시글의 모든 요소를 검색
//	@Select("SELECT * FROM board WHERE b_sqe=#{b_sqe}")
//	public BoardDTO view(int b_sqe);
	
