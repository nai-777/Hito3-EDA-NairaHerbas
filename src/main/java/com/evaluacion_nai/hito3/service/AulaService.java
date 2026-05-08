package com.evaluacion_nai.hito3.service;

import org.springframework.stereotype.Service;

@Service
public class AulaService {
    private int[][] aula = new int[5][15];

    public AulaService() {
        // Inicializar todos los asientos como desocupados (1)
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 15; j++)
                aula[i][j] = 1;
    }

    public String ocuparAsiento(int fila, int columna) {
        if (!valido(fila, columna)) return "Posición inválida.";
        if (aula[fila][columna] == 0) return "El asiento ya está ocupado.";
        aula[fila][columna] = 0;
        return "Asiento [" + fila + "][" + columna + "] ocupado.";
    }

    public String liberarAsiento(int fila, int columna) {
        if (!valido(fila, columna)) return "Posición inválida.";
        if (aula[fila][columna] == 1) return "El asiento ya está libre.";
        aula[fila][columna] = 1;
        return "Asiento [" + fila + "][" + columna + "] liberado.";
    }

    public int[][] mostrarMatriz() {
        return aula;
    }

    public int contarOcupados() {
        int count = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 15; j++)
                if (aula[i][j] == 0) count++;
        return count;
    }

    private boolean valido(int fila, int columna) {
        return fila >= 0 && fila < 5 && columna >= 0 && columna < 15;
    }
}