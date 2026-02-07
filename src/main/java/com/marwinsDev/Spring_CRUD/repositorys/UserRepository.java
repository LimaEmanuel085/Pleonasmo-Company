package com.marwinsDev.Spring_CRUD.repositorys;

import com.marwinsDev.Spring_CRUD.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
