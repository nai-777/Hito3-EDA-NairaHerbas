package com.evaluacion_nai.hito3.service;

import com.evaluacion_nai.hito3.estructuras.ListaEstudiantes;
import com.evaluacion_nai.hito3.model.Estudiante;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudiantesService {
    private ListaEstudiantes lista = new ListaEstudiantes();

    public String agregarEstudiante(int id, String nombre, double puntaje) {
        lista.insertar(new Estudiante(id, nombre, puntaje));
        return "Estudiante " + nombre + " agregado.";
    }

    public List<Estudiante> mostrarTodos() {
        return lista.mostrarTodos();
    }

    public List<Estudiante> mostrarOrdenados() {
        return lista.ordenadosPorPuntaje();
    }

    public Estudiante buscar(String nombre) {
        return lista.buscarPorNombre(nombre);
    }
}