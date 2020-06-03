package com.wedding.dsu.model.fnbitemlist;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FnBItemListVO {
    private String id;
    private String contractCustomers_ID;
    private String fnBItems_ID;
    private String itemName;
    private int price;
    private int quantity;
    private int discount;
    private int amount;
    private String memo;
}
