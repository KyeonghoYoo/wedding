package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.paymentdetails.PaymentDetailsVO;

/**
 * 결제내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1.2
 */
public interface PaymentDetailsMapper {
	/**
	 * 결제내역 등록
	 * 
	 * @param PaymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int insertPaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception;

	/**
	 * 결제내역 리스트 조회
	 * 
	 * @param PaymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	public List<PaymentDetailsVO> selectPaymentDetails(PaymentDetailsVO paymentDetailsVO) throws Exception;

	/**
	 * 결제내역 상세 조회
	 * 
	 * @param PaymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	public PaymentDetailsVO selectPaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception;

	/**
	 * 결제내역 수정
	 * 
	 * @param PaymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int updatePaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception;

	/**
	 * 결제내역 삭제
	 * 
	 * @param PaymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	public int deletePaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception;
}
