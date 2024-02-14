package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.State;

import java.util.List;

public interface StateDao {
    State addState(State state);
    List<State> getAllState();
    State getStateById(int id);
    State updateState(State state);
    void deleteStateById(int id);
}
