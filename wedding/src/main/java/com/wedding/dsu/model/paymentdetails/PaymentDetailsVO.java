package com.wedding.dsu.model.paymentdetails;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PaymentDetailsVO {
    private String id;
    private Date paymentDate;
    private String paymentClassification;
    private String accountClassification;
    private int amount;
    private String paymentMemo;
    private String contractCustomers_ID;
}
