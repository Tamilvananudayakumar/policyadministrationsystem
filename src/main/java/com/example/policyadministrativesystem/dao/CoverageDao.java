package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.Coverage;

import java.util.List;

public interface CoverageDao {


    Coverage addCoverage(Coverage coverage);
    List<Coverage> getAllCoverage();
    Coverage getCoverageById(int id);
    Coverage updateCoverage(Coverage coverage);
    void deleteCoverageById(int id);
}
