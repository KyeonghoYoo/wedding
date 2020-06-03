package com.wedding.dsu.model.paymentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.PaymentDetailsMapper;

/**
 * 입금내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {
	@Autowired
	PaymentDetailsMapper paymentDetailsMapper;

	/**
	 * 입금내역 삽입
	 * 
	 * @param paymentDetailsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertPaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception {
		return paymentDetailsMapper.insertPaymentDetail(paymentDetailsVO);
	}

	/**
	 * 입금내역 리스트 조회
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<PaymentDetailsVO> selectPaymentDetails(PaymentDetailsVO paymentDetailsVO)
			throws Exception {
		return paymentDetailsMapper.selectPaymentDetails(paymentDetailsVO);
	}

	/**
	 * 입금내역 상세 조회
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PaymentDetailsVO selectPaymentDetail(PaymentDetailsVO paymentDetailsVO)
			throws Exception {
		return paymentDetailsMapper.selectPaymentDetail(paymentDetailsVO);
	}

	/**
	 * 입금내역 수정
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updatePaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception {
		return paymentDetailsMapper.updatePaymentDetail(paymentDetailsVO);
	}

	/**
	 * 입금내역 삭제
	 * 
	 * @param paymentDetailsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deletePaymentDetail(PaymentDetailsVO paymentDetailsVO) throws Exception {
		return paymentDetailsMapper.deletePaymentDetail(paymentDetailsVO);
	}

}
