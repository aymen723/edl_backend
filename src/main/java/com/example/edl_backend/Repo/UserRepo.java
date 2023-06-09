package com.example.edl_backend.Repo;

import java.util.List;

// import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.edl_backend.Models.erole;
import com.example.edl_backend.Models.usermodel;

@Repository
public interface UserRepo extends MongoRepository<usermodel, String> {
    usermodel findByUsernameAndPassword(String username, String password);

    List<usermodel> findByRole(erole role);

}
