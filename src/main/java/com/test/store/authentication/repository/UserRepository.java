package com.test.store.authentication.repository;

import com.test.store.authentication.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

  User findByUsername(String username);

}
