package com.axis.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.axis.demo.model.User;

public interface UserRepository extends MongoRepository<User,String> {

}
