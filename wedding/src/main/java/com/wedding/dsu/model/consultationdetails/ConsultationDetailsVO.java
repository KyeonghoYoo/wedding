package com.wedding.dsu.model.consultationdetails;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ConsultationDetailsVO {
    private String id;
    private Date consultationDate;
    private Date consultationClassification;
    private String visitClassification;
    private Date visitDate;
    private String contents;
    private String unregisteredCustomerName;
    private String consultationCustomers_ID;
    private String contractCustomers_ID;
}
