package com.wedding.dsu.model.contractcustomers;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 계약고객 이벤트내역 left Join VO
 * @author 유경호
 * @version 2019.08.23 v0.1
 * */
@Getter @Setter @ToString
public class ContractCustomersEventScheduleListJoinVO extends ContractCustomersVO {
	private String halls_ID;
	private String hallName;
	private Date hall_StartDate;
	private Date hall_EndDate;
}
