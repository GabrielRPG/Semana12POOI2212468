/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        LAN lan = new LAN();

        lan.addNode("Nodo1");
        lan.addNode("Nodo2");
        lan.enumerateNodes();

        lan.configureNetwork("Bus");
        lan.enumerateNodes();

        lan.setPacketSize(100);
        lan.sendPacket("Nodo1", "Nodo2");
        lan.broadcastPacket("Nodo1");
        lan.calculateAverageTime();
    }
}
