package com.example.edl_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Models.note_examenmodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.Concurrepo;
import com.example.edl_backend.Repo.note_examen;

@Service
public class etdservice {

    @Autowired
    public Concurrepo concur;

    @Autowired
    public note_examen note_examen;

    public List<infoconcourmodel> getallconcurs() {
        // System.out.println(" test here " + userrepo.findAll());
        return concur.findAll();
    }

    public Optional<infoconcourmodel> findbyidconcur(String id) {

        return concur.findById(id);
    }

    public List<note_examenmodel> getnotes(usermodel etd) {

        return note_examen.findByetd(etd);

    }
}
