package com.wedding.dsu.model.consultationcustomers;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 상담고객 검색 VO
 * @author 유경호
 * @version 2019.08.09 v0.1
 * */
@Getter @Setter @ToString
public class ConsultationCustomersSearchVO extends ConsultationCustomersVO {
	private String totalNameSearch;
	private String customerName;
	private String contactNumber;
	private String dateSeachClassification;
	private Date startDate;
	private Date endDate;
}
