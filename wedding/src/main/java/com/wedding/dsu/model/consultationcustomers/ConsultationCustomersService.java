package com.wedding.dsu.model.consultationcustomers;

import java.util.List;

/**
 * 상담고객 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface ConsultationCustomersService {
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
