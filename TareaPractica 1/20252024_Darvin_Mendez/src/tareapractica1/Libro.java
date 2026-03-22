/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;

/**
 * Clase Libro
 * Representa un libro de la biblioteca con título, autor, ISBN y disponibilidad
 * 
 * Autor: Darvin Mendez
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    /**
     * Constructor de la clase Libro
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param ISBN Código ISBN del libro
     * @param disponible Estado de disponibilidad del libro (true = disponible, false = prestado)
     */
    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    /**
     * Consulta si el libro está disponible
     * @return true si está disponible, false si está prestado
     */
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    /**
     * Cambia el estado de disponibilidad del libro
     * @param disponible nuevo estado de disponibilidad
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Getters para los atributos privados

    /**
     * Obtiene el título del libro
     * @return título
     */
    public String getTitulo() { 
        return titulo; 
    }

    /**
     * Obtiene el autor del libro
     * @return autor
     */
    public String getAutor() { 
        return autor; 
    }

    /**
     * Obtiene el código ISBN del libro
     * @return ISBN
     */
    public String getISBN() { 
        return ISBN; 
    }
}