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
public class AccesoRecursosHumanos extends AccesoSupervisor{
   public AccesoRecursosHumanos(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de acceso: Recursos Humanos");
    }

    public void calcularPrimasSalariales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días trabajados por el empleado: ");
        int diasTrabajados = scanner.nextInt();
        double primasSalariales = (diasTrabajados * salario) / 360.0;
        System.out.println("Primas Salariales: S/." + primasSalariales);
    }

   
} 

