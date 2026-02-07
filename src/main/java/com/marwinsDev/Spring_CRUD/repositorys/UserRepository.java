package com.marwinsDev.Spring_CRUD.repositorys;

import com.marwinsDev.Spring_CRUD.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, long> {
    Optional<User> findByEmail(String email);
    List<User> findNameContainingIgnoreCase(String name)
}
