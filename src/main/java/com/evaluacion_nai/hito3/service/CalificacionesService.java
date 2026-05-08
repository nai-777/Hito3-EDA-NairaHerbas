package com.evaluacion_nai.hito3.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalificacionesService {
    private double[] calificaciones = new double[110];
    private int contador = 0;

    public String agregarCalificacion(double valor) {
        if (contador >= 110) {
            return "Arreglo lleno, no se pueden agregar más calificaciones.";
        }
        calificaciones[contador] = valor;
        contador++;
        return "Calificación " + valor + " agregada en posición " + (contador - 1);
    }

    public List<Double> mostrarTodas() {
        List<Double> lista = new ArrayList<>();
        for (int i = 0; i < contador; i++) {
            lista.add(calificaciones[i]);
        }
        return lista;
    }

    public double calcularPromedio() {
        if (contador == 0) return 0;
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += calificaciones[i];
        }
        return suma / contador;
    }

    public double obtenerMax() {
        if (contador == 0) return 0;
        double max = calificaciones[0];
        for (int i = 1; i < contador; i++) {
            if (calificaciones[i] > max) max = calificaciones[i];
        }
        return max;
    }

    public double obtenerMin() {
        if (contador == 0) return 0;
        double min = calificaciones[0];
        for (int i = 1; i < contador; i++) {
            if (calificaciones[i] < min) min = calificaciones[i];
        }
        return min;
    }
}