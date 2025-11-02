package com.example.pgservice.requestResponse;

import lombok.Data;

@Data
public class TenantReqRes {

    private int id;
    private String name;
    private String flatNo;
    private long salary;
    private String department;
    private long rent;
    private String gender;
    private String city;
}
