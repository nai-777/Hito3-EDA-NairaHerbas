package com.evaluacion_nai.hito3.controller;

import com.evaluacion_nai.hito3.model.Estudiante;
import com.evaluacion_nai.hito3.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService service;

    @GetMapping("/agregar")
    public String agregar(@RequestParam int id, @RequestParam String nombre, @RequestParam double puntaje) {
        return service.agregarEstudiante(id, nombre, puntaje);
    }

    @GetMapping
    public List<Estudiante> mostrar() {
        return service.mostrarTodos();
    }

    @GetMapping("/ordenados")
    public List<Estudiante> ordenados() {
        return service.mostrarOrdenados();
    }

    @GetMapping("/buscar/{nombre}")
    public Estudiante buscar(@PathVariable String nombre) {
        return service.buscar(nombre);
    }
}