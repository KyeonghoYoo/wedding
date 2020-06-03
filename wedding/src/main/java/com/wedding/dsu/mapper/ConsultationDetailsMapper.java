package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;

/**
 * 상담내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface ConsultationDetailsMapper {
	/**
	 * 상담내역 등록
	 * 
	 * @param ConsultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int insertConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception;

	/**
	 * 상담내역 리스트 조회
	 * 
	 * @param ConsultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	public List<ConsultationDetailsVO> selectConsultationDetails(ConsultationDetailsVO consultationDetailsVO) throws Exception;

	/**
	 * 상담내역 상세 조회
	 * 
	 * @param ConsultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	public ConsultationDetailsVO selectConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception;

	/**
	 * 상담내역 수정
	 * 
	 * @param ConsultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int updateConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception;

	/**
	 * 상담내역 삭제
	 * 
	 * @param ConsultationDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int deleteConsultationDetail(ConsultationDetailsVO consultationDetailsVO) throws Exception;
}
