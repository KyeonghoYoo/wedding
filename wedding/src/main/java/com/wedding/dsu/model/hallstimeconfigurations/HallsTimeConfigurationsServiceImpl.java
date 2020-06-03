package com.wedding.dsu.model.hallstimeconfigurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.HallsTimeConfigurationsMapper;

/**
 * 홀시간관리 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
@Service
public class HallsTimeConfigurationsServiceImpl implements HallsTimeConfigurationsService {
	@Autowired
	HallsTimeConfigurationsMapper HallsTimeConfigurationsMapper;

	/**
	 * 홀시간관리 삽입
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		return HallsTimeConfigurationsMapper.insertHallsTimeConfiguration(hallsTimeConfigurationsVO);
	}

	/**
	 * 홀시간관리 리스트 조회
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<HallsTimeConfigurationsVO> selectHallsTimeConfigurations(HallsTimeConfigurationsVO hallsTimeConfigurationsVO)
			throws Exception {
		return HallsTimeConfigurationsMapper.selectHallsTimeConfigurations(hallsTimeConfigurationsVO);
	}

	/**
	 * 홀시간관리 상세 조회
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public HallsTimeConfigurationsVO selectHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO)
			throws Exception {
		return HallsTimeConfigurationsMapper.selectHallsTimeConfiguration(hallsTimeConfigurationsVO);
	}

	/**
	 * 홀시간관리 수정
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		return HallsTimeConfigurationsMapper.updateHallsTimeConfiguration(hallsTimeConfigurationsVO);
	}

	/**
	 * 홀시간관리 삭제
	 * 
	 * @param hallsTimeConfigurationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteHallsTimeConfiguration(HallsTimeConfigurationsVO hallsTimeConfigurationsVO) throws Exception {
		return HallsTimeConfigurationsMapper.deleteHallsTimeConfiguration(hallsTimeConfigurationsVO);
	}

}
