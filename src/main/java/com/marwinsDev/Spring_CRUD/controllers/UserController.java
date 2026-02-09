package com.marwinsDev.Spring_CRUD.controllers;

import com.marwinsDev.Spring_CRUD.models.User;
import com.marwinsDev.Spring_CRUD.repositorys.UserRepository;
import com.marwinsDev.Spring_CRUD.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> list() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        if (updatedUser == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(updatedUser);
    }

    @PostMapping("/user")
    //ResponseEntity é uma classe do Spring que representa a resposta HTTP, permitindo controlar o status code, os headers e o corpo da resposta.
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @DeleteMapping("/user/{id}")
    //Classe do spring para trabalhos HTTP
    public ResponseEntity<User> deleteUser(@PathVariable Long id) { // Anotação para indicar que o valor do ID será extraído da URL
        User deletedUser = userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(deletedUser);
    }
}
