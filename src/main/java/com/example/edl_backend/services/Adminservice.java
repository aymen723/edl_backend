package com.example.edl_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.UserRepo;

@Service
public class Adminservice {

    @Autowired
    private UserRepo userrepo;

    public List<usermodel> getalluser() {
        System.out.println(" test here " + userrepo.findAll());
        return userrepo.findAll();
    }

    public void adduser(usermodel user) {
        userrepo.insert(user);

    }

    public void deleteuserbyid(String id) {
        userrepo.deleteById(id);

    }

    public void updateuser(String userId, usermodel updatedUser) {
        usermodel existingUser = userrepo.findById(userId).orElseThrow(IllegalArgumentException::new);

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
            existingUser.setExaman(updatedUser.getExaman());
            existingUser.setNbr_copies(updatedUser.getNbr_copies());

            // Update more fields as required

            userrepo.save(existingUser);
        }
    }

}
