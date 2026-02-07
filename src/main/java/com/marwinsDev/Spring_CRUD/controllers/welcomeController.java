package com.marwinsDev.Spring_CRUD.controllers;

import org.springframework.web.bind.annotation.*;


@RestController
public class welcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Bem vindo ao Spring CRUD!";
    }
}