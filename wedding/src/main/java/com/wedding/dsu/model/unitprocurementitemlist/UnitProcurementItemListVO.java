package com.wedding.dsu.model.unitprocurementitemlist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class UnitProcurementItemListVO {
    private String id;
    private String contractCustomers_ID;
    private String unitProcurementItems_ID;
    private String itemName;
    private int price;
    private int quantity;
    private int discount;
    private int amount;
}
