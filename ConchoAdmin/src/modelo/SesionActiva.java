package modelo;

import modelo.DTO.Usuario;

/**
 * Se encarga manejar la sesion del usuario
 * @author Kevin Daniel Martinez Reyes
 */
public class SesionActiva {
    
    private static SesionActiva instancia;
    private Usuario usuarioActual;
    
    private SesionActiva() {}

    public static SesionActiva getInstancia() {
        if (instancia == null) {
            instancia = new SesionActiva();
        }
        return instancia;
    }
    
    public Usuario getUsuarioActual() {
        return usuarioActual;
    }
    
    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    public void cerrarSesion() {
        usuarioActual = null;
    }
}
