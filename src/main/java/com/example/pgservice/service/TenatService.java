package com.example.pgservice.service;

import com.example.pgservice.requestResponse.TenantReqRes;

import java.util.List;


public interface TenatService {


    List<TenantReqRes> getAllTenatsDetails();

    String upDateTenant(TenantReqRes tenantReqRes);

    String deleteTenant(int id);

    TenantReqRes addTenat(TenantReqRes tenantReqRes);
}
