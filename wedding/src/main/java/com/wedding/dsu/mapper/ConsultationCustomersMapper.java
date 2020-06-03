package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.consultationcustomers.ConsultationCustomersSearchVO;
import com.wedding.dsu.model.consultationcustomers.ConsultationCustomersVO;

/**
 * 상담고객 Mapper
 * @author 유경호
 * @version 2019.08.09 v0.1
 * */
public interface ConsultationCustomersMapper {
	/**
	 * 상담고객 등록
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int insertConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception;
	
	/**
	 * 상담고객 리스트 조회
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public List<ConsultationCustomersVO> selectConsultationCustomers(ConsultationCustomersSearchVO consultationCustomersSearchVO) throws Exception;

	/**
	 * 상담고객 조회
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public ConsultationCustomersVO selectConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception;

	/**
	 * 상담고객 수정
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int updateConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception;
	/**
	 * 상담고객 삭제
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int deleteConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception;
}
