package com.wedding.dsu.model.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ClientsMapper;

/**
 * 메뉴 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
@Service
public class ClientsServiceImpl implements ClientsService{
	@Autowired
	ClientsMapper ClientsMapper;

	/**
	 * 메뉴 삽입
	 * 
	 * @param clientsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertClient(ClientsVO clientsVO) throws Exception {
		return ClientsMapper.insertClient(clientsVO);
	}

	/**
	 * 메뉴 리스트 조회
	 * 
	 * @param clientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ClientsVO> selectClients(ClientsVO clientsVO) throws Exception {
		return ClientsMapper.selectClients(clientsVO);
	}

	/**
	 * 메뉴 상세 조회
	 * 
	 * @param clientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ClientsVO selectClient(ClientsVO clientsVO) throws Exception {
		return ClientsMapper.selectClient(clientsVO);
	}

	/**
	 * 메뉴 수정
	 * 
	 * @param clientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateClient(ClientsVO clientsVO) throws Exception {
		return ClientsMapper.updateClient(clientsVO);
	}

	/**
	 * 메뉴 삭제
	 * 
	 * @param clientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteClient(ClientsVO clientsVO) throws Exception {
		return ClientsMapper.deleteClient(clientsVO);
	}

}
