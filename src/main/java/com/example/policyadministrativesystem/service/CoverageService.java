package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.entity.Coverage;

import java.util.List;

public interface CoverageService {
    Coverage addCoverage(Coverage coverage);
    List<Coverage> getAllCoverage();
    Coverage getCoverageById(int id);
    Coverage updateCoverage(Coverage coverage);
    void deleteCoverageById(int id);
}
