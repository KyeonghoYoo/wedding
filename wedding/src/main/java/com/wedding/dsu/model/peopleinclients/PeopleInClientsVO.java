package com.wedding.dsu.model.peopleinclients;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PeopleInClientsVO {
    private String id;
    private String name;
    private String position;
    private String contactNumber;
    private String email;
    private String clients_ID;
}
