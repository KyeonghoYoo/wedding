package com.wedding.dsu.model.menu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class MenuVO {
    private String id;
    private String eventClassification;
    private String menuName;
    private int adultCharge;
    private int childCharge;
    private String memo;
}
