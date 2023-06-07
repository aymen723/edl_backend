package com.example.edl_backend.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialite")

public class specialitemodel {

    @Id
    private String Id;

    private String nom_specialite;

    private ArrayList<modulemodel> list_module;
}
