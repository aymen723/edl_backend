package com.example.edl_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.UserRepo;

@Service
public class userservice {

    @Autowired
    private UserRepo userrepo;

    public usermodel getuser(String id) {
        return userrepo.findById(id).get();
    }

}
