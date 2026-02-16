import java.util.Objects;

/**
 * Representa un libro dentro del sistema de biblioteca.
 */
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    /**
     * Constructor de la clase Libro.
     * 
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param isbn Código ISBN único
     */
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true; // Por defecto está disponible
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    /**
     * Consulta si el libro está disponible.
     * 
     * @return true si está disponible, false si está prestado
     */
    public boolean consultarDisponibilidad() {
        return disponible;
    }

    /**
     * Cambia el estado del libro a no disponible.
     */
    public void marcarComoPrestado() {
        this.disponible = false;
    }

    /**
     * Cambia el estado del libro a disponible.
     */
    public void marcarComoDisponible() {
        this.disponible = true;
    }

    /**
     * Consulta los atributos de la clase de manera ordenada
     * @return los datos dentro de los atributos
     */
    public String imprimirDatos() {
        String datos = "Libro: " + titulo + " - " + autor + " (ISBN: " + isbn + ")";
        
        return datos;
    }
}