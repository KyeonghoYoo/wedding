package com.wedding.dsu.model.unitprocurementitems;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 부대품목, 부대품목 분류 Join VO
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
@Getter @Setter @ToString
public class UnitProcurementItemsVO {
	private String id;
	private String itemName;
	private int price;
	private String memo;
	private String itemClassifications_ID;
}
