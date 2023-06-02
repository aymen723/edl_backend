package com.example.edl_backend.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "affectation")
public class affectationmodel {

    private specialitemodel specialite;

    private usermodel ens;

    private modulemodel module;

    public affectationmodel(specialitemodel specialite, usermodel ens, modulemodel module) {
        this.specialite = specialite;
        this.ens = ens;
        this.module = module;
    }

    public affectationmodel() {
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

}
