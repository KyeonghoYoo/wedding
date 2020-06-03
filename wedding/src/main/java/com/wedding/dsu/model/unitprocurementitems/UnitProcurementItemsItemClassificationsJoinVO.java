package com.wedding.dsu.model.unitprocurementitems;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 부대품목, 부대품목 분류 Join VO
 * 
 * @author 유경호
 * @version 2019.10.07 v0.2
 */
@Getter @Setter @ToString
public class UnitProcurementItemsItemClassificationsJoinVO extends UnitProcurementItemsVO {
	private String eventClassification;
	private String itemClassificationName;
	private int order;
	private String useStatus;
}
