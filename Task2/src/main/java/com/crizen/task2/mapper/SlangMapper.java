package com.crizen.task2.mapper;

import org.apache.ibatis.annotations.*;

import com.crizen.task2.vo.*;

@Mapper
public interface SlangMapper {
	
	// 비속어중복확인
	int selectExistSlang(String slang);

	// 비속어등록
	int insertSlang(SlangVO slang);


}
