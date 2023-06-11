package com.example.edl_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.edl_backend.Models.userloginmodel;
import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.UserRepo;
import com.example.edl_backend.services.userservice;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/Users")
public class Usercontroller {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private userservice userser;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody userloginmodel user, HttpSession session) {
        usermodel dbUser = userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (dbUser == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid usernameor password");
        }
        if (!dbUser.getPassword().equals(user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid usernameor password");
        }
        session.setAttribute("user", dbUser);
        System.out.println(session.getAttribute("user"));
        return ResponseEntity.ok("Login successful");
    }

    @GetMapping("/profile")
    public ResponseEntity<usermodel> profile(@RequestParam String userId, HttpSession session) {
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            return new ResponseEntity<usermodel>(userser.getuser(userId), HttpStatus.OK);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return null;
    }

    @PutMapping("/updateuser")
    public ResponseEntity<usermodel> updateuser(@RequestParam String Id,
            @RequestBody usermodel updatedDocument, HttpSession session) {
        usermodel modifiedDocument = new usermodel();
        try {
            usermodel usersession = (usermodel) session.getAttribute("user");
            modifiedDocument = userser.updateuser(Id, updatedDocument);

            return ResponseEntity.ok(modifiedDocument);

        } catch (RuntimeException e) {
            // Handle the case when the document is not found or other error occurs
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
