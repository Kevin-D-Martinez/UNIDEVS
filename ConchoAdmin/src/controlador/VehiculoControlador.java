/*
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DAO.ChoferDAO;
import modelo.DAO.VehiculoDAO;
import modelo.DTO.Chofer;
import modelo.DTO.Vehiculo;

/**
 * Controlador para la gestión de vehículos.
 *
 * <p>
 * Actúa como intermediario entre la capa de vista y la capa de acceso a datos,
 * encapsulando la lógica de negocio relacionada con los vehículos registrados
 * en el sistema.</p>
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class VehiculoControlador {

    private VehiculoDAO vehiculoDAO = new VehiculoDAO();
    private ChoferDAO choferDAO = new ChoferDAO();

    /**
     * Prepara los datos de vehículos para mostrar en una tabla de la vista.
     *
     * <p>
     * Si el filtro está vacío, retorna todos los vehículos del usuario. Si se
     * proporciona un filtro, retorna solo los vehículos que coincidan con el
     * valor buscado (por marca, modelo, año o matrícula).</p>
     *
     * <p>
     * Para cada vehículo, resuelve el nombre completo del chofer asignado
     * realizando una consulta adicional al DAO.</p>
     *
     * @param idUsuario ID del usuario activo, usado para filtrar los registros.
     * @param valorFiltro Texto de búsqueda. Si está vacío, retorna todos.
     * @return Lista de arreglos de objetos con los campos: ID, nombre completo
     * del chofer, marca, modelo y año del vehículo.
     */
    public List<Object[]> poblarTablaVehiculo(int idUsuario, String valorFiltro) {

        List<Vehiculo> vehiculos;

        if (valorFiltro.equals("")) {
            vehiculos = vehiculoDAO.listar(idUsuario);
        } else {
            vehiculos = vehiculoDAO.filtrarVehiculo(valorFiltro, idUsuario);
        }

        List<Object[]> vehiculoVista = new ArrayList<>();

        for (Vehiculo vehiculo : vehiculos) {
            Chofer chofer = choferDAO.cargarChofer(vehiculo.getIdChofer());

            vehiculoVista.add(new Object[]{
                vehiculo.getId(),
                chofer.getNombre() + " " + chofer.getApellido(),
                vehiculo.getMarca(),
                vehiculo.getModelo(),
                vehiculo.getAño()
            });
        }

        return vehiculoVista;
    }

    /**
     * Cuenta el número total de vehículos registrados por el usuario indicado.
     *
     * <p>
     * Usado para actualizar el contador de vehículos en el panel de inicio.</p>
     *
     * @param usuarioActivo ID del usuario activo.
     * @return Cantidad de vehículos registrados por el usuario.
     */
    public int contarVehiculos(int usuarioActivo) {

        return vehiculoDAO.contarVehiculos(usuarioActivo);
    }

    /**
     * Crea un nuevo vehículo y lo persiste en la base de datos.
     *
     * @param marca Marca del vehículo (ej: "Toyota", "Honda").
     * @param modelo Modelo del vehículo (ej: "Corolla", "Civic").
     * @param ano Año de fabricación del vehículo (ej: "2020").
     * @param matricula Matrícula o placa del vehículo.
     * @param idChofer ID del chofer asignado al vehículo.
     * @param idRuta ID de la ruta asignada al vehículo.
     * @param idUsuario ID del usuario propietario del registro.
     * @return {@code true} si el vehículo fue creado exitosamente,
     * {@code false} si ocurrió un error.
     */
    public boolean agregar(String marca, String modelo, String ano, String matricula, int idChofer, int idRuta, int idUsuario) {

        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAño(ano);
        vehiculo.setMatricula(matricula);
        vehiculo.setIdChofer(idChofer);
        vehiculo.setIdRuta(idRuta);
        vehiculo.setIdUsuario(idUsuario);

        return vehiculoDAO.agregar(vehiculo) == 1;
    }

    /**
     * Carga los datos de un vehículo específico desde la base de datos.
     *
     * @param id ID del vehículo a cargar.
     * @return Objeto {@link Vehiculo} con los datos del registro, o
     * {@code null} si no existe un vehículo con ese ID.
     */
    public Vehiculo cargarVehiculo(int id) {
        return vehiculoDAO.cargarVehiculo(id);
    }

    /**
     * Actualiza los datos de un vehículo existente en la base de datos.
     *
     * <p>
     * Nota: El parámetro {@code id} se recibe pero actualmente no se asigna al
     * objeto {@link Vehiculo} antes de enviarlo al DAO. Verificar que el DAO
     * pueda identificar el registro a actualizar correctamente.</p>
     *
     * @param id ID del vehículo a actualizar.
     * @param marca Nueva marca del vehículo.
     * @param modelo Nuevo modelo del vehículo.
     * @param ano Nuevo año del vehículo.
     * @param matricula Nueva matrícula del vehículo.
     * @param idChofer ID del nuevo chofer asignado.
     * @param idRuta ID de la nueva ruta asignada.
     * @param idUsuario ID del usuario propietario del registro.
     * @return {@code true} si la actualización fue exitosa, {@code false} si
     * ocurrió un error.
     */
    public boolean actualizar(int id, String marca, String modelo, String ano, String matricula, int idChofer, int idRuta, int idUsuario) {

        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca(marca);
        vehiculo.setModelo(modelo);
        vehiculo.setAño(ano);
        vehiculo.setMatricula(matricula);
        vehiculo.setIdChofer(idChofer);
        vehiculo.setIdRuta(idRuta);
        vehiculo.setIdUsuario(idUsuario);

        return vehiculoDAO.actualizar(vehiculo) == 1;
    }

    /**
     * Elimina un vehículo de la base de datos por su ID.
     *
     * @param id ID del vehículo a eliminar.
     * @return 1 si fue eliminado exitosamente, 0 si ocurrió un error.
     */
    public int eliminar(int id) {
        return vehiculoDAO.eliminar(id);
    }

}
