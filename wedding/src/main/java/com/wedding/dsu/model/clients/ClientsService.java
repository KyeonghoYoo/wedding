package com.wedding.dsu.model.clients;

import java.util.List;

/**
 * 거래처 Service Interface
 * @author 유경호
 * @version 2019.08.05 v0.1
 * */
public interface ClientsService {
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
