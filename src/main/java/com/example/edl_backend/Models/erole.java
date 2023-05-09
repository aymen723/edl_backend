package com.example.edl_backend.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonFormat(shape = JsonFormat.Shape.STRING)
public enum erole {
    @JsonProperty("PRESIDENT_CFD")
    PRESIDENT_CFD,
    @JsonProperty("VICE_DOYEN")
    VICE_DOYEN,
    @JsonProperty("ADMIN")
    ADMIN,
    @JsonProperty("ENSEIGNANT")
    ENSEIGNANT,
    @JsonProperty("CANDIDAT")
    CANDIDAT

}
