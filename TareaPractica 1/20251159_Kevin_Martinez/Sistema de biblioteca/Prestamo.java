import java.time.LocalDate;

/**
 * Representa un préstamo de un libro a un usuario.
 */
public class Prestamo {

    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    /**
     * Constructor de la clase Prestamo.
     * 
     * @param usuario Usuario que realiza el préstamo
     * @param libro Libro prestado
     */
    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

    /**
     * Realiza el préstamo si el libro está disponible.
     */
    public void prestarLibro() {
        if (libro.consultarDisponibilidad()) {
            libro.marcarComoPrestado();
            usuario.agregarLibro(libro);
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    /**
     * Devuelve el libro y actualiza su disponibilidad.
     */
    public void devolverLibro() {
        libro.marcarComoDisponible();
        usuario.removerLibro(libro);
        System.out.println("Libro devuelto correctamente.");
    }

    /**
     * Consulta los atributos de la clase de manera ordenada
     * @return los datos dentro de los atributos
     */
    public String imprimirDatos() {
        String datos = "Préstamo -> Fecha: " + fecha +
               ", Usuario: " + usuario.getNombre() +
               ", Libro: " + libro.getTitulo();
        
        return datos;
    }
}