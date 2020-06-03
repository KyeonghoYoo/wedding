package com.wedding.dsu.model.halls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.HallsMapper;

/**
 * 홀 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
@Service
public class HallsServiceImpl implements HallsService{
	@Autowired
	HallsMapper hallsMapper;

	/**
	 * 홀 삽입
	 * 
	 * @param HallsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertHalls(HallsVO hallsVO) throws Exception {
		return hallsMapper.insertHalls(hallsVO);
	}

	/**
	 * 홀 리스트 조회
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<HallsVO> selectHalls(HallsVO hallsVO) throws Exception {
		return hallsMapper.selectHalls(hallsVO);
	}

	/**
	 * 홀 상세 조회
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public HallsVO selectHall(HallsVO hallsVO) throws Exception {
		return hallsMapper.selectHall(hallsVO);
	}

	/**
	 * 홀 수정
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateHalls(HallsVO hallsVO) throws Exception {
		return hallsMapper.updateHalls(hallsVO);
	}

	/**
	 * 홀 삭제
	 * 
	 * @param HallsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteHalls(HallsVO hallsVO) throws Exception {
		return hallsMapper.deleteHalls(hallsVO);
	}

}
