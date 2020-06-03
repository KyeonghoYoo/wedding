package com.wedding.dsu.model.contractcustomers;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;
import com.wedding.dsu.model.eventschedulelist.EventScheduleListVO;
import com.wedding.dsu.model.fnbitemlist.FnBItemListVO;
import com.wedding.dsu.model.orderlist.OrderListVO;
import com.wedding.dsu.model.paymentdetails.PaymentDetailsVO;
import com.wedding.dsu.model.unitprocurementitemlist.UnitProcurementItemListVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 계약고객 VO
 * @author 유경호
 * @version 2019.08.01 v0.1
 * */
@Getter @Setter @ToString
public class ContractCustomersVO {
    private String id;
    private String eventClassification;
    private Date registrationDate;
    private Date contractDate;
    private String contractClassification;
    private String contactPath;
    private String users_ID;
    private String userName;
    private String address1;
    private String address2;
    private String address3;
    private String menu_ID;
    private String menuName;
    private int adultCharge;
    private int childCharge;
    private int paymentAssuranceCount;
    private String contractMemo;
    private String groomName;
    private String brideName;
    private String motherNameOfGroom;
    private String fatherNameOfGroom;
    private String motherNameOfBride;
    private String fatherNameOfBride;
    private String parentGroomRelations;
    private String parentBrideRelations;
    private String mobileOfGroom;
    private String mobileOfBride;
    private String emailOfGroom;
    private String emailOfBride;
    private int mealTicketCountOfGroom;
    private int mealTicketCountOfBride;
    private String estimatedAttendanceNumbers;
    private String eventName;
    private String eventContractorName;
    private String contactNumber;
    private String mobile;
    private String email;
    private String eventType;
    private int groomAdultMealCount;
    private int groomChildMealCount;
    private int groomFnBPayment;
    private int groomUnitProcurementItemPayment;
    private int groomDeposit;
    private int groomDiscount;
    private int groomCashDeposit;
    private int groomCardDeposit;
    private int groomDealWithinTheDay;
    private int brideAdultMealCount;
    private int brideChildMealCount;
    private int brideFnBPayment;
    private int brideUnitProcurementItemPayment;
    private int brideDeposit;
    private int brideDiscount;
    private int brideCashDeposit;
    private int brideCardDeposit;
    private int brideDealWithinTheDay;
    private int eventAdultMealCount;
    private int eventChildMealCount;
    private int eventUnitProcurementItemPayment;
    private int eventDeposit;
    private int eventDiscount;
    private int eventCashDeposit;
    private int eventCardDeposit;
    private int eventDealWithinTheDay;
    
    private List<EventScheduleListVO> eventScheduleListVOs;
    private List<PaymentDetailsVO> paymentDetailsVOs;
    private List<FnBItemListVO> fnBItemListVOs;
    private List<UnitProcurementItemListVO> unitProcurementItemListVOs;
    private List<OrderListVO> orderListVOs;
    private List<ConsultationDetailsVO> ConsultationDetailsVOs;
    
	@JsonIgnore
	private int offset;
	@JsonIgnore
	private int limit;
	@JsonIgnore
	private String sort;
	@JsonIgnore
	private String orderBy;
}
