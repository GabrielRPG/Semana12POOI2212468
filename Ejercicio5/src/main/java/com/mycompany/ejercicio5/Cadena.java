/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author Usuario
 */
public class Cadena {
    private int longitud;
    private String contenido;

    public Cadena() {
        this.longitud = 1;
        this.contenido = "";
    }

    public Cadena(String contenido) {
        this.longitud = contenido.length();
        this.contenido = contenido;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContenido() {
        return contenido;
    }

    public char caracter(int i) {
        if (i >= 1 && i <= longitud) {
            return contenido.charAt(i);
        } else {
            return '\0'; 
        }
    }

    public void visualizar() {
        System.out.println("Longitud: " + longitud);
        System.out.println("Contenido: " + contenido);
    }
}


