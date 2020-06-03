package com.wedding.dsu.model.hallstimeconfigurations;

import java.util.List;

/**
 * 홀시간관리 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
public interface HallsTimeConfigurationsService {
	/**
	 * 홀시간관리 등록
	 * 
	 * @param HallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	public int insertHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception;

	/**
	 * 홀시간관리 리스트 조회
	 * 
	 * @param HallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	public List<HallsTimeConfigurationsVO> selectHallsTimeConfigurations(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception;

	/**
	 * 홀시간관리 상세 조회
	 * 
	 * @param HallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	public HallsTimeConfigurationsVO selectHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception;

	/**
	 * 홀시간관리 수정
	 * 
	 * @param HallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	public int updateHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception;

	/**
	 * 홀시간관리 삭제
	 * 
	 * @param HallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception;
}
