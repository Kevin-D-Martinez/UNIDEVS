/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase de prueba para el Ejercicio 2 – Sistema de Vehículos
 * Se crean objetos Vehiculo usando distintos constructores y se prueba calcularMantenimiento()
 * Autor: Darvin Mendez
 */
public class MainVehiculos {
    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo(); // Constructor por defecto
        Vehiculo v2 = new Vehiculo("ABC123"); // Constructor solo con placa
        Vehiculo v3 = new Vehiculo("XYZ789", "Toyota", "Corolla"); // Constructor completo

        // Pruebas vehículo 1
        System.out.println("Vehiculo 1: " + v1.getPlaca() + " - " + v1.getMarca() + " - " + v1.getModelo());
        System.out.println("Costo mantenimiento (1000 km): $" + v1.calcularMantenimiento(1000));
        System.out.println("Costo mantenimiento completo (1000 km): $" + v1.calcularMantenimiento(1000, "completo"));

        // Pruebas vehículo 2
        System.out.println("\nVehiculo 2: " + v2.getPlaca() + " - " + v2.getMarca() + " - " + v2.getModelo());
        System.out.println("Costo mantenimiento (500 km): $" + v2.calcularMantenimiento(500));
        System.out.println("Costo mantenimiento básico (500 km): $" + v2.calcularMantenimiento(500, "basico"));

        // Pruebas vehículo 3
        System.out.println("\nVehiculo 3: " + v3.getPlaca() + " - " + v3.getMarca() + " - " + v3.getModelo());
        System.out.println("Costo mantenimiento (1500 km): $" + v3.calcularMantenimiento(1500));
        System.out.println("Costo mantenimiento completo (1500 km): $" + v3.calcularMantenimiento(1500, "completo"));
    }
}