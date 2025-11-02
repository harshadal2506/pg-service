package com.example.pgservice.repository;

import com.example.pgservice.entity.TenantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository <TenantEntity,Integer> {



}
