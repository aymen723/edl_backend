package com.example.edl_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.services.ensservice;

@RestController
@RequestMapping("/Enseignante")

public class enseignantecontroller {

    @Autowired
    private ensservice ensserv;

}
