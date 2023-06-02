package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.edl_backend.Models.specialitemodel;

public interface Specialiterepo extends MongoRepository<specialitemodel, String> {

}