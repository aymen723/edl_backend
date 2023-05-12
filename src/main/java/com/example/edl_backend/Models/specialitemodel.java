package com.example.edl_backend.Models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

public class specialitemodel {

    @Id
    private String Id;

    private String nom_speacialite;

    private ArrayList<modulecontroller> list_module;
}
