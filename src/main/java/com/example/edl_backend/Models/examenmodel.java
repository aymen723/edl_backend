package com.example.edl_backend.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class examenmodel {

    @Id
    private String Id;

    private String specialite;

    private ArrayList<Integer> note_exm;

    public examenmodel() {
    }

    public examenmodel(String id, String specialite, ArrayList<Integer> note_exm) {
        Id = id;
        this.specialite = specialite;
        this.note_exm = note_exm;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public ArrayList<Integer> getNote_exm() {
        return note_exm;
    }

    public void setNote_exm(ArrayList<Integer> note_exm) {
        this.note_exm = note_exm;
    }

}
