/*
 */
package controlador;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class PagoControlador {
    
    //Llama a los controladores para no tener que abrir más de una instancia
    RutaControlador controller = new RutaControlador();
    PagoDAO controllerPagos = new PagoDAO();
    ChoferDAO controllerChoferes = new ChoferDAO();
    VehiculoDAO controllerVehiculos = new VehiculoDAO();

    //Llama al usuario activo
    Usuario actual = SesionActiva.getInstancia().getUsuarioActual();
    int idUsuario = actual.getId(); // Para usarlo en filtros WHERE
    
    /**
     * Carga y muestra todos los pagos del usuario activo en la tabla tblPagos.
     *
     * Limpia el contenido actual de la tabla antes de cargar los nuevos datos.
     * También mide e imprime el tiempo de carga en consola para diagnóstico.
     *
     */
    public void mostrarPagos() {
        long inicio = System.currentTimeMillis();
        
        comboChofer.removeAllItems();
        comboChofer.addItem(null);

        List<Chofer> choferes = cargarChoferes();
        
        for (Chofer chofer : choferes) {
            comboChofer.addItem(chofer);
        }

        DefaultTableModel modelo = (DefaultTableModel) tblPagos.getModel();
        modelo.setRowCount(0);

        List<Pago> pagos = controllerPagos.listarPagos(idUsuario);

        for (Pago pago : pagos) {

            Chofer chofer = controllerChoferes.cargarChofer(pago.getId_chofer());

            Object[] fila = new Object[5];

            fila[0] = pago.getId();
            fila[1] = chofer.getNombre() + " " + chofer.getApellido();
            fila[2] = pago.getMonto();
            fila[3] = pago.getMetodoPago();
            fila[4] = pago.getEstadoPago();

            // 3. Agregar fila
            modelo.addRow(fila);
        }

        tblPagos.setModel(modelo);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio));
    }
    
}
