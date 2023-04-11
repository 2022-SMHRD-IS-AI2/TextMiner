package com.smhrd.textminer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@Component
public interface LoginMapper {
	
	@Select("select test from test")
	String selectSampleData();
	
	@Select("SELECT * FROM member WHERE id = #{mb_id}")
	<member> member selectMember(String id);
}
