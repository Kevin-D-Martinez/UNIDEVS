/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapractica1;

import java.time.LocalDate;

/**
 * Clase MainBiblioteca
 * Clase de prueba para el Ejercicio 1 – Sistema de Biblioteca
 * Muestra cómo crear libros, usuarios, prestar y devolver libros, y registrar préstamos.
 * 
 * Autor: Darvin Mendez
 */
public class MainBiblioteca {

    public static void main(String[] args) {

        // Crear libros
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "12345", true);
        Libro libro2 = new Libro("1984", "George Orwell", "67890", true);

        // Crear usuario
        Usuario usuario1 = new Usuario("Darvin", 1);

        // Prestar libros al usuario
        usuario1.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);

        // Crear préstamo para registro (no afecta disponibilidad, solo registro)
        Prestamo prestamo1 = new Prestamo(LocalDate.now(), usuario1, libro1);
        prestamo1.mostrarPrestamo();

        // Devolver libro
        usuario1.devolverLibro(libro1);
    }
}