package com.example.pgservice.service;

import com.example.pgservice.entity.TenantEntity;
import com.example.pgservice.repository.TenantRepository;
import com.example.pgservice.requestResponse.TenantReqRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TenantServiceImpl implements TenatService {

    @Autowired
    TenantRepository tenantRepository;

    @Override
    public TenantReqRes addTenat(TenantReqRes tenantReqRes) {

        TenantEntity tenantEntity = new TenantEntity();
        tenantEntity.setId(tenantReqRes.getId());
        tenantEntity.setName(tenantReqRes.getName());
        tenantEntity.setCity(tenantReqRes.getCity());
        tenantEntity.setRent(tenantReqRes.getRent());
        tenantEntity.setFlatNo(tenantReqRes.getFlatNo());
        tenantEntity.setGender(tenantReqRes.getGender());
        tenantEntity.setSalary(tenantReqRes.getSalary());
        tenantEntity.setDepartment(tenantReqRes.getDepartment());

        tenantRepository.save(tenantEntity);
        return tenantReqRes;

    }

    @Override
    public List<TenantReqRes> getAllTenatsDetails() {
        List<TenantEntity> tenantEntities = tenantRepository.findAll();
        List<TenantReqRes> tenantReqResList = new ArrayList<>();
        for (TenantEntity tenantEntity : tenantEntities) {
            TenantReqRes tenantReqRes = new TenantReqRes();
            tenantReqRes.setName(tenantEntity.getName());
            tenantReqRes.setCity(tenantEntity.getCity());
            tenantReqRes.setId(tenantEntity.getId());
            tenantReqRes.setRent(tenantEntity.getRent());
            tenantReqRes.setGender(tenantEntity.getGender());
            tenantReqRes.setDepartment(tenantEntity.getDepartment());
            tenantReqRes.setSalary(tenantEntity.getSalary());

            tenantReqResList.add(tenantReqRes);
        }
        return tenantReqResList;
    }

    @Override
    public String upDateTenant(TenantReqRes tenantReqRes) {
        TenantEntity tenantEntity = new TenantEntity();
        tenantEntity.setId(tenantReqRes.getId());
        tenantEntity.setGender(tenantReqRes.getGender());
        tenantEntity.setRent(tenantReqRes.getRent());
        tenantEntity.setFlatNo(tenantReqRes.getFlatNo());
        tenantEntity.setSalary(tenantReqRes.getSalary());
        tenantEntity.setDepartment(tenantReqRes.getDepartment());
        tenantEntity.setCity(tenantReqRes.getCity());
        tenantEntity.setName(tenantReqRes.getName());

        tenantRepository.save(tenantEntity);
        return "update";
    }

    @Override
    public String deleteTenant(int id) {
        tenantRepository.deleteById(id);
        return "Deleted";
    }

}

