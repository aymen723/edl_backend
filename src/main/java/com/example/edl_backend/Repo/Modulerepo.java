package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.edl_backend.Models.modulemodel;

public interface Modulerepo extends MongoRepository<modulemodel, String> {

}