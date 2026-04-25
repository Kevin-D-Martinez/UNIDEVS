/*
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DTO.Ruta;
import modelo.DAO.RutaDAO;

/**
 * Controlador para la gestión de rutas de transporte.
 *
 * <p>
 * Actúa como intermediario entre la capa de vista y la capa de acceso a datos,
 * encapsulando la lógica de negocio relacionada con las rutas.</p>
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class RutaControlador {

    private RutaDAO rutaDAO = new RutaDAO();

    /**
     * Crea una nueva ruta y la persiste en la base de datos.
     *
     * <p>
     * Valida que el nombre no esté vacío antes de intentar guardar. La
     * conversión del monto de String a Double debe realizarse en la vista antes
     * de llamar a este método.</p>
     *
     * @param nombre Nombre de la ruta. No puede estar vacío.
     * @param tarifa Tarifa de la ruta en pesos dominicanos (DOP).
     * @param idUsuario ID del usuario propietario del registro.
     * @return {@code true} si la ruta fue creada exitosamente, {@code false} si
     * ocurrió un error.
     * @throws IllegalArgumentException Si el nombre está vacío.
     */
    public boolean guardarRuta(String nombre, Double tarifa, int idUsuario) {

        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre vacío");
        }

        Ruta ruta = new Ruta(nombre, tarifa, idUsuario);
        return rutaDAO.agregarRuta(ruta);

    }

    /**
     * Retorna todas las rutas del usuario indicado.
     *
     * @param idUsuario ID del usuario activo.
     * @return Lista de objetos {@link Ruta} del usuario. Retorna una lista
     * vacía si el usuario no tiene rutas.
     */
    public List<Ruta> leerRutas(int idUsuario) {

        return rutaDAO.leerRutas(idUsuario);
    }

    /**
     * Carga los datos de una ruta específica desde la base de datos.
     *
     * @param idUsuario ID de la ruta a cargar.
     * @return Objeto {@link Ruta} con los datos del registro, o {@code null} si
     * no existe una ruta con ese ID.
     */
    public Ruta cargarRuta(int idUsuario) {

        return rutaDAO.cargarRuta(idUsuario);
    }

    /**
     * Actualiza los datos de una ruta existente en la base de datos.
     *
     * @param id ID de la ruta a actualizar.
     * @param nombre Nuevo nombre de la ruta.
     * @param tarifa Nueva tarifa de la ruta en pesos dominicanos (DOP).
     * @param idUsuario ID del usuario propietario del registro.
     * @return {@code true} si la actualización fue exitosa, {@code false} si
     * ocurrió un error.
     */
    public boolean actualizarRuta(int id, String nombre, double tarifa, int idUsuario) {

        Ruta ruta = new Ruta(id, nombre, tarifa, idUsuario);

        return rutaDAO.actualizarRuta(ruta);
    }

    /**
     * Elimina una ruta de la base de datos.
     *
     * @param ruta Objeto {@link Ruta} a eliminar. Debe contener un ID válido.
     * @return {@code true} si fue eliminada exitosamente, {@code false} si
     * ocurrió un error.
     */
    public boolean eliminarRuta(Ruta ruta) {

        return rutaDAO.eliminarRuta(ruta);
    }

    /**
     * Prepara los datos de rutas para mostrar en una tabla de la vista.
     *
     * <p>
     * Si el filtro está vacío, retorna todas las rutas del usuario. Si se
     * proporciona un filtro, retorna solo las rutas cuyo nombre coincida con el
     * valor buscado.</p>
     *
     * @param idUsuario ID del usuario activo, usado para filtrar los registros.
     * @param valorFiltro Texto de búsqueda por nombre. Si está vacío, retorna
     * todas.
     * @return Lista de arreglos de objetos con los campos: ID, nombre y tarifa
     * de la ruta.
     */
    public List<Object[]> poblarTablaRutas(int idUsuario, String valorFiltro) {

        List<Ruta> rutas;

        if (valorFiltro.equals("")) {
            rutas = rutaDAO.leerRutas(idUsuario);
        } else {
            rutas = rutaDAO.filtrarRutas(idUsuario, valorFiltro);
        }

        List<Object[]> rutasVista = new ArrayList<>();

        for (Ruta ruta : rutas) {
            rutasVista.add(new Object[]{
                ruta.getId(),
                ruta.getNombre(),
                ruta.getTarifa()
            });
        }

        return rutasVista;
    }

    /**
     * Cuenta el número total de rutas del usuario indicado.
     *
     * <p>
     * Usado para actualizar el contador de rutas en el panel de inicio.</p>
     *
     * @param idUsuario ID del usuario activo.
     * @return Cantidad de rutas registradas por el usuario.
     */
    public int contarRutas(int idUsuario) {

        return rutaDAO.contarRutas(idUsuario);
    }
}
