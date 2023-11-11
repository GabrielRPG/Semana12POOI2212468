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
public class AccesoSupervisor extends Empleado{
    
    public AccesoSupervisor (String nombre,String apellido,int edad){
         super(nombre, apellido, edad);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de acceso: Supervisor");
    }

    @Override
    public void calcularSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas durante el mes: ");
        int horasTrabajadas = scanner.nextInt();
        salario = horasTrabajadas * 20.0;  // Actualizar el salario
        System.out.println("Salario aproximado del mes: $" + salario);

        if (salario > 2500) {
            System.out.println("Promover");
            salario += 1000;  // Sumar 1000 al salario si es promovido
            System.out.println("Nuevo salario con promoción: $" + salario);
        } else {
            System.out.println("Despedir");
        }
    }
}
