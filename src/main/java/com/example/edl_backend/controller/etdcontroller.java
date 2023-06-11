package com.example.edl_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Models.note_examenmodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.note_examen;
import com.example.edl_backend.services.etdservice;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Etudiant")
public class etdcontroller {

    @Autowired
    private etdservice etdserv;

    @GetMapping("/getinfoconcurs")
    public ResponseEntity<List<infoconcourmodel>> listuser(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.ETUDIANT) {
                return new ResponseEntity<List<infoconcourmodel>>(etdserv.getallconcurs(), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/getconcur")
    public ResponseEntity<Optional<infoconcourmodel>> listuser(@RequestParam String id, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.ETUDIANT) {
                return new ResponseEntity<Optional<infoconcourmodel>>(etdserv.findbyidconcur(id), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @GetMapping("/getnotes")
    public ResponseEntity<List<note_examenmodel>> listuser(@RequestBody usermodel etd, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.ETUDIANT) {
                return new ResponseEntity<List<note_examenmodel>>(etdserv.getnotes(etd), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }
}
