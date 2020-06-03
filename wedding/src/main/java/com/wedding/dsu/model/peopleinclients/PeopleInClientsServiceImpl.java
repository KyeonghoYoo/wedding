package com.wedding.dsu.model.peopleinclients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.PeopleInClientsMapper;

/**
 * 거래처 직원 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
@Service
public class PeopleInClientsServiceImpl implements PeopleInClientsService {
	@Autowired
	PeopleInClientsMapper peopleInClientsMapper;

	/**
	 * 거래처 직원 삽입
	 * 
	 * @param PeopleInClientsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertPeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		return peopleInClientsMapper.insertPeopleInClient(peopleInClientsVO);
	}

	/**
	 * 거래처 직원 리스트 조회
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PeopleInClientsVO> selectPeopleInClients(PeopleInClientsVO peopleInClientsVO)
			throws Exception {
		return peopleInClientsMapper.selectPeopleInClients(peopleInClientsVO);
	}

	/**
	 * 거래처 직원 상세 조회
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PeopleInClientsVO selectPeopleInClient(PeopleInClientsVO peopleInClientsVO)
			throws Exception {
		return peopleInClientsMapper.selectPeopleInClient(peopleInClientsVO);
	}

	/**
	 * 거래처 직원 수정
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updatePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		return peopleInClientsMapper.updatePeopleInClient(peopleInClientsVO);
	}

	/**
	 * 거래처 직원 삭제
	 * 
	 * @param PeopleInClientsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deletePeopleInClient(PeopleInClientsVO peopleInClientsVO) throws Exception {
		return peopleInClientsMapper.deletePeopleInClient(peopleInClientsVO);
	}

}
