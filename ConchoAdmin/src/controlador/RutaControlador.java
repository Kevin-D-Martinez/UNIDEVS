/*
 */
package controlador;

import modelo.DTO.Ruta;
import java.util.List;
import modelo.DTO.Ruta;
import modelo.DAO.RutaDAO;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class RutaControlador {

    private RutaDAO rutaDAO = new RutaDAO();

    public boolean guardarRuta(String nombre, String tarifaTexto, int idUsuario) {

        double tarifa = Double.parseDouble(tarifaTexto);

        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("Nombre vacío");
        }

        Ruta ruta = new Ruta(nombre, tarifa, idUsuario);
        return rutaDAO.agregarRuta(ruta);

    }
    
    public List<Ruta> leerRutas(int idUsuario) {
        
        return rutaDAO.leerRutas(idUsuario);
    }
    
    public Ruta cargarRuta(int idUsuario) {
        
        return rutaDAO.cargarRuta(idUsuario);
    }
    
    public boolean actualizarRuta(Ruta ruta) {
        
        return rutaDAO.actualizarRuta(ruta);
    }
    
    public boolean eliminarRuta(Ruta ruta) {
        
        return rutaDAO.eliminarRuta(ruta);
    }
    
    public List<Ruta> filtrarRutas(int idUsuario, String valorFiltro) {
        
        return rutaDAO.filtrarRutas(idUsuario,valorFiltro);
    }
    
    public int contarRutas(int idUsuario) {
        
        return rutaDAO.contarRutas(idUsuario);
    }
    
    /**
     * Carga y muestra todas las rutas del usuario activo en la tabla tblRutas.
     *
     * Limpia el contenido actual de la tabla antes de cargar los nuevos datos.
     * También mide e imprime el tiempo de carga en consola para diagnóstico.
     *
     */
    public void mostrarRutas() {
        long inicio = System.currentTimeMillis();

        DefaultTableModel modelo = (DefaultTableModel) tblRutas.getModel();
        modelo.setRowCount(0);

        List<Ruta> rutas = controller.leerRutas(idUsuario);

        for (Ruta ruta : rutas) {
            Object[] fila = new Object[3];

            fila[0] = ruta.getId();
            fila[1] = ruta.getNombre();
            fila[2] = ruta.getTarifa();

            // 3. Agregar fila
            modelo.addRow(fila);
        }

        tblRutas.setModel(modelo);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio));
    }
}
