package com.evaluacion_nai.hito3.controller;

import com.evaluacion_nai.hito3.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notas")
public class CalificacionesController {

    @Autowired
    private CalificacionesService service;

    @GetMapping("/agregar")
    public String agregar(@RequestParam double valor) {
        return service.agregarCalificacion(valor);
    }

    @GetMapping
    public List<Double> mostrar() {
        return service.mostrarTodas();
    }

    @GetMapping("/promedio")
    public String promedio() {
        return "Promedio: " + service.calcularPromedio();
    }

    @GetMapping("/max")
    public String max() {
        return "Nota máxima: " + service.obtenerMax();
    }

    @GetMapping("/min")
    public String min() {
        return "Nota mínima: " + service.obtenerMin();
    }
}