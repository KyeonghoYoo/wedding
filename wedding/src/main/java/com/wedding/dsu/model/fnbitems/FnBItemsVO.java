package com.wedding.dsu.model.fnbitems;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 식음료 VO
 * 
 * @author 유경호
 * @version 2019.08.07 v0.1
 */
@Getter @Setter @ToString
public class FnBItemsVO {
    private String id;
    private String itemName;
    private int price;
    private String memo;
    private String fnBClassifications_ID;
}
