package com.example.edl_backend.Models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "concur")
public class infoconcourmodel {

    @Id
    private String id;

    private Date date_debut;

    private Date dete_fin;

    private specialitemodel specialite;

    private List<String> idmodules;

    private boolean state;

    public infoconcourmodel(String id, Date date_debut, Date dete_fin, specialitemodel specialite,
            List<String> idmodules, boolean state) {
        this.id = id;
        this.date_debut = date_debut;
        this.dete_fin = dete_fin;
        this.specialite = specialite;
        this.idmodules = idmodules;
        this.state = state;
    }

    public infoconcourmodel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDete_fin() {
        return dete_fin;
    }

    public void setDete_fin(Date dete_fin) {
        this.dete_fin = dete_fin;
    }

    public specialitemodel getSpecialite() {
        return specialite;
    }

    public void setSpecialite(specialitemodel specialite) {
        this.specialite = specialite;
    }

    public List<String> getIdmodules() {
        return idmodules;
    }

    public void setIdmodules(List<String> idmodules) {
        this.idmodules = idmodules;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
