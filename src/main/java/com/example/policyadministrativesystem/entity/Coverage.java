package com.example.policyadministrativesystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String coverages;
    @ManyToMany
    private List<Policy> policies;

    public Coverage() {
    }

    public Coverage(int id, String coverages) {
        this.id = id;
        this.coverages = coverages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoverages() {
        return coverages;
    }

    public void setCoverages(String coverages) {
        this.coverages = coverages;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public String toString() {
        return "Coverage{" +
                "id=" + id +
                ", coverages='" + coverages + '\'' +
                '}';
    }
}
