/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2y3;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numeroEmpleado;

    // Método para leer los datos del teclado
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el número de empleado: ");
        numeroEmpleado = scanner.nextInt();
    }

    // Método para visualizar los datos en pantalla
    public void verDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
    }
}
