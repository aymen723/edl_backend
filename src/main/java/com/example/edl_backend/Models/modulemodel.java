package com.example.edl_backend.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "module")
public class modulemodel {

    @Id
    private String id;

    private String nom_module;
    private Integer coeff;
    private Integer credit;

    public modulemodel(String id, String nom_module, Integer coeff, Integer credit) {
        this.id = id;
        this.nom_module = nom_module;
        this.coeff = coeff;
        this.credit = credit;
    }

    public modulemodel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getNom_module() {
        return nom_module;
    }

    public void setNom_module(String nom_module) {
        this.nom_module = nom_module;
    }

    public Integer getCoeff() {
        return coeff;
    }

    public void setCoeff(Integer coeff) {
        this.coeff = coeff;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

}
