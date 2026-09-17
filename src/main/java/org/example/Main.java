package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;

        do {

            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("        GESTOR DE TURNOS DE CLEINTES");
            System.out.println("-----------------------------------------");
            System.out.println("1. Registrar cliente estandar");
            System.out.println("2. Registrar cliente VIP ");
            System.out.println("3. Atender siguiente cliente ");
            System.out.println("4. Salir");
            System.out.println("+----------------------------------------");

            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {

                case 1:
                    scanner.nextLine();

                    System.out.println("Ingresar nombre de cliente normal: ");
                    String nombre = scanner.nextLine();

                    if(nombre.isEmpty()) {
                        System.out.println("No se puede añaidr usuarios vacios. Escrbir un nombre");
                        break;
                    }

                    Service.agregarClienteNormal(nombre);
                    break;

                case 2:
                    scanner.nextLine();

                    System.out.println("Ingresar nombre de cliente VIP: ");
                    String nombreVIP = scanner.nextLine();

                    if(nombreVIP.isEmpty()) {
                        System.out.println("No se puede añaidr usuarios vacios. Escrbir un nombre");
                        break;
                    }

                    Service.agregarClienteVIP(nombreVIP);
                    break;

                case 3:
                    Service.atenderSiguienteCliente();
                    break;

                case 4:
                    System.out.println("\nSaliendo...");
                    break;

                default:
                    System.out.println("\nOpción no valida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}