package TareaHerencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Clase principal para ejecutar el programa
 * y probar el funcionamiento de las clases.
 * 
 * @author Dalvi
 */
public class Main {

    public static void main(String[] args) {

        // Crear objeto de AutoMovil
        AutoMovil auto = new AutoMovil();

        // Asignar valores usando setters
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAnio(2023);
        auto.setColor("Blanco");

        // Mostrar información
        System.out.println("Marca: " + auto.getMarca());

        // Ejecutar métodos
        auto.encender();
        auto.acelerar();

        System.out.println("\n--- Honda Civic ---");

        // Crear objeto de HondaCivic
        HondaCivic honda = new HondaCivic();

        // Asignar valores
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAnio(2024);
        honda.setColor("Rojo");

        // Mostrar información
        System.out.println("Marca: " + honda.getMarca());

        // Ejecutar métodos sobrescritos
        honda.encender();
        honda.acelerar();
    }
}