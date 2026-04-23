/*
 */
package controlador;

import modelo.Ruta;
import java.util.List;
import modelo.Ruta;
import modelo.RutaDAO;

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
}
