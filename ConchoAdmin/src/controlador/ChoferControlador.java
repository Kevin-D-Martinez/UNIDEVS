/*
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.DAO.ChoferDAO;
import modelo.DTO.Chofer;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class ChoferControlador {

    private ChoferDAO choferDAO = new ChoferDAO();

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

    public int contarChoferesActivos(int usuarioActivo) {
        return choferDAO.contarChoferesActivos(usuarioActivo);
    }

    public List<Chofer> listarChoferes(int idUsuario) {

        return choferDAO.listar(idUsuario);
    }

}
