package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.dao.PolicyDao;
import com.example.policyadministrativesystem.dao.StateDao;
import com.example.policyadministrativesystem.entity.State;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StateServiceImpl implements StateService{
    @Autowired
    StateDao stateDao;
    @Transactional
    @Override
    public State addState(State state) {
        return stateDao.addState(state);
    }

    @Override
    public List<State> getAllState() {
        return stateDao.getAllState();
    }

    @Override
    public State getStateById(int id) {
        return stateDao.getStateById(id);
    }
    @Transactional
    @Override
    public State updateState(State state) {
        return stateDao.updateState(state);
    }
    @Transactional
    @Override
    public void deleteStateById(int id) {
        stateDao.deleteStateById(id);
    }

}
