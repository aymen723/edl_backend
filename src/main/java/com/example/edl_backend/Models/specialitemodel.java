package com.example.edl_backend.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialite")

public class specialitemodel {

    @Id
    private String id;
    private String nom_specialite;
    private String niveaux;
    private String Domaine;
    private String Filière;
    private ArrayList<String> list_module;

    public specialitemodel(String id, String nom_specialite, String niveaux, String domaine, String filière,
            ArrayList<String> list_module) {
        this.id = id;
        this.nom_specialite = nom_specialite;
        this.niveaux = niveaux;
        Domaine = domaine;
        Filière = filière;
        this.list_module = list_module;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_specialite() {
        return nom_specialite;
    }

    public void setNom_specialite(String nom_specialite) {
        this.nom_specialite = nom_specialite;
    }

    public String getNiveaux() {
        return niveaux;
    }

    public void setNiveaux(String niveaux) {
        this.niveaux = niveaux;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String domaine) {
        Domaine = domaine;
    }

    public String getFilière() {
        return Filière;
    }

    public void setFilière(String filière) {
        Filière = filière;
    }

    public ArrayList<String> getList_module() {
        return list_module;
    }

    public void setList_module(ArrayList<String> list_module) {
        this.list_module = list_module;
    }

}
