package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.edl_backend.Models.examenmodel;

@Repository

public interface Examenrepo extends MongoRepository<examenmodel, String> {

}