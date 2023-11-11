/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author Usuario
 */
public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor con parámetros
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Métodos de acceso
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    // Método para avanzar la hora
    public void avanzar() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Método para poner a cero la hora
    public void ponerACero() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    // Método para visualizar la hora
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }
}
