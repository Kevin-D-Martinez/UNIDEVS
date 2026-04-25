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
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class PagoControlador {

    private PagoDAO pagoDAO = new PagoDAO();
    private ChoferDAO choferDAO = new ChoferDAO();

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
    
    public int contarPagosPendientes(int usuarioActivo) {
        
        return pagoDAO.contarPagosPendientes(usuarioActivo);
    }

}
