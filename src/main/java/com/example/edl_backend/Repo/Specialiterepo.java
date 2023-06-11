package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.specialitemodel;

@Repository
public interface Specialiterepo extends MongoRepository<specialitemodel, String> {

}