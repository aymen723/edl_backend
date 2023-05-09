package com.example.edl_backend.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.services.Adminservice;

@RestController
@RequestMapping("/Admin")
public class admincontroller {

    @Autowired
    private Adminservice adminser;

    @PostMapping("/AddUser")
    public String adduser(@RequestBody usermodel user) {
        adminser.adduser(user);
        return "user has been added";
    }

    @GetMapping("/getusers")
    public ResponseEntity<List<usermodel>> listuser() {
        return new ResponseEntity<List<usermodel>>(adminser.getalluser(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteuser")
    public void deleteByEmpId(@RequestParam String id) {
        adminser.deleteuserbyid(id);
    }

    @PatchMapping("/updateuser")
    public void updateuser(@RequestBody usermodel user) {
        adminser.updateuser(user);
    }

    @GetMapping("/")
    public String test() {

        return "test of api";
    }

}