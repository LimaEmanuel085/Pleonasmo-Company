package com.marwinsDev.Spring_CRUD.services;
import com.marwinsDev.Spring_CRUD.models.User;
import com.marwinsDev.Spring_CRUD.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}