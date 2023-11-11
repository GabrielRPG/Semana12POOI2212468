/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadena miCadena = new Cadena();

        int opcion;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Ingresar contenido");
            System.out.println("2. Visualizar cadena y longitud");
            System.out.println("3. Obtener carácter en posición");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el contenido de la cadena: ");
                    String contenido = scanner.nextLine();
                    miCadena = new Cadena(contenido);
                    break;
                case 2:
                    System.out.println("Contenido de la cadena: " + miCadena.getContenido());
                    System.out.println("Longitud de la cadena: " + miCadena.getLongitud());
                    break;
                case 3:
                    System.out.print("Ingrese la posición para obtener el carácter: ");
                    int posicion = scanner.nextInt();
                    char caracterEnPosicion = miCadena.caracter(posicion);
                    if (caracterEnPosicion != '\0') {
                        System.out.println("Carácter en posición " + posicion + ": " + caracterEnPosicion);
                    } else {
                        System.out.println("Posición no válida.");
                    }
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

