package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.halls.HallsVO;

/**
 * 홀 Mapper
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
public interface HallsMapper {
	/**
	 * 홀 등록
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	public int insertHalls(HallsVO hallsVO) throws Exception;

	/**
	 * 홀 리스트 조회
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	public List<HallsVO> selectHalls(HallsVO hallsVO) throws Exception;

	/**
	 * 홀 상세 조회
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	public HallsVO selectHall(HallsVO hallsVO) throws Exception;

	/**
	 * 홀 수정
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	public int updateHalls(HallsVO hallsVO) throws Exception;

	/**
	 * 홀 삭제
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteHalls(HallsVO hallsVO) throws Exception;
}
