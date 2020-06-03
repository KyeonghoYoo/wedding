package com.wedding.dsu.model.consultationcustomers;

import java.util.Date;
import java.util.List;

import com.wedding.dsu.model.consultationdetails.ConsultationDetailsVO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ConsultationCustomersVO {
    private String id;
    private Date registrationDate;
    private String contactPath;
    private String eventClassification;
    private String state;
    private String halls_ID;
    private String hallName;
    private String users_ID;
    private String userName;
    private Date startedDate;
    private Date endDate;
    private String groomName;
    private String brideName;
    private String mobileOfGroom;
    private String mobileOfBride;
    private String eventName;
    private String eventContractorName;
    private String contactNumber;
    private String mobile;
    private String eventType;
    private String memo;
    
    private List<ConsultationDetailsVO> consultationDetailsVOs;
}
