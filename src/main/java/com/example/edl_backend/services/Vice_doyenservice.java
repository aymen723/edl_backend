package com.example.edl_backend.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.edl_backend.Repo.Concurrepo;
import com.example.edl_backend.Repo.Modulerepo;
import com.example.edl_backend.Repo.Specialiterepo;
import com.example.edl_backend.Repo.UserRepo;
import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.infoconcourmodel;
import com.example.edl_backend.Models.modulemodel;
import com.example.edl_backend.Models.specialitemodel;
import com.example.edl_backend.Models.usermodel;

@Service
public class Vice_doyenservice {

    @Autowired
    public Concurrepo concur;

    @Autowired
    public Specialiterepo specialite;

    @Autowired
    public Modulerepo module;

    @Autowired
    private UserRepo userrepo;

    public void addconcur(infoconcourmodel infoconcur) {

        concur.insert(infoconcur);
    }

    public void suppconcur(String id) {

        concur.deleteById(id);
    }

    public infoconcourmodel modconcur(String id, infoconcourmodel updatedDocument) {

        infoconcourmodel existingDocument = concur.findById(id).orElse(null);

        if (existingDocument != null) {
            existingDocument.setId(updatedDocument.getId());
            existingDocument.setDate_debut(updatedDocument.getDate_debut());
            existingDocument.setDete_fin(updatedDocument.getDete_fin());
            existingDocument.setSpecialite(updatedDocument.getSpecialite());
            existingDocument.setIdmodules(updatedDocument.getIdmodules());
            existingDocument.setState(updatedDocument.isState());
            existingDocument.setLieu(updatedDocument.getLieu());

            return concur.save(existingDocument);
        } else {
            // Handle the case when the document with the given ID is not found
            throw new RuntimeException("Document not found");
        }
    }

    public List<infoconcourmodel> getallconcurs() {
        // System.out.println(" test here " + userrepo.findAll());
        return concur.findAll();
    }

    public void addspeacialite(specialitemodel specialiteinfo) {

        specialite.insert(specialiteinfo);

    }

    public void suppspeacialite(String id) {

        specialite.deleteById(id);
    }

    public specialitemodel modspeacialite(String id, specialitemodel updatedDocument) {

        specialitemodel existingDocument = specialite.findById(id).orElse(null);

        if (existingDocument != null) {
            existingDocument.setId(updatedDocument.getId());
            existingDocument.setNom_specialite(updatedDocument.getNom_specialite());
            existingDocument.setDomaine(updatedDocument.getDomaine());
            existingDocument.setFilière(updatedDocument.getFilière());
            existingDocument.setNiveaux(updatedDocument.getNiveaux());
            existingDocument.setList_module(updatedDocument.getList_module());

            return specialite.save(existingDocument);
        } else {
            // Handle the case when the document with the given ID is not found
            throw new RuntimeException("Document not found");
        }
    }

    public List<specialitemodel> getallspeacialite() {
        // System.out.println(" test here " + userrepo.findAll());
        return specialite.findAll();
    }

    public void addmodule(modulemodel moduleinfo) {

        module.insert(moduleinfo);

    }

    public void suppmodule(String id) {

        module.deleteById(id);
    }

    public modulemodel modmodule(String id, modulemodel updatedDocument) {

        modulemodel existingDocument = module.findById(id).orElse(null);

        if (existingDocument != null) {
            existingDocument.setCoeff(updatedDocument.getCoeff());
            existingDocument.setCredit(updatedDocument.getCoeff());
            existingDocument.setNom_module(updatedDocument.getNom_module());
            existingDocument.setId(updatedDocument.getId());

            return module.save(existingDocument);
        } else {
            // Handle the case when the document with the given ID is not found
            throw new RuntimeException("Document not found");
        }
    }

    public List<modulemodel> getallmodules() {
        // System.out.println(" test here " + userrepo.findAll());
        return module.findAll();
    }

    public List<usermodel> getalluser() {
        System.out.println(" test here " + userrepo.findAll());
        return userrepo.findAll();
    }

    public List<usermodel> getuserbyrole(erole role) {
        System.out.println(" test here " + userrepo.findAll());
        return userrepo.findByRole(role);
    }

    public Optional<modulemodel> findbyid(String id) {

        return module.findById(id);
    }

    public usermodel generatcode(String userId, usermodel updatedUser) {
        usermodel existingUser = userrepo.findById(userId).orElseThrow(null);
        UUID randomUUID = UUID.randomUUID();
        String randomStr = randomUUID.toString().replaceAll("_", "");

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
            existingUser.setCode(randomStr);
            existingUser.setState(updatedUser.isState());

            return userrepo.save(existingUser);
        } else {
            throw new RuntimeException("Document not found");
        }
    }
}
