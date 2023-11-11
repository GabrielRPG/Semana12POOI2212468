/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2y3;

/**
 *
 * @author Usuario
 */
public class Ejercicio2y3 {
    public static void main(String[] args) {
        // Crear un arreglo de tipo Empleado con 50 elementos
        Empleado[] empleados = new Empleado[50];

        // Llenar el arreglo con datos correspondientes a 50 empleados
        for (int i = 0; i < 50; i++) {
            empleados[i] = new Empleado();
            System.out.println("\nIngrese los datos del empleado #" + (i + 1));
            empleados[i].leerDatos();
        }

        // Visualizar los datos de todos los empleados
        System.out.println("\nDatos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.verDatos();
            System.out.println("----------------------");
        }
    }
}
