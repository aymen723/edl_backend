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

    public usermodel updateuser(String userId, usermodel updatedUser) {
        usermodel existingUser = userrepo.findById(userId).orElseThrow(null);

        if (existingUser != null) {
            // Update the fields you want to modify
            existingUser.setId(updatedUser.getId());
            existingUser.setFname(updatedUser.getFname());
            existingUser.setLname(updatedUser.getFname());
            existingUser.setArabicname(updatedUser.getFname());
            existingUser.setUsername(updatedUser.getFname());
            existingUser.setPassword(updatedUser.getFname());
            existingUser.setEmail(updatedUser.getFname());
            existingUser.setPhone(updatedUser.getFname());
            existingUser.setBirthdate(updatedUser.getBirthdate());
            existingUser.setSpecialite(updatedUser.getSpecialite());
            existingUser.setNbr_copies(updatedUser.getNbr_copies());
            existingUser.setCode(updatedUser.getCode());
            existingUser.setState(updatedUser.isState());

            return userrepo.save(existingUser);
        } else {
            throw new RuntimeException("Document not found");
        }
    }

}
