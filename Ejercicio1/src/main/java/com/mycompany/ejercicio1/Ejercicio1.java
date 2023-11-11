/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Usuario
 */
public class Ejercicio1{
    public static void main(String[] args) {
        // Crear dos objetos inicializados y uno no inicializado
        Hora hora1 = new Hora();
        Hora hora2 = new Hora();
        Hora resultado = new Hora(); // No inicializado

        // Ingresar valores para los dos objetos inicializados
        System.out.println("Ingrese los datos para Hora 1:");
        hora1.leerDatos();

        System.out.println("\nIngrese los datos para Hora 2:");
        hora2.leerDatos();

        // Visualizar las horas iniciales
        System.out.println("\nHora 1:");
        hora1.visualizar();
        System.out.println("\nHora 2:");
        hora2.visualizar();

        // Sumar las dos horas y almacenar el resultado en el objeto no inicializado
        resultado.sumarHoras(hora1);
        resultado.sumarHoras(hora2);

        // Visualizar el resultado
        System.out.println("\nResultado de la suma:");
        resultado.visualizar();
    }
}


