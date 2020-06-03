package com.wedding.dsu.model.contractcustomers;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 계약고객 검색 VO
 * @author 유경호
 * @version 2019.08.04 v0.1
 * */
@Getter @Setter @ToString
public class ContractCustomersSearchVO extends ContractCustomersVO {
	private String totalNameSearch;
	private String customerName;
	private String contactNumber;
	private String dateSeachClassification;
	private Date startDate;
	private Date endDate;
}
