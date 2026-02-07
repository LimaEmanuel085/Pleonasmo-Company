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

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User deleteUser(Long id) {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            System.out.println("User with ID " + id + " not found.");
        }
        userRepository.delete(user);
        System.out.println("User with ID " + id + " has been deleted.");
        return user;
    }
}