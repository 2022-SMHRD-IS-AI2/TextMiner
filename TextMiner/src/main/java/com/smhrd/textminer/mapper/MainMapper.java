package com.smhrd.textminer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.smhrd.textminer.dto.MainDTO;

@Component
public interface MainMapper {

		// @Select("Select * From board WHERE b_title = #{b_title} AND DATE_FORMAT(b_sdate, '%Y-%m-%d') = #{b_sdate} AND DATE_FORMAT(b_edate, '%Y-%m-%d') = #{b_edate} AND b_conts = #{b_conts}")
		// @Select("Select * From board WHERE b_title = #{b_title} AND b_sdate = #{b_sdate} AND b_edate = #{b_edate} AND b_conts = #{b_conts}")
		@Select("SELECT * FROM board LIMIT 8")
		public List<MainDTO> selectMainList();
		// public List<MainDTO> selectMainList(@Param("b_title") String b_title, @Param("b_sdate") String b_sdate, @Param("b_edate") String b_edate, @Param("b_conts") String b_conts);
		// 조건에 따른 게시글 리스트 조회
		
		// 모든 게시글 리스트 조회
		
		// public List<MainDTO> selectMainList();
}
