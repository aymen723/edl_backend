package com.example.edl_backend.Models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "note_examen")

public class note_examenmodel {

    @Id
    private String id;

    private modulemodel module;

    private infoconcourmodel concur;

    private specialitemodel specialite;

    private Date date;

    private usermodel etd;

    private List<note> note;

    public note_examenmodel(String id, modulemodel module, infoconcourmodel concur, specialitemodel specialite,
            Date date,
            usermodel etd, List<com.example.edl_backend.Models.note> note) {
        this.id = id;
        this.module = module;
        this.concur = concur;
        this.specialite = specialite;
        this.date = date;
        this.etd = etd;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public modulemodel getModule() {
        return module;
    }

    public void setModule(modulemodel module) {
        this.module = module;
    }

    public infoconcourmodel getConcur() {
        return concur;
    }

    public void setConcur(infoconcourmodel concur) {
        this.concur = concur;
    }

    public specialitemodel getSpecialite() {
        return specialite;
    }

    public void setSpecialite(specialitemodel specialite) {
        this.specialite = specialite;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public usermodel getEtd() {
        return etd;
    }

    public void setEtd(usermodel etd) {
        this.etd = etd;
    }

    public List<note> getNote() {
        return note;
    }

    public void setNote(List<note> note) {
        this.note = note;
    }

    public note_examenmodel() {
    }

}
