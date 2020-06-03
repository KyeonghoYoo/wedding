package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.peopleinclients.PeopleInClientsVO;

/**
 * 거래처 직원 Mapper
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
public interface PeopleInClientsMapper {
	/**
	 * 거래처 직원 등록
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	public int insertPeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception;

	/**
	 * 거래처 직원 리스트 조회
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	public List<PeopleInClientsVO> selectPeopleInClients(PeopleInClientsVO peopleInClientsVO) throws Exception;

	/**
	 * 거래처 직원 상세 조회
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	public PeopleInClientsVO selectPeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception;

	/**
	 * 거래처 직원 수정
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	public int updatePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception;

	/**
	 * 거래처 직원 삭제
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	public int deletePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception;
}
