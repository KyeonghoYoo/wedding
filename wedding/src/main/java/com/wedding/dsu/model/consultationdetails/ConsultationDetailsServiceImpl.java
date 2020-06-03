package com.wedding.dsu.model.consultationdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ConsultationDetailsMapper;

/**
 * 상담내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
@Service
public class ConsultationDetailsServiceImpl implements ConsultationDetailsService {
	@Autowired
	ConsultationDetailsMapper consultationDetailsMapper;

	/**
	 * 상담내역 삽입
	 * 
	 * @param consultationDetailsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		return consultationDetailsMapper.insertConsultationDetail(consultationDetailsVO);
	}

	/**
	 * 상담내역 리스트 조회
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ConsultationDetailsVO> selectConsultationDetails(ConsultationDetailsVO consultationDetailsVO)
			throws Exception {
		return consultationDetailsMapper.selectConsultationDetails(consultationDetailsVO);
	}

	/**
	 * 상담내역 상세 조회
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ConsultationDetailsVO selectConsultationDetail(ConsultationDetailsVO consultationDetailsVO)
			throws Exception {
		return consultationDetailsMapper.selectConsultationDetail(consultationDetailsVO);
	}

	/**
	 * 상담내역 수정
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		return consultationDetailsMapper.updateConsultationDetail(consultationDetailsVO);
	}

	/**
	 * 상담내역 삭제
	 * 
	 * @param consultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception {
		return consultationDetailsMapper.deleteConsultationDetail(consultationDetailsVO);
	}

}
