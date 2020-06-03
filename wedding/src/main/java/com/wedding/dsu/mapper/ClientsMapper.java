package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.clients.ClientsVO;

/**
 * 거래처 Mapper
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
public interface ClientsMapper {
	/**
	 * 거래처 삽입
	 * @param ClientsVO
	 * @return 
	 * @throws Exception
	 */ 
	public int insertClient(ClientsVO clientsVO) throws Exception;
	
	/**
	 * 거래처 리스트 조회
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	public List<ClientsVO> selectClients(ClientsVO clientsVO) throws Exception;

	/**
	 * 거래처 상세 조회
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	public ClientsVO selectClient(ClientsVO clientsVO) throws Exception;

	/**
	 * 거래처 수정
	 * 
	 * @param ClientsVO
	 * @return
	 * @throws Exception
	 */
	public int updateClient(ClientsVO clientsVO) throws Exception;

	/**
	 * 거래처 삭제
	 * 
	 * @param ClientssVO
	 * @return
	 * @throws Exception
	 */
	public int deleteClient(ClientsVO clientsVO) throws Exception;
}
