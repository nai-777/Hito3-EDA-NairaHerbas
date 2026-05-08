package com.evaluacion_nai.hito3.estructuras;

import com.evaluacion_nai.hito3.model.Estudiante;

public class Nodo {
    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}