/*
 */
package controlador;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class VehiculoControlador {
    
    //Llama a los controladores para no tener que abrir más de una instancia
    RutaControlador controller = new RutaControlador();
    PagoDAO controllerPagos = new PagoDAO();
    ChoferDAO controllerChoferes = new ChoferDAO();
    VehiculoDAO controllerVehiculos = new VehiculoDAO();

    //Llama al usuario activo
    Usuario actual = SesionActiva.getInstancia().getUsuarioActual();
    int idUsuario = actual.getId(); // Para usarlo en filtros WHERE
    
        /**
     * Carga y muestra todas las rutas del usuario activo en la tabla
     * tblVehiculos.
     *
     * Limpia el contenido actual de la tabla antes de cargar los nuevos datos.
     * También mide e imprime el tiempo de carga en consola para diagnóstico.
     *
     */
    public void mostrarVehiculos() {
        long inicio = System.currentTimeMillis();

        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
        modelo.setRowCount(0);

        List<Vehiculo> vehiculos = controllerVehiculos.listar(idUsuario);

        for (Vehiculo vehiculo : vehiculos) {
            Chofer chofer = controllerChoferes.cargarChofer(vehiculo.getIdChofer());

            Object[] fila = new Object[5];

            fila[0] = vehiculo.getId();
            fila[1] = chofer.getNombre() + " " + chofer.getApellido();
            fila[2] = vehiculo.getMarca();
            fila[3] = vehiculo.getModelo();
            fila[4] = vehiculo.getAño();

            // 3. Agregar fila
            modelo.addRow(fila);
        }

        tblVehiculos.setModel(modelo);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio));
    }
    
}
