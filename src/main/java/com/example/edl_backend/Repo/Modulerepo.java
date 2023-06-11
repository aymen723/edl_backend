package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.modulemodel;

@Repository
public interface Modulerepo extends MongoRepository<modulemodel, String> {

}