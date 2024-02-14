package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.dao.CoverageDao;
import com.example.policyadministrativesystem.dao.PolicyDao;
import com.example.policyadministrativesystem.entity.Coverage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoverageServiceImpl implements CoverageService{
    @Autowired
    CoverageDao coverageDao;
    @Transactional
    @Override
    public Coverage addCoverage(Coverage coverage) {
        return coverageDao.addCoverage(coverage);
    }

    @Override
    public List<Coverage> getAllCoverage() {
        return coverageDao.getAllCoverage();
    }

    @Override
    public Coverage getCoverageById(int id) {
        return coverageDao.getCoverageById(id);
    }
    @Transactional
    @Override
    public Coverage updateCoverage(Coverage coverage) {
        return coverageDao.updateCoverage(coverage);
    }
    @Transactional
    @Override
    public void deleteCoverageById(int id) {
        coverageDao.deleteCoverageById(id);
    }
}
