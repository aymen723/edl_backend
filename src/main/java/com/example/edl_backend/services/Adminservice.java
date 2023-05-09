package com.example.edl_backend.services;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Models.usermodel;
import com.example.edl_backend.Repo.UserRepo;

@Service
public class Adminservice {

    @Autowired
    private UserRepo userrepo;

    // public static usermodel usertest = new usermodel("null", "null", "null",
    // "null", "null", "null", "null", "null",
    // "null",
    // false,
    // erole.ADMIN);

    public List<usermodel> getalluser() {
        System.out.println(" test here " + userrepo.findAll());
        return userrepo.findAll();
    }

    public void adduser(usermodel user) {
        userrepo.insert(user);

    }

    public void deleteuserbyentite(usermodel user) {
        userrepo.delete(user);
    }

    public void deleteuserbyid(String id) {
        userrepo.deleteById(new ObjectId(id));

    }

    // public void updateuser(String id) {
    // userrepo.deleteById(new ObjectId(id));
    // }

    public void updateuser(usermodel user) {
        userrepo.save(user);
    }

}
