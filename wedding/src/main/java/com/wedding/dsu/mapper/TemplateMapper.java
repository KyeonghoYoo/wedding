package com.wedding.dsu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

public interface TemplateMapper {
	/*
	 * Template API
	 * @param String
	 * @return 쿼리된 row
	 * @throws Exception
	 */
	public List<Object> somethingList(String str) throws Exception;
	
	/*
	 * Template Insert
	 * @param String
	 * @return 추가된 정보 갯수
	 * @throws Exception
	 */
	public int somethinInsert(String str) throws Exception;
	
	/*
	 * Template Update
	 * @param String
	 * @return 업데이트된 row 갯수
	 * @throws Exception
	 * 개수가 0 이면 업데이트된 row가 없는 경우므로 return checkNum > 0; boolean 형식으로 결과를 반환해주면 됨
	 */
	public int somethinUpdate(String str) throws Exception;
	
	/*
	 * Template Delete
	 * @param String
	 * @return 삭제된 row 갯수
	 * @throws Exception
	 */
	@Delete("delte from sometable where someid = #{str}")
	public int somethinDelete(String str) throws Exception;
}
