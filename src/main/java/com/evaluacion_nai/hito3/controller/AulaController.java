package com.evaluacion_nai.hito3.controller;

import com.evaluacion_nai.hito3.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    private AulaService service;

    @GetMapping
    public int[][] mostrar() {
        return service.mostrarMatriz();
    }

    @GetMapping("/ocupados")
    public String ocupados() {
        return "Asientos ocupados: " + service.contarOcupados();
    }

    @GetMapping("/ocupar")
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocuparAsiento(fila, columna);
    }

    @GetMapping("/liberar")
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberarAsiento(fila, columna);
    }
}