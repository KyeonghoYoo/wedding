package com.wedding.dsu.model.itemclassifications;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ItemClassificationsVO {
    private String id;
    private String eventClassification;
    private String itemClassificationName;
    private int order;
    private String useStatus;
}
