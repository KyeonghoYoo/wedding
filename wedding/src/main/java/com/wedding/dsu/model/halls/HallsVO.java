package com.wedding.dsu.model.halls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class HallsVO {
    private String id;
    private int order;
    private String hallClassification;
    private String hallName;
}
