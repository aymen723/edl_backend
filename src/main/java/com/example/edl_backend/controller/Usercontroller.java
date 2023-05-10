package com.example.edl_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.userloginmodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.UserRepo;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class Usercontroller {

    @Autowired
    private UserRepo userRepository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody userloginmodel user, HttpSession session) {
        usermodel dbUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (dbUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
        if (!dbUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
        session.setAttribute("user", user);
        System.out.println(session.getAttribute("user"));
        return ResponseEntity.ok("Login successful");
    }

}
