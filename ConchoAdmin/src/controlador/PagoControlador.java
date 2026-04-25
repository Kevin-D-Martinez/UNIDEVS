/*
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DAO.ChoferDAO;
import modelo.DAO.PagoDAO;
import modelo.DTO.Chofer;
import modelo.DTO.Pago;

/**
 * Controlador para la gestión de pagos.
 *
 * <p>
 * Actúa como intermediario entre la capa de vista y la capa de acceso a datos,
 * encapsulando la lógica de negocio relacionada con los pagos de choferes.</p>
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class PagoControlador {

    private PagoDAO pagoDAO = new PagoDAO();
    private ChoferDAO choferDAO = new ChoferDAO();

    /**
     * Prepara los datos de pagos para mostrar en una tabla de la vista.
     *
     * <p>
     * Si {@code filtroChofer} es {@code null}, retorna todos los pagos del
     * usuario activo. Si se proporciona un chofer, retorna solo los pagos
     * asociados a ese chofer.</p>
     *
     * <p>
     * Para cada pago, resuelve el nombre completo del chofer realizando una
     * consulta adicional al DAO.</p>
     *
     * @param idUsuario ID del usuario activo, usado para filtrar los registros.
     * @param filtroChofer Chofer por el cual filtrar. Si es {@code null},
     * retorna todos.
     * @return Lista de arreglos de objetos con los campos: ID, nombre completo
     * del chofer, monto, método de pago y estado del pago.
     */
    public List<Object[]> poblarTablaPagos(int idUsuario, Chofer filtroChofer) {

        List<Pago> pagos;

        if (filtroChofer == null) {
            pagos = pagoDAO.listarPagos(idUsuario);
        } else {
            pagos = pagoDAO.listarPorChofer(filtroChofer.getId());
        }

        List<Object[]> pagosVista = new ArrayList<>();

        for (Pago pago : pagos) {
            Chofer chofer = choferDAO.cargarChofer(pago.getId_chofer());

            pagosVista.add(new Object[]{
                pago.getId(),
                chofer.getNombre() + " " + chofer.getApellido(),
                pago.getMonto(),
                pago.getMetodoPago(),
                pago.getEstadoPago()
            });

        }

        return pagosVista;
    }

    /**
     * Cuenta el número de pagos con estado "Pendiente" del usuario indicado.
     *
     * @param usuarioActivo ID del usuario activo.
     * @return Cantidad de pagos pendientes.
     */
    public int contarPagosPendientes(int usuarioActivo) {

        return pagoDAO.contarPagosPendientes(usuarioActivo);
    }

    /**
     * Crea un nuevo pago y lo persiste en la base de datos.
     *
     * @param monto     Monto del pago.
     * @param estado    Estado del pago ("Pendiente" o "Pagado").
     * @param metodo    Método de pago ("Efectivo", "Transfer" o "Tarjeta").
     * @param idChofer  ID del chofer asociado al pago.
     * @param idRuta    ID de la ruta asociada al pago.
     * @param idUsuario ID del usuario propietario del registro.
     * @return {@code true} si el pago fue creado exitosamente, {@code false} si ocurrió un error.
     */
    public boolean agregar(Double monto, String estado, String metodo, int idChofer, int idRuta, int idUsuario) {

        Pago pago = new Pago();

        pago.setMonto(monto);
        pago.setEstadoPago(estado);
        pago.setMetodoPago(metodo);
        pago.setId_chofer(idChofer);
        pago.setId_ruta(idRuta);
        pago.setId_usuario(idUsuario);

        return pagoDAO.crearPago(pago);
    }

    /**
     * Carga los datos de un pago específico desde la base de datos.
     *
     * @param id ID del pago a cargar.
     * @return Objeto {@link Pago} con los datos del registro, o {@code null} si no existe.
     */
    public Pago leerPago(int id) {
        return pagoDAO.leerPago(id);
    }

    /**
     * Actualiza los datos de un pago existente en la base de datos.
     *
     * @param id       ID del pago a actualizar.
     * @param monto    Nuevo monto del pago.
     * @param estado   Nuevo estado del pago ("Pendiente" o "Pagado").
     * @param metodo   Nuevo método de pago ("Efectivo", "Transfer" o "Tarjeta").
     * @param idChofer ID del nuevo chofer asociado.
     * @param idRuta   ID de la nueva ruta asociada.
     * @return {@code true} si la actualización fue exitosa, {@code false} si ocurrió un error.
     */
    public boolean actualizarPago(int id, double monto, String estado, String metodo, int idChofer, int idRuta) {
        Pago pago = new Pago();

        pago.setId(id);
        pago.setMonto(monto);
        pago.setEstadoPago(estado);
        pago.setMetodoPago(metodo);
        pago.setId_chofer(idChofer);
        pago.setId_ruta(idRuta);

        return pagoDAO.actualizarPago(pago);
    }

    /**
     * Elimina un pago de la base de datos.
     *
     * @param pago Objeto {@link Pago} a eliminar. Debe contener un ID válido.
     * @return {@code true} si fue eliminado exitosamente, {@code false} si ocurrió un error.
     */
    public boolean eliminarPago(Pago pago) {
        return pagoDAO.eliminarPago(pago);
    }

}
