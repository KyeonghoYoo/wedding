package com.wedding.dsu.model.contractcustomers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.ConsultationDetailsMapper;
import com.wedding.dsu.mapper.ContractCustomersMapper;
import com.wedding.dsu.mapper.EventScheduleListMapper;
import com.wedding.dsu.mapper.FnBItemListMapper;
import com.wedding.dsu.mapper.OrderListMapper;
import com.wedding.dsu.mapper.PaymentDetailsMapper;
import com.wedding.dsu.mapper.UnitProcurementItemListMapper;
import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;
import com.wedding.dsu.model.eventschedulelist.EventScheduleListVO;
import com.wedding.dsu.model.fnbitemlist.FnBItemListVO;
import com.wedding.dsu.model.orderlist.OrderListVO;
import com.wedding.dsu.model.paymentdetails.PaymentDetailsVO;
import com.wedding.dsu.model.unitprocurementitemlist.UnitProcurementItemListVO;

/**
 * 계약고객 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.29 v0.2
 */
@Service
public class ContractCustomersServiceImpl implements ContractCustomersService {
	@Autowired
	private ContractCustomersMapper contractCustomersMapper;
	@Autowired
	private EventScheduleListMapper eventScheduleListMapper; 
	@Autowired
	private PaymentDetailsMapper paymentDetailsMapper;
	@Autowired
	private FnBItemListMapper fnBItemListMapper;
	@Autowired
	private UnitProcurementItemListMapper unitProcurementItemListMapper;
	@Autowired
	private OrderListMapper orderListMapper;
	@Autowired
	private ConsultationDetailsMapper ConsultationDetailsMapper;

	/**
	 * 계약고객 삽입
	 * 
	 * @param HallsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception {
		if (contractCustomersMapper.insertContractCustomer(contractCustomersVO) == 0) {
			return 0;
		}
		if (contractCustomersVO.getEventScheduleListVOs() != null) {
			List<EventScheduleListVO> eventScheduleListVOs = contractCustomersVO.getEventScheduleListVOs();
			for (EventScheduleListVO eventScheduleListVO : eventScheduleListVOs) {
				eventScheduleListVO.setContractCustomers_ID(contractCustomersVO.getId());
				eventScheduleListMapper.insertEventScheduleList(eventScheduleListVO);
			}

		}
		if (contractCustomersVO.getPaymentDetailsVOs() != null) {
			List<PaymentDetailsVO> paymentDetailsVOs = contractCustomersVO.getPaymentDetailsVOs();
			for (PaymentDetailsVO paymentDetailsVO : paymentDetailsVOs) {
				paymentDetailsVO.setContractCustomers_ID(contractCustomersVO.getId());
				paymentDetailsMapper.insertPaymentDetail(paymentDetailsVO);
			}
		}
		return 1;
	}

	/**
	 * 계약고객 리스트 조회
	 * 
	 * @param ContractCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ContractCustomersVO> selectContractCustomers(ContractCustomersSearchVO contractCustomersSearchVO)
			throws Exception {
		List<ContractCustomersVO> contractCustomersVOs = contractCustomersMapper
				.selectContractCustomers(contractCustomersSearchVO);
		for (ContractCustomersVO contractCustomersVO : contractCustomersVOs) {
			EventScheduleListVO eventScheduleListVO = new EventScheduleListVO();
			eventScheduleListVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO
					.setEventScheduleListVOs(eventScheduleListMapper.selectEventScheduleList(eventScheduleListVO));
			FnBItemListVO fnBItemListVO = new FnBItemListVO();
			fnBItemListVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO.setFnBItemListVOs(fnBItemListMapper.selectFnBItemList(fnBItemListVO));

			UnitProcurementItemListVO unitProcurementItemListVO = new UnitProcurementItemListVO();
			unitProcurementItemListVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO.setUnitProcurementItemListVOs(
					unitProcurementItemListMapper.selectUnitProcurementItemList(unitProcurementItemListVO));

			OrderListVO orderListVO = new OrderListVO();
			orderListVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO.setOrderListVOs(orderListMapper.selectOrderList(orderListVO));

			ConsultationDetailsVO consultationDetailsVO = new ConsultationDetailsVO();
			consultationDetailsVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO
					.setConsultationDetailsVOs(ConsultationDetailsMapper.selectConsultationDetails(consultationDetailsVO));
					
			PaymentDetailsVO paymentDetailsVO = new PaymentDetailsVO();
			paymentDetailsVO.setContractCustomers_ID(contractCustomersVO.getId());
			contractCustomersVO
					.setPaymentDetailsVOs(paymentDetailsMapper.selectPaymentDetails(paymentDetailsVO));
		}

		return contractCustomersVOs;
	}

	/**
	 * 계약고객 상세 조회
	 * 
	 * @param ContractCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ContractCustomersVO selectContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception {
		ContractCustomersVO contractCustomersVOs = contractCustomersMapper.selectContractCustomer(contractCustomersVO);

		EventScheduleListVO eventScheduleListVO = new EventScheduleListVO();
		eventScheduleListVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs
				.setEventScheduleListVOs(eventScheduleListMapper.selectEventScheduleList(eventScheduleListVO));

		FnBItemListVO fnBItemListVO = new FnBItemListVO();
		fnBItemListVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs.setFnBItemListVOs(fnBItemListMapper.selectFnBItemList(fnBItemListVO));

		UnitProcurementItemListVO unitProcurementItemListVO = new UnitProcurementItemListVO();
		unitProcurementItemListVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs.setUnitProcurementItemListVOs(
				unitProcurementItemListMapper.selectUnitProcurementItemList(unitProcurementItemListVO));

		OrderListVO orderListVO = new OrderListVO();
		orderListVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs.setOrderListVOs(orderListMapper.selectOrderList(orderListVO));

		ConsultationDetailsVO consultationDetailsVO = new ConsultationDetailsVO();
		consultationDetailsVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs
				.setConsultationDetailsVOs(ConsultationDetailsMapper.selectConsultationDetails(consultationDetailsVO));
				
		PaymentDetailsVO paymentDetailsVO = new PaymentDetailsVO();
		paymentDetailsVO.setContractCustomers_ID(contractCustomersVO.getId());
		contractCustomersVOs
				.setPaymentDetailsVOs(paymentDetailsMapper.selectPaymentDetails(paymentDetailsVO));

		return contractCustomersVOs;
	}

	/**
	 * 계약고객 수정
	 * 
	 * @param ContractCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception {
		return contractCustomersMapper.updateContractCustomer(contractCustomersVO);
	}

	/**
	 * 계약고객 삭제
	 * 
	 * @param ContractCustomersSearchVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception {
		return contractCustomersMapper.deleteContractCustomer(contractCustomersVO);
	}
}
