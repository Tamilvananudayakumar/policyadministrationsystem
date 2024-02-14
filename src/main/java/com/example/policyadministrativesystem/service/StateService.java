package com.example.policyadministrativesystem.service;

import com.example.policyadministrativesystem.entity.State;

import java.util.List;

public interface StateService {

    State addState(State state);
    List<State> getAllState();
    State getStateById(int id);
    State updateState(State state);
    void deleteStateById(int id);
}
