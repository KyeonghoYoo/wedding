package com.wedding.dsu.model.orderlist;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class OrderListVO {
    private String id;
    private String contractCustomers_ID;
    private String itemsOfClients_ID;
    private String itemClassification;
    private String itemName;
    private int supplyPrice;
    private String memo;
    private Date reverseOrderDate;
    private String settlementState;
    private Date settlementDate;
}
