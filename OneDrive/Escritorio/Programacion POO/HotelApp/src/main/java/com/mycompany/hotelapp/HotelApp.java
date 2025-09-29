/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelapp;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author chris
 */
public class HotelApp {
public static void main(String[] args) {
        // Arreglo habitaciones
        Habitacion[] inventario = new Habitacion[] {
            new HabitacionSencilla(101, 800.0,  false, 1),
            new HabitacionSencilla(102, 850.0,  false, 2),
            new HabitacionSencilla(103, 900.0,  true,  1),
            new HabitacionDoble(201, 1200.0, false, 1),
            new HabitacionDoble(202, 1300.0, true,  2),
            new HabitacionDoble(203, 1250.0, false, 1),
            new Suite(301, 2200.0, false, true,  true),
            new Suite(302, 2500.0, false, false, true)
        };
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== MENU DEL HOTEL ===");
            System.out.println("1. Mostrar informacion de todas las habitaciones");
            System.out.println("2. Reservar habitacion (por numero)");
            System.out.println("3. Liberar habitacion (por numero)");
            System.out.println("0. Salir");
            int opcion = leerEntero(sc, "Opcion: ");
            switch (opcion) {
                case 1:
                    System.out.println("\n=== LISTA DE HABITACIONES ===");
                    for (int i = 0; i < inventario.length; i++) {
                        System.out.println("Habitacion Num. " + i + ":");
                        System.out.println(inventario[i].mostrarInfo());
                        System.out.println("---------------------------");
                    }
                    break;
                case 2:
                    int numReserva = leerEntero(sc, "Numero de habitacion a reservar: ");
                    Habitacion habReserva = buscarPorNumero(inventario, numReserva);
                    if (habReserva == null) {
                        System.out.println("No existe la habitacion " + numReserva + ".");
                        break;
                    }
                    if (habReserva.ocupar()) {
                        System.out.println("Habitacion " + numReserva + " reservada con exito.");
                        // pedir noches y calcular costo
                        int noches = leerEntero(sc, "Numero de noches: ");
                        if (noches <= 0) {
                            System.out.println("El numero de noches debe ser mayor que 0.");
                            break;
                        }
                        double total = habReserva.calcularCosto(noches);
                        System.out.printf("Costo total por %d noches: $%.2f%n", noches, total);
                    } else {
                        System.out.println("La habitacion " + numReserva + " ya estaba ocupada.");
                    }
                    break;              
                case 3:
                    int numLiberar = leerEntero(sc, "Numero de habitacion a liberar: ");
                    Habitacion habLiberar = buscarPorNumero(inventario, numLiberar);
                    if (habLiberar == null) {
                        System.out.println("No existe la habitacion " + numLiberar + ".");
                    } else if (habLiberar.liberar()) {
                        System.out.println("Habitacion " + numLiberar + " liberada.");
                    } else {
                        System.out.println("La habitacion " + numLiberar + " ya estaba disponible.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema. Gracias.");
                    sc.close();
                    return; // salir del main

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
            }
        }
    }

    // Trycatch
    private static int leerEntero(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Debe ser un numero entero.");
                sc.nextLine(); // limpiar buffer
            }
        }
    }
    private static Habitacion buscarPorNumero(Habitacion[] inv, int numero) {
        for (int i = 0; i < inv.length; i++) {
            if (inv[i].getNumHabi() == numero) return inv[i];
        }
        return null;
    }    }

       
         
    

