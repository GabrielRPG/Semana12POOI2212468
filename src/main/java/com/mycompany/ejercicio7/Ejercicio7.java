/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione el tipo de acceso:");
            System.out.println("1. Empleado");
            System.out.println("2. Supervisor");
            System.out.println("3. Recursos Humanos");
            System.out.println("4. Sunat");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    Empleado empleado = new Empleado("Gabriel", "Paucar", 80);
                    empleado.mostrarDatos();
                    empleado.calcularSalario();
                }
                case 2 -> {
                    AccesoSupervisor supervisor = new AccesoSupervisor("Gabriel", "Paucar", 80);
                    supervisor.mostrarDatos();
                    supervisor.calcularSalario();  // Método heredado
                }
                case 3 -> {
                    AccesoRecursosHumanos RHEmpleado = new AccesoRecursosHumanos("Gabriel", "Paucar", 20);
                    RHEmpleado.mostrarDatos();
                    RHEmpleado.calcularSalario();  // Método heredado con promoción
                    RHEmpleado.calcularPrimasSalariales();
                }
                case 4 -> {
                    AccesoSunat sunatEmpleado = new AccesoSunat("Gabriel", "Paucar", 80);
                    sunatEmpleado.mostrarDatos();
                    sunatEmpleado.jubilacion();
                }
                case 5 -> System.out.println("Saliendo del programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }
}
