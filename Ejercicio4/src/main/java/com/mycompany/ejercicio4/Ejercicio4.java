/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Hora con valores iniciales
        Hora miHora = new Hora(12, 30, 45);

        int opcion;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Visualizar hora actual");
            System.out.println("2. Avanzar la hora");
            System.out.println("3. Poner a cero la hora");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    miHora.visualizar();
                    break;
                case 2:
                    miHora.avanzar();
                    System.out.println("Hora avanzada.");
                    break;
                case 3:
                    miHora.ponerACero();
                    System.out.println("Hora puesta a cero.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}