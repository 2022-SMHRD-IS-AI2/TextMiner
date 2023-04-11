package com.smhrd.textminer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.smhrd.textminer.dto.LoginDTO;

@Mapper
@Repository
@Component
public interface LoginMapper {
	
	@Select("select test from test")
	String selectSampleData();
	
	@Select("SELECT * FROM member WHERE mb_id = #{mb_id} and mb_pw = #{mb_pw}")
	static
	LoginDTO selectMember(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
