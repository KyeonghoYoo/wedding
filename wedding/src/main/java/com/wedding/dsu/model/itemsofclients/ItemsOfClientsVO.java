package com.wedding.dsu.model.itemsofclients;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ItemsOfClientsVO {
    private String id;
    private String itemClassification;
    private String itemName;
    private int supplyPrice;
    private String memo;
    private String clients_ID;
}
