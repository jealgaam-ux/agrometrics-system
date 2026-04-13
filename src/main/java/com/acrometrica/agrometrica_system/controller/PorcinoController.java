package com.acrometrica.agrometrica_system.controller;

import com.acrometrica.agrometrica_system.entity.RegistroPorcino;
import com.acrometrica.agrometrica_system.service.RegistroPorcinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class PorcinoController {

    @Autowired
    private RegistroPorcinoService registroPorcinoService;

    @GetMapping("/porcino")
    public String formulario(Model model) {
        model.addAttribute("registro", new RegistroPorcino());
        return "porcino";
    }

    @PostMapping("/porcino/guardar")
    public String guardar(@ModelAttribute RegistroPorcino registro, Model model) {
        RegistroPorcino guardado = registroPorcinoService.guardarConCalculos(registro);
        model.addAttribute("registro", guardado);
        return "resultado-porcino";
    }

    @GetMapping("/porcino/lista")
    public String listar(
            @RequestParam(required = false) String nombreGranja,
            @RequestParam(required = false) LocalDate fecha,
            Model model
    ) {
        model.addAttribute("registros", registroPorcinoService.filtrar(nombreGranja, fecha));
        model.addAttribute("nombreGranja", nombreGranja);
        model.addAttribute("fecha", fecha);
        return "lista-porcino";
    }

    @GetMapping("/porcino/ver/{id}")
    public String verRegistro(@PathVariable Long id, Model model) {
        RegistroPorcino registro = registroPorcinoService.obtenerPorId(id);
        model.addAttribute("registro", registro);
        return "detalle-porcino";
    }
}