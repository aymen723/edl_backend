package com.example.edl_backend.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.edl_backend.Models.infoconcourmodel;

public interface Concurrepo extends MongoRepository<infoconcourmodel, String> {

}
