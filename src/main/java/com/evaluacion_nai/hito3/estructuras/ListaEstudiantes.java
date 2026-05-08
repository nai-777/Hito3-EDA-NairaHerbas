package com.evaluacion_nai.hito3.estructuras;

import com.evaluacion_nai.hito3.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class ListaEstudiantes {
    private Nodo cabeza;

    public ListaEstudiantes() {
        this.cabeza = null;
    }

    public void insertar(Estudiante estudiante) {
        Nodo nuevo = new Nodo(estudiante);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public List<Estudiante> mostrarTodos() {
        List<Estudiante> lista = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            lista.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return lista;
    }

    public List<Estudiante> ordenadosPorPuntaje() {
        List<Estudiante> aprobados = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.getPuntaje() >= 60) {
                aprobados.add(actual.estudiante);
            }
            actual = actual.siguiente;
        }
        // Bubble sort de mayor a menor
        for (int i = 0; i < aprobados.size() - 1; i++) {
            for (int j = 0; j < aprobados.size() - 1 - i; j++) {
                if (aprobados.get(j).getPuntaje() < aprobados.get(j + 1).getPuntaje()) {
                    Estudiante temp = aprobados.get(j);
                    aprobados.set(j, aprobados.get(j + 1));
                    aprobados.set(j + 1, temp);
                }
            }
        }
        return aprobados;
    }

    public Estudiante buscarPorNombre(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return actual.estudiante;
            }
            actual = actual.siguiente;
        }
        return null;
    }
}