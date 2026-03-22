/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;

import java.util.ArrayList;

/**
 * Clase Usuario
 * Representa a un usuario de la biblioteca.
 * Permite prestar y devolver libros, y mantiene un registro de los libros prestados.
 * 
 * Autor: Darvin Mendez
 */
public class Usuario {

    private String nombre;                   // Nombre del usuario
    private int id;                           // ID único del usuario
    private ArrayList<Libro> librosPrestados; // Lista de libros prestados

    /**
     * Constructor de Usuario
     * 
     * @param nombre Nombre del usuario
     * @param id ID único del usuario
     */
    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Presta un libro al usuario si está disponible
     * 
     * @param libro Libro que se desea prestar
     */
    public void prestarLibro(Libro libro) {
        if (libro.consultarDisponibilidad()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
            System.out.println(nombre + " ha prestado: " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
        }
    }

    /**
     * Devuelve un libro prestado por el usuario
     * 
     * @param libro Libro que se desea devolver
     */
    public void devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setDisponible(true);
            System.out.println(nombre + " ha devuelto: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no tiene el libro: " + libro.getTitulo());
        }
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getId() { return id; }
}