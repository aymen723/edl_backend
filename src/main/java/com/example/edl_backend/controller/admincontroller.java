package com.example.edl_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.services.Adminservice;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Admin")
public class admincontroller {

    @Autowired
    private Adminservice adminser;

    @PostMapping("/AddUser")
    public String adduser(@RequestBody usermodel user, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");

            if (usersession.getRole() == erole.ADMIN) {
                adminser.adduser(user);
            }
            return "user has been added";
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }

    @GetMapping("/getusers")
    public ResponseEntity<List<usermodel>> listuser(HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.ADMIN) {
                return new ResponseEntity<List<usermodel>>(adminser.getalluser(), HttpStatus.OK);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @DeleteMapping("/deleteuser")
    public void deleteByEmpId(@RequestParam String id, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            if (usersession.getRole() == erole.ADMIN) {
                adminser.deleteuserbyid(id);
                System.out.println("test");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @PatchMapping("/updateuser")
    public void updateuser(@RequestParam String userId, @RequestBody usermodel updatedUser) {
        // usermodel usersession = (usermodel) session.getAttribute("user");
        // if (usersession.getRole() == erole.ADMIN) {
        adminser.updateuser(userId, updatedUser);
        // }
    }

    @PostMapping("/viaFile")
    public ResponseEntity<String> createUser(@RequestBody List<usermodel> users) {

        return ResponseEntity.ok("Users created successfully");
    }


    

}
