package com.wedding.dsu.model.fnbitems;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 식음료, 식음료 분류 JoinVO
 * 
 * @author 유경호
 * @version 2019.10.07 v0.2
 */
@Getter @Setter @ToString
public class FnBItemsFnbclassificationsJoinVO extends FnBItemsVO{
	private String eventClassificaition;
	private String itemClassificationName;
	private int order;
	private String useStatus;
   }
