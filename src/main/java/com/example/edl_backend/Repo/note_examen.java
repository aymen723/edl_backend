package com.example.edl_backend.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.note_examenmodel;
import com.example.edl_backend.Models.usermodel;

@Repository

public interface note_examen extends MongoRepository<note_examenmodel, String> {
    List<note_examenmodel> findByetd(usermodel etd);

}
