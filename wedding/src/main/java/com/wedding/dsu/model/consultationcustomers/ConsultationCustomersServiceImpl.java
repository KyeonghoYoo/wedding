package com.wedding.dsu.model.consultationcustomers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ConsultationCustomersMapper;
import com.wedding.dsu.mapper.ConsultationDetailsMapper;
import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;
import com.wedding.dsu.model.paymentdetails.PaymentDetailsVO;

/**
 * 계약고객 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.09 v0.1
 */
@Service
public class ConsultationCustomersServiceImpl implements ConsultationCustomersService {
	@Autowired
	private ConsultationCustomersMapper consultationCustomersMapper;
	
	@Autowired
	private ConsultationDetailsMapper consultationDetailsMapper;
	/**
	 * 계약고객 삽입
	 * 
	 * @param ConsultationCustomersVO consultationCustomersVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception {
		if (consultationCustomersMapper.insertConsultationCustomer(consultationCustomersVO) == 0) {
			return 0;
		}
		if (consultationCustomersVO.getConsultationDetailsVOs() != null) {
			List<ConsultationDetailsVO> consultationDetailsVOs= consultationCustomersVO.getConsultationDetailsVOs();
			for (ConsultationDetailsVO consultationDetailsVO : consultationDetailsVOs) {
				consultationDetailsVO.setContractCustomers_ID(consultationCustomersVO.getId());
				consultationDetailsMapper.insertConsultationDetail(consultationDetailsVO);
			}
		}
		return 1;
	}

	/**
	 * 계약고객 리스트 조회
	 * 
	 * @param consultationCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ConsultationCustomersVO> selectConsultationCustomers(ConsultationCustomersSearchVO consultationCustomersSearchVO)
			throws Exception {
		List<ConsultationCustomersVO> ConsultationCustomersVOs = consultationCustomersMapper
				.selectConsultationCustomers(consultationCustomersSearchVO);

		return ConsultationCustomersVOs;
	}

	/**
	 * 계약고객 상세 조회
	 * 
	 * @param ConsultationCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ConsultationCustomersVO selectConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception {
		ConsultationCustomersVO consultationCustomersVOs = consultationCustomersMapper.selectConsultationCustomer(consultationCustomersVO);
	
		ConsultationDetailsVO consultationDetailsVO = new ConsultationDetailsVO();
		consultationDetailsVO.setContractCustomers_ID(consultationCustomersVOs.getId());
		consultationCustomersVOs
				.setConsultationDetailsVOs(consultationDetailsMapper.selectConsultationDetails(consultationDetailsVO));

		return consultationCustomersVOs;
	}

	/**
	 * 계약고객 수정
	 * 
	 * @param ConsultationCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception {
		return consultationCustomersMapper.updateConsultationCustomer(consultationCustomersVO);
	}

	/**
	 * 계약고객 삭제
	 * 
	 * @param ConsultationCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteConsultationCustomer(ConsultationCustomersVO consultationCustomersVO) throws Exception {
		return consultationCustomersMapper.deleteConsultationCustomer(consultationCustomersVO);
	}
}
