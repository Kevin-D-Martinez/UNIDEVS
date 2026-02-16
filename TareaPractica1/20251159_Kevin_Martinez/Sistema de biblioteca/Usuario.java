import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario del sistema de biblioteca.
 */
public class Usuario {

    private String nombre;
    private String id;
    private List<Libro> librosPrestados;

    /**
     * Constructor de la clase Usuario.
     * 
     * @param nombre Nombre del usuario
     * @param id Identificador único del usuario
     */
    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    /**
     * Agrega un libro a la colección de libros prestados.
     * 
     * @param libro Libro a agregar
     */
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    /**
     * Elimina un libro de la colección de libros prestados.
     * 
     * @param libro Libro a eliminar
     */
    public void removerLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    /**
     * Consulta los atributos de la clase de manera ordenada
     * @return los datos dentro de los atributos
     */
    public String imprimirDatos() {
        String datos = "Usuario: " + nombre + " (ID: " + id + ")";
        
        return datos;
    }
}