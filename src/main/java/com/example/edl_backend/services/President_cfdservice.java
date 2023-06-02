package com.example.edl_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Repo.Concurrepo;

@Service

public class President_cfdservice {

    @Autowired
    private Concurrepo concurrepo;

    public Concurrepo getconcurinfo() {

        return null;
    }

    public void addconcur(infoconcourmodel concur) {
        concurrepo.save(concur);

    }
}
