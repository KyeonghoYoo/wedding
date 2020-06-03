package com.wedding.dsu.model.halls;

import java.util.List;

/**
 * 홀 Service Interface
 * @author 유경호
 * @version 2019.08.05 v0.1
 * */
public interface HallsService {
	/**
	 * 홀 삽입
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
	 * @param HallssVO
	 * @return
	 * @throws Exception
	 */
	public int deleteHalls(HallsVO hallsVO) throws Exception;
}
