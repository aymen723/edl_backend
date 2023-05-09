package com.example.edl_backend.Models;

import org.springframework.data.annotation.Id;

public class rolemodel {
    @Id
    private String id;

    private erole name;

    public rolemodel() {

    }

    public rolemodel(erole name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public erole getName() {
        return name;
    }

    public void setName(erole name) {
        this.name = name;
    }
}
