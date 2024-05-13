package com.gustavomarques.testemongodb1.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gustavomarques.testemongodb1.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
