/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que inicializa la hora a 0
    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor que inicializa la hora a valores dados por el usuario
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    // Método para visualizar la hora en formato HH:MM:SS
    public void visualizar() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    // Método para sumar dos objetos de tipo Hora
    public void sumarHoras(Hora otraHora) {
        this.segundos += otraHora.segundos;
        this.minutos += otraHora.minutos;
        this.horas += otraHora.horas;

        if (this.segundos >= 60) {
            this.segundos -= 60;
            this.minutos++;
        }
        if (this.minutos >= 60) {
            this.minutos -= 60;
            this.horas++;
        }
        if (this.horas >= 24) {
            this.horas -= 24;
        }
    }

    // Método para leer valores desde el teclado
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas: ");
        this.horas = scanner.nextInt();

        System.out.print("Ingrese los minutos: ");
        this.minutos = scanner.nextInt();

        System.out.print("Ingrese los segundos: ");
        this.segundos = scanner.nextInt();
    }
}
