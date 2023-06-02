package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.edl_backend.Models.affectationmodel;

public interface affectationrepo extends MongoRepository<affectationmodel, String> {

}
