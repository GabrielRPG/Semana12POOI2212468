/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class LAN {
    protected String topology;
    protected List<String> nodes;
    protected List<Double> packetTimes;

    public LAN() {
        this.topology = "";
        this.nodes = new ArrayList<>();
        this.packetTimes = new ArrayList<>();
    }

    public void enumerateNodes() {
        System.out.println("Nodos en la LAN:");
        for (String node : nodes) {
            System.out.println(node);
        }
    }

    public void addNode(String node) {
        nodes.add(node);
        System.out.println("Nodo " + node + " añadido a la LAN.");
    }

    public void removeNode(String node) {
        if (nodes.contains(node)) {
            nodes.remove(node);
            System.out.println("Nodo " + node + " eliminado de la LAN.");
        } else {
            System.out.println("Nodo " + node + " no encontrado en la LAN.");
        }
    }

    public void configureNetwork(String topology) {
        this.topology = topology;
        System.out.println("LAN configurada con topología " + topology + ".");
    }

    public void setPacketSize(int size) {
        System.out.println("Tamaño del paquete configurado a " + size + " bytes.");
    }

    public void sendPacket(String source, String destination) {
        double processingTime = Math.random() * 10; // Simulación de tiempo de procesamiento
        packetTimes.add(processingTime);

        System.out.println("Paquete enviado desde " + source + " a " + destination + ".");
        System.out.println("Tiempo de procesamiento: " + processingTime + " unidades de tiempo.");
    }

    public void broadcastPacket(String source) {
        double processingTime = Math.random() * 10; // Simulación de tiempo de procesamiento
        packetTimes.add(processingTime);

        System.out.println("Paquete transmitido desde " + source + " a todos los nodos.");
        System.out.println("Tiempo de procesamiento: " + processingTime + " unidades de tiempo.");
    }

    public void calculateAverageTime() {
        if (packetTimes.isEmpty()) {
            System.out.println("No hay paquetes para calcular el tiempo promedio.");
            return;
        }

        double totalProcessingTime = 0;
        for (double time : packetTimes) {
            totalProcessingTime += time;
        }

        double averageTime = totalProcessingTime / packetTimes.size();
        System.out.println("Tiempo promedio de procesamiento de paquetes: " + averageTime + " unidades de tiempo.");
    }
}

