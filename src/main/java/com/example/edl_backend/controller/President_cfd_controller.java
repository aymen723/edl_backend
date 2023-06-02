package com.example.edl_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.services.President_cfdservice;

@RestController
@RequestMapping("/Cfd")
public class President_cfd_controller {
    @Autowired
    private President_cfdservice cfdservice;

    @PostMapping("/addconcur")
    public String addconcur(@RequestBody infoconcourmodel concur) {
        try {
            // usermodel usersession = (usermodel) session.getAttribute("user");

            // if (usersession.getRole() == erole.ADMIN) {
            cfdservice.addconcur(concur);
            // }
            return "user has been added";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

}
