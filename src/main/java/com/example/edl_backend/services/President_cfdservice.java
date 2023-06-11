package com.example.edl_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.affectationmodel;
import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.Concurrepo;
import com.example.edl_backend.Repo.affectationrepo;

@Service

public class President_cfdservice {

    @Autowired
    private affectationrepo affectrepo;

    public void affecter(affectationmodel affect) {
        affectrepo.insert(affect);

    }

}
