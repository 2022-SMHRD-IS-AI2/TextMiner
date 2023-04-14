package com.smhrd.textminer.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.smhrd.textminer.dto.contsDTO;


@Component
public interface ContsMapper {
	@Select("SELECT * FROM board WHERE ${b_seq}")
	contsDTO conts(int contsDTO);
}
