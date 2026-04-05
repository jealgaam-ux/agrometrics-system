package com.acrometrica.agrometrica_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String inicio() {
        return "Funciona";
    }

    @GetMapping("/hola")
    public String hola() {
        return "Hola desde Spring Boot";
    }
}