/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase de prueba para el Ejercicio 3 – Empresa de Telefonía
 * Autor: Darvin Mendez
 */
public class MainTelefonia {
    public static void main(String[] args) {

        // Crear planes
        Plan plan1 = new Plan(500, 5, 50);
        Plan plan2 = new Plan(1000, 10, 80);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Perez", "809-123-4567", plan1);
        Cliente cliente2 = new Cliente("Maria Gomez", "809-987-6543", plan2);

        // Crear facturas
        Factura factura1 = new Factura(cliente1, 600, 6); // consumo real
        Factura factura2 = new Factura(cliente2, 950, 12); // consumo real

        // Generar facturas
        factura1.generarFactura();
        factura2.generarFactura();
    }
}