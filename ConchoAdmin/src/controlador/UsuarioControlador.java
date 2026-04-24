/*
 */
package controlador;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class UsuarioControlador {
    
    //Llama a los controladores para no tener que abrir más de una instancia
    RutaControlador controller = new RutaControlador();
    PagoDAO controllerPagos = new PagoDAO();
    ChoferDAO controllerChoferes = new ChoferDAO();
    VehiculoDAO controllerVehiculos = new VehiculoDAO();

    //Llama al usuario activo
    Usuario actual = SesionActiva.getInstancia().getUsuarioActual();
    int idUsuario = actual.getId(); // Para usarlo en filtros WHERE
    
}
