package com.marwinsDev.Spring_CRUD.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {
    @PostMapping("/users")
    public String createUser(@RequestBody String user) {
        // Lógica para criar um usuário
        return "Usuário criado: " + user;
    }
}