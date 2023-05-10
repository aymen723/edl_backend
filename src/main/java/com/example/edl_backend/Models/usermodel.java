package com.example.edl_backend.Models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
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

    // private Date birthdate;

    private Date birthdate;

    private boolean state;

    // @DBRef
    private erole role;

    public usermodel() {

    }

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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
            String email, String phone, Date birthdate, boolean state, erole role) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.arabicname = arabicname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.birthdate = birthdate;
        this.state = state;
        this.role = role;
    }

}
