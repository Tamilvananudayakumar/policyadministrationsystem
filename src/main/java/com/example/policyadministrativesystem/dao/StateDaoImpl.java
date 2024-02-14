package com.example.policyadministrativesystem.dao;

import com.example.policyadministrativesystem.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StateDaoImpl implements StateDao{
    @Autowired
    EntityManager entityManager;



    @Override
    public State addState(State state) {
        return entityManager.merge(state);
    }

    @Override
    public List<State> getAllState() {
        TypedQuery<State> typedQuery=entityManager.createQuery("from State ", State.class);
        List<State> states=typedQuery.getResultList();
        return states;
    }

    @Override
    public State getStateById(int id) {
        return entityManager.find(State.class,id);
    }

    @Override
    public State updateState(State state) {
        return entityManager.merge(state);
    }

    @Override
    public void deleteStateById(int id) {
        State state=entityManager.find(State.class,id);
        entityManager.remove(state);
    }
}
