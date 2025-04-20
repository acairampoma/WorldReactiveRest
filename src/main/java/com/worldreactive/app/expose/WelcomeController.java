package com.worldreactive.app.expose.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "¡Bienvenido al mundo Bionic! Proyecto generado correctamente.";
    }
}
