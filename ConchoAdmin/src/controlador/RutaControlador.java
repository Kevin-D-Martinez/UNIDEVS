/*
 */
package controlador;

import java.util.ArrayList;
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

    public int contarRutas(int idUsuario) {

        return rutaDAO.contarRutas(idUsuario);
    }
}
