package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.entity.Policy;

import java.util.List;

public interface PolicyService {
    Policy addPolicy(Policy policy);
    List<Policy> getAllPolicy();
    Policy getPolicyById(int id);
    Policy updatePolicy(Policy policy);
    Policy deletePolicyById(int id);

}
