package com.acrometrica.agrometrica_system.controller;

import com.acrometrica.agrometrica_system.entity.Usuario;
import com.acrometrica.agrometrica_system.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/inicio")
    public String inicio(Model model, Authentication auth) {

        String correo = auth.getName();

        Usuario usuario = usuarioRepository.findByCorreo(correo).orElse(null);

        model.addAttribute("usuario", usuario);

        return "inicio";
    }
}