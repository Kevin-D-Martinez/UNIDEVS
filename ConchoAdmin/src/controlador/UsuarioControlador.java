/*
 */
package controlador;

import modelo.DTO.Usuario;
import modelo.SesionActiva;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class UsuarioControlador {

    private Usuario usuarioActual = SesionActiva.getInstancia().getUsuarioActual();

    public int getIdUsuarioActual() {
        return usuarioActual.getId();
    }
    
    public String getNombreUsuarioActual() {
        return usuarioActual.getNombre();
    }

}
