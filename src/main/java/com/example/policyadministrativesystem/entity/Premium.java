package com.example.policyadministrativesystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Premium {
    @Id
    private int id;
    private String coverage;
    private String state;
    private String premium;
}
