/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;

/**
 *
 * @author Usuario
 */
public class AccesoSunat extends AccesoRecursosHumanos {
    public AccesoSunat(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de acceso: Sunat");
    }

    public void jubilacion() {
        if (edad >= 65) {
            System.out.println("Empleado jubilado.");
        } else {
            System.out.println("Aún no le corresponde jubilación.");
        }
    }
}
