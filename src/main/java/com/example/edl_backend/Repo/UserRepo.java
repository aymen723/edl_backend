package com.example.edl_backend.Repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.usermodel;

@Repository
public interface UserRepo extends MongoRepository<usermodel, ObjectId> {

}
