package com.example.edl_backend.Models;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
@EntityScan
public class usermodel {

    @Id
    private String id;

    private String fname;

    private String lname;

    private String arabicname;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String code;

    private Date birthdate;

    private String specialite;

    private Integer nbr_copies;

    private boolean state;

    // @DBRef
    private erole role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getArabicname() {
        return arabicname;
    }

    public void setArabicname(String arabicname) {
        this.arabicname = arabicname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Integer getNbr_copies() {
        return nbr_copies;
    }

    public void setNbr_copies(Integer nbr_copies) {
        this.nbr_copies = nbr_copies;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public erole getRole() {
        return role;
    }

    public void setRole(erole role) {
        this.role = role;
    }

    public usermodel(String id, String fname, String lname, String arabicname, String username, String password,
            String email, String phone, String code, Date birthdate, String specialite,
            Integer nbr_copies, boolean state, erole role) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.arabicname = arabicname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.code = code;
        this.birthdate = birthdate;
        this.specialite = specialite;
        this.nbr_copies = nbr_copies;
        this.state = state;
        this.role = role;
    }

    public usermodel() {
    }

}
