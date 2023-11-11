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
public class Empleado extends AccesoEmpleado {
    protected double salario;

    public Empleado(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de acceso: Empleado");
    }

    public void calcularSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas trabajadas durante el mes: ");
        int horasTrabajadas = scanner.nextInt();
        salario = horasTrabajadas * 20.0;  // Multiplicar por 20 para obtener el salario
        System.out.println("Salario aproximado del mes: S/." + salario);
    }

    
}
