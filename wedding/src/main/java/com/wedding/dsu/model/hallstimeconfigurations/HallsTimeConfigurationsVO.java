package com.wedding.dsu.model.hallstimeconfigurations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class HallsTimeConfigurationsVO {
    private String id;
    private String month;
    private String time;
    private String halls_ID;
}
