package org.example;

import java.util.LinkedList;

public class Service {
    static LinkedList<String> fila = new LinkedList<>();

    public static void agregarClienteNormal(String nombre) {
        if(!nombre.isEmpty()) {
            fila.addLast(nombre);
            System.out.println("Cliente normal agregado: " + nombre);
        }
    }

    public static void agregarClienteVIP(String nombre) {
        if(!nombre.isEmpty()) {
            fila.addFirst(nombre);
            System.out.println("Cliente vip agregado: " + nombre);
        }
    }

    public static void atenderSiguienteCliente() {
        if(fila.isEmpty()) {
            System.out.println("No hay clientes para antender.");
        }else {
            String cliente = fila.removeFirst();
            System.out.println("Atendiendo a: " + cliente);
        }
    }
}
