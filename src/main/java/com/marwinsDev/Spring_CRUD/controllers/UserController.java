package com.marwinsDev.Spring_CRUD.controllers;

import com.marwinsDev.Spring_CRUD.models.User;
import com.marwinsDev.Spring_CRUD.repositorys.UserRepository;
import com.marwinsDev.Spring_CRUD.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> listar() {
        return userService.getAllUsers();
    }
}