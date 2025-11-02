package com.example.pgservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tenants")
public class TenantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String flatNo;
    private long salary;
    private String department;
    private long rent;
    private String gender;
    private String city;
}
