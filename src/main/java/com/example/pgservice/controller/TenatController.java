package com.example.pgservice.controller;

import com.example.pgservice.requestResponse.TenantReqRes;
import com.example.pgservice.service.TenatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenats")
public class TenatController {

    @Autowired
    TenatService tenantService;

    @PostMapping("/add")
    public TenantReqRes addTenats1(@RequestBody TenantReqRes tenantReqRes) {
        TenantReqRes tenantReqRes1 = tenantService.addTenat(tenantReqRes);
        return tenantReqRes1;
    }

    @GetMapping
    public List<TenantReqRes> getAllTenats() {
        List<TenantReqRes> tenantReqRes = tenantService.getAllTenatsDetails();
        return tenantReqRes;
    }

    @PutMapping
    public String upDateTenant(@RequestBody TenantReqRes tenantReqRes) {
        String s = tenantService.upDateTenant(tenantReqRes);
        return s;
    }

    @DeleteMapping("/{id}")
    public String deleteTenant(@PathVariable int id) {
String msg =tenantService.deleteTenant(id);
return msg;
    }

}