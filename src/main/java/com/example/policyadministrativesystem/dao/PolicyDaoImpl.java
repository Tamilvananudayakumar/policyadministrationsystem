package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.Address;
import com.example.policyadministrativesystem.entity.Coverage;
import com.example.policyadministrativesystem.entity.Policy;
import com.example.policyadministrativesystem.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyDaoImpl implements PolicyDao{
    @Autowired
    EntityManager entityManager;
    @Override
    public Policy addPolicy(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public List<Policy> getAllPolicy() {
        TypedQuery<Policy> typedQuery=entityManager.createQuery("from Policy ", Policy.class);
        List<Policy> policies=typedQuery.getResultList();
        return policies;
    }

    @Override
    public Policy getPolicyById(int id) {
        return entityManager.find(Policy.class,id);
    }

    @Override
    public Policy updatePolicy(Policy policy) {
        return entityManager.merge(policy);
    }

    @Override
    public void deletePolicyById(int id) {
        Policy policy=entityManager.find(Policy.class,id);
        entityManager.remove(policy);
    }


}
