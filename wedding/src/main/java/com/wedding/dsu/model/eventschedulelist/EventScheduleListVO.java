package com.wedding.dsu.model.eventschedulelist;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class EventScheduleListVO {
    private String id;
    private String contractCustomers_ID;
    private String halls_ID;
    private String hallName;
    private Date startDate;
    private Date endDate;
}
