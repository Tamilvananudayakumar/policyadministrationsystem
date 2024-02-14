package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.Address;
import com.example.policyadministrativesystem.entity.Coverage;
import com.example.policyadministrativesystem.entity.Policy;
import com.example.policyadministrativesystem.entity.State;

import java.util.List;
import java.util.Stack;

public interface PolicyDao {
    Policy addPolicy(Policy policy);
    List<Policy> getAllPolicy();
    Policy getPolicyById(int id);
    Policy updatePolicy(Policy policy);
    void deletePolicyById(int id);







}
