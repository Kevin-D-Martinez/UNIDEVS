/*
 */
package controlador;

import java.util.regex.Pattern;
import modelo.DAO.UsuarioDAO;
import modelo.DTO.Usuario;
import modelo.SesionActiva;

/**
 * Controlador para la gestión de usuarios y autenticación.
 *
 * <p>
 * Maneja la sesión activa del usuario, la validación de credenciales, el
 * registro de nuevas cuentas y el acceso a los datos del usuario actualmente
 * autenticado.</p>
 *
 * <p>
 * Depende de {@link SesionActiva} para obtener el usuario autenticado. Debe
 * instanciarse después de que el login haya sido completado exitosamente.</p>
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class UsuarioControlador {

    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private Usuario usuarioActual = SesionActiva.getInstancia().getUsuarioActual();

    /**
     * Retorna el ID del usuario actualmente autenticado en el sistema.
     *
     * <p>
     * Usado por las demás vistas y controladores para filtrar registros que
     * pertenezcan únicamente al usuario activo.</p>
     *
     * @return ID del usuario activo.
     */
    public int getIdUsuarioActual() {
        return usuarioActual.getId();
    }

    /**
     * Retorna el nombre del usuario actualmente autenticado en el sistema.
     *
     * <p>
     * Usado principalmente para mostrar el saludo en la pantalla de inicio.</p>
     *
     * @return Nombre del usuario activo.
     */
    public String getNombreUsuarioActual() {
        return usuarioActual.getNombre();
    }

    /**
     * Valida si una cadena de texto tiene formato de correo electrónico válido.
     *
     * <p>
     * Utiliza una expresión regular que verifica que el correo tenga el formato
     * estándar {@code usuario@dominio.extension}.</p>
     *
     * <p>
     * Ejemplos válidos: {@code usuario@gmail.com},
     * {@code nombre.apellido@empresa.org}</p>
     * <p>
     * Ejemplos inválidos: {@code usuario},
     * {@code usuario@}, {@code @dominio.com}</p>
     *
     * @param correo Cadena de texto a validar.
     * @return {@code true} si el correo tiene formato válido, {@code false} en
     * caso contrario.
     */
    public boolean correoEsValido(String correo) {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Aa-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        return patron.matcher(correo).find();

    }

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * <p>
     * Valida el formato del correo antes de intentar crear la cuenta. Si el
     * correo no es válido, retorna {@code false} sin realizar ninguna operación
     * en la base de datos.</p>
     *
     * @param nombre Nombre del nuevo usuario.
     * @param apellido Apellido del nuevo usuario.
     * @param correo Correo electrónico del nuevo usuario. Debe tener formato
     * válido.
     * @param contrasena Contraseña del nuevo usuario.
     * @return {@code true} si el usuario fue registrado exitosamente,
     * {@code false} si el correo es inválido o ocurrió un error al guardar.
     */
    public boolean registrar(String nombre, String apellido, String correo, String contrasena) {
        if (!correoEsValido(correo)) {
            return false;
        }
        Usuario usuario = new Usuario(nombre, apellido, correo, contrasena);
        return usuarioDAO.agregar(usuario) == 1;
    }

    /**
     * Autentica un usuario con su correo y contraseña.
     *
     * <p>
     * Si las credenciales son correctas, el DAO se encarga de guardar el
     * usuario en {@link SesionActiva} para que esté disponible en el resto de
     * la aplicación.</p>
     *
     * @param correo Correo electrónico del usuario.
     * @param contrasena Contraseña del usuario.
     * @return {@code true} si las credenciales son correctas y el login fue
     * exitoso, {@code false} si las credenciales son incorrectas.
     */
    public boolean login(String correo, String contrasena) {
        return usuarioDAO.login(correo, contrasena) == 1;
    }

}
