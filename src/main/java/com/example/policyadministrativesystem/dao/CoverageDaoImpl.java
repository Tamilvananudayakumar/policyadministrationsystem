package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.Coverage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CoverageDaoImpl implements CoverageDao{
    @Autowired
    EntityManager entityManager;

    @Override
    public Coverage addCoverage(Coverage coverage) {
        return entityManager.merge(coverage);
    }

    @Override
    public List<Coverage> getAllCoverage() {
        TypedQuery<Coverage> typedQuery=entityManager.createQuery("from Coverage ", Coverage.class);
        List<Coverage> coverages=typedQuery.getResultList();
        return coverages;
    }

    @Override
    public Coverage getCoverageById(int id) {
        return entityManager.find(Coverage.class,id);
    }

    @Override
    public Coverage updateCoverage(Coverage coverage) {
        return entityManager.merge(coverage);
    }

    @Override
    public void deleteCoverageById(int id) {
        Coverage coverage=entityManager.find(Coverage.class,id);
        entityManager.remove(coverage);
    }
}
