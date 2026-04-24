/*
 */
package controlador;

import java.util.List;
import modelo.DAO.ChoferDAO;
import modelo.DTO.Chofer;
import modelo.DTO.Usuario;
import modelo.SesionActiva;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class ChoferControlador {
    
    //Llama al usuario activo
    Usuario actual = SesionActiva.getInstancia().getUsuarioActual();
    int idUsuario = actual.getId(); // Para usarlo en filtros WHERE

    //Llama a los controladores para no tener que abrir más de una instancia
    ChoferDAO controllerChoferes = new ChoferDAO();

    public List<Chofer> cargarChoferes() {
        ChoferDAO choferDAO = new ChoferDAO();
        List<Chofer> choferes = choferDAO.listar(idUsuario); // filtra por usuario actual
        
        return choferes;
    }
    
    /**
     * Carga y muestra todos los choferes del usuario activo en la tabla
     * tblChoferes.
     *
     * Limpia el contenido actual de la tabla antes de cargar los nuevos datos.
     * También mide e imprime el tiempo de carga en consola para diagnóstico.
     *
     */
    public void mostrarChoferes() {
        long inicio = System.currentTimeMillis();

        DefaultTableModel modelo = (DefaultTableModel) tblChoferes.getModel();
        modelo.setRowCount(0);

        List<Chofer> choferes = controllerChoferes.listar(idUsuario);

        for (Chofer chofer : choferes) {
            Object[] fila = new Object[5];

            fila[0] = chofer.getId();
            fila[1] = chofer.getNombre() + " " + chofer.getApellido();
            fila[2] = chofer.getCedula();
            fila[3] = chofer.getTelefono();
            fila[4] = chofer.getEstado();

            // 3. Agregar fila
            modelo.addRow(fila);
        }

        tblChoferes.setModel(modelo);

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin - inicio));
    }

}
