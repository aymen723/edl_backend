package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.affectationmodel;

@Repository

public interface affectationrepo extends MongoRepository<affectationmodel, String> {

}
