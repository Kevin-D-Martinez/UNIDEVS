/*
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DAO.ChoferDAO;
import modelo.DTO.Chofer;

/**
 * Controlador para la gestión de choferes.
 *
 * Actúa como intermediario entre la capa de vista y la capa de acceso a datos,
 * encapsulando la lógica de negocio relacionada con los choferes.
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class ChoferControlador {

    private ChoferDAO choferDAO = new ChoferDAO();

    /**
     * Prepara los datos de choferes para mostrar en una tabla de la vista.
     *
     * Si el filtro está vacío, retorna todos los choferes del usuario. Si se
     * proporciona un filtro, retorna solo los choferes que coincidan con el
     * valor buscado.
     *
     * @param idUsuario ID del usuario activo, usado para filtrar los registros.
     * @param valorFiltro Texto de búsqueda. Si está vacío, retorna todos.
     * @return Lista de arreglos de objetos con los campos: ID, nombre completo,
     * cédula, teléfono y estado del chofer.
     */
    public List<Object[]> poblarTablaChofer(int idUsuario, String valorFiltro) {

        List<Chofer> choferes;

        if (valorFiltro.equals("")) {
            choferes = choferDAO.listar(idUsuario);
        } else {
            choferes = choferDAO.listarChofer(idUsuario, valorFiltro);
        }

        List<Object[]> choferVista = new ArrayList<>();

        for (Chofer chofer : choferes) {

            choferVista.add(new Object[]{
                chofer.getId(),
                chofer.getNombre() + " " + chofer.getApellido(),
                chofer.getCedula(), chofer.getTelefono(),
                chofer.getEstado()
            });
        }

        return choferVista;
    }

    /**
     * Cuenta el número de choferes con estado "Activo" del usuario indicado.
     *
     * @param usuarioActivo ID del usuario activo.
     * @return Cantidad de choferes activos.
     */
    public int contarChoferesActivos(int usuarioActivo) {
        return choferDAO.contarChoferesActivos(usuarioActivo);
    }

    /**
     * Retorna la lista completa de choferes del usuario indicado.
     *
     * Usado principalmente para poblar dropdowns y combos en la vista.
     *
     * @param idUsuario ID del usuario activo.
     * @return Lista de objetos {@link Chofer} del usuario.
     */
    public List<Chofer> listarChoferes(int idUsuario) {

        return choferDAO.listar(idUsuario);
    }

    /**
     * Crea un nuevo chofer y lo persiste en la base de datos.
     *
     * @param nombre Nombre del chofer.
     * @param apellido Apellido del chofer.
     * @param estado Estado del chofer ("Activo" o "Inactivo").
     * @param idRuta ID de la ruta asignada al chofer.
     * @param idUsuario ID del usuario propietario del registro.
     * @param telefono Número de teléfono del chofer.
     * @param cedula Cédula de identidad del chofer.
     * @return 1 si el chofer fue creado exitosamente, 0 si ocurrió un error.
     */
    public int agregar(String nombre, String apellido, String estado, int idRuta, int idUsuario, String telefono, String cedula) {
        Chofer chofer = new Chofer(0, nombre, apellido, estado, idRuta, idUsuario, telefono, cedula);
        return choferDAO.agregar(chofer);
    }

    /**
     * Carga los datos de un chofer específico desde la base de datos.
     *
     * @param id ID del chofer a cargar.
     * @return Objeto {@link Chofer} con los datos del registro, o null si no
     * existe.
     */
    public Chofer cargarChofer(int id) {
        return choferDAO.cargarChofer(id);
    }

    /**
     * Actualiza los datos de un chofer existente en la base de datos.
     *
     * NOTA: Este método actualmente llama a {@code choferDAO.agregar()} en
     * lugar de {@code choferDAO.actualizar()}. Verificar que el DAO tenga el
     * método correcto y corregir si es necesario.
     *
     * @param idChofer ID del chofer a actualizar.
     * @param nombre Nuevo nombre del chofer.
     * @param apellido Nuevo apellido del chofer.
     * @param cedula Nueva cédula del chofer.
     * @param telefono Nuevo teléfono del chofer.
     * @param estado Nuevo estado del chofer.
     * @param idRuta ID de la nueva ruta asignada.
     * @return 1 si la actualización fue exitosa, 0 si ocurrió un error.
     */
    public int actualizar(int idChofer, String nombre, String apellido, String cedula, String telefono, String estado, int idRuta) {

        Chofer chofer = new Chofer();

        chofer.setNombre(nombre);
        chofer.setApellido(apellido);
        chofer.setCedula(cedula);
        chofer.setTelefono(telefono);
        chofer.setEstado(estado);
        chofer.setId(idChofer);
        chofer.setIdRuta(idRuta);

        return choferDAO.actualizar(chofer);
    }

    /**
     * Elimina un chofer de la base de datos por su ID.
     *
     * @param id ID del chofer a eliminar.
     * @return 1 si fue eliminado exitosamente, 0 si ocurrió un error.
     */
    public int eliminar(int id) {
        return choferDAO.eliminar(id);
    }

}
