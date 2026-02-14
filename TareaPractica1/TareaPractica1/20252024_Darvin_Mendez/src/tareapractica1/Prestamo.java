/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;

import java.time.LocalDate;

/**
 * Clase Prestamo
 * Representa un préstamo de un libro a un usuario en la biblioteca.
 * Contiene información sobre el libro, el usuario y la fecha del préstamo.
 * 
 * Autor: Darvin Mendez
 */
public class Prestamo {

    private LocalDate fecha;   // Fecha del préstamo
    private Usuario usuario;   // Usuario que realiza el préstamo
    private Libro libro;       // Libro prestado

    /**
     * Constructor de Prestamo
     * 
     * @param fecha Fecha del préstamo
     * @param usuario Usuario que recibe el libro
     * @param libro Libro que se presta
     */
    public Prestamo(LocalDate fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    /**
     * Muestra en consola los detalles del préstamo
     */
    public void mostrarPrestamo() {
        System.out.println("Libro: " + libro.getTitulo() + 
                           ", Prestado a: " + usuario.getNombre() + 
                           ", Fecha: " + fecha);
    }
}