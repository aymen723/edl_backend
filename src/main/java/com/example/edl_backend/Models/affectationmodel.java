package com.example.edl_backend.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "affectation")
public class affectationmodel {

    @Id
    private String id;

    private specialitemodel specialite;

    private usermodel ens;

    private modulemodel module;

    private examenmodel examen;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public specialitemodel getSpecialite() {
        return specialite;
    }

    public void setSpecialite(specialitemodel specialite) {
        this.specialite = specialite;
    }

    public usermodel getEns() {
        return ens;
    }

    public void setEns(usermodel ens) {
        this.ens = ens;
    }

    public modulemodel getModule() {
        return module;
    }

    public void setModule(modulemodel module) {
        this.module = module;
    }

    public examenmodel getExamen() {
        return examen;
    }

    public void setExamen(examenmodel examen) {
        this.examen = examen;
    }

    public affectationmodel(String id, specialitemodel specialite, usermodel ens, modulemodel module,
            examenmodel examen) {
        this.id = id;
        this.specialite = specialite;
        this.ens = ens;
        this.module = module;
        this.examen = examen;
    }

    public affectationmodel() {
    }

}
