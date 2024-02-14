package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.dao.PolicyDao;
import com.example.policyadministrativesystem.entity.Policy;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    PolicyDao policyDao;
    @Transactional
    @Override
    public Policy addPolicy(Policy policy) {
        return policyDao.addPolicy(policy);
    }

    @Override
    public List<Policy> getAllPolicy() {
        return policyDao.getAllPolicy();
    }

    @Override
    public Policy getPolicyById(int id) {
        return policyDao.getPolicyById(id);
    }
@Transactional
    @Override
    public Policy updatePolicy(Policy policy) {
        return policyDao.updatePolicy(policy);
    }
@Transactional
    @Override
    public Policy deletePolicyById(int id) {
        policyDao.deletePolicyById(id);
    return null;
}


}
