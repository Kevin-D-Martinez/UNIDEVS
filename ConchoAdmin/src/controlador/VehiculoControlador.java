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
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class VehiculoControlador {

    private VehiculoDAO vehiculoDAO = new VehiculoDAO();
    private ChoferDAO choferDAO = new ChoferDAO();

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
    
    public int contarVehiculos (int usuarioActivo) {
        
        return vehiculoDAO.contarVehiculos(usuarioActivo);
    }

}
