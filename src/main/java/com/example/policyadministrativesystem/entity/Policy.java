package com.example.policyadministrativesystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String policyHolderName;
    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private Address address;
    @ManyToMany
    private List<Coverage> coverages;

    public Policy() {
    }

    public Policy(int id, String policyHolderName) {
        this.id = id;
        this.policyHolderName = policyHolderName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Coverage> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverage> coverages) {
        this.coverages = coverages;
    }
    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", policyHolderName='" + policyHolderName + '\'' +
                '}';
    }
}
