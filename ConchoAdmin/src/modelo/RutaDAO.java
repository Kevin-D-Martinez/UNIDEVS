package modelo;

import modelo.Ruta;
import modelo.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase de acceso a datos (DAO) para la entidad Ruta. Proporciona operaciones
 * CRUD y consultas sobre la tabla Ruta en la base de datos.
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class RutaDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Agrega una nueva ruta a la base de datos.
     *
     * @param ruta Objeto Ruta con los datos a insertar.
     * @return true si la inserción fue exitosa, false en caso contrario.
     */
    public boolean agregarRuta(Ruta ruta) {

        String sql = "INSERT INTO Rutas (nombre,tarifa,id_usuario) VALUES (?,?,?)";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getNombre());
            ps.setDouble(2, ruta.getTarifa());
            ps.setInt(3, ruta.getIdUsuario());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error al agregar ruta: " + e);
        } finally {
            cerrarRecursos();
        }

        return false;
    }

    /**
     * Obtiene todas las rutas asociadas a un usuario específico.
     *
     * @param idUsuario ID del usuario cuyas rutas se desean listar.
     * @return Lista de objetos Ruta del usuario. Retorna una lista vacía si no
     * hay resultados.
     */
    public List leerRutas(int idUsuario) {

        String sql = "SELECT * FROM Rutas WHERE id_usuario = ?";
        List<Ruta> datos = new ArrayList<>();
        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                double tarifa = rs.getDouble(3);
                int id_usuario = rs.getInt(4);

                Ruta ruta = new Ruta(id, nombre, tarifa, id_usuario);
                datos.add(ruta);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las rutas: " + e);
        } finally {
            cerrarRecursos();
        }
        return datos;
    }

    /**
     * Filtra las rutas de un usuario según un texto de búsqueda aplicado al
     * nombre.
     *
     * @param idUsuario ID del usuario al que pertenecen las rutas.
     * @param valorFiltro Texto a buscar dentro del nombre de la ruta (búsqueda
     * parcial).
     * @return Lista de objetos Ruta que coinciden con el filtro. Retorna una
     * lista vacía si no hay resultados.
     */
    public List filtrarRutas(int idUsuario, String valorFiltro) {

        String sql = "SELECT * FROM Rutas WHERE id_usuario = ? AND nombre LIKE ?";
        List<Ruta> datos = new ArrayList<>();
        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            ps.setString(2, "%" + valorFiltro + "%");
            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                double tarifa = rs.getDouble(3);
                int id_usuario = rs.getInt(4);

                Ruta ruta = new Ruta(id, nombre, tarifa, id_usuario);
                datos.add(ruta);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar las rutas: " + e);
        } finally {
            cerrarRecursos();
        }
        return datos;
    }

    /**
     * Carga una ruta específica desde la base de datos según su ID.
     *
     * @param id ID de la ruta a buscar.
     * @return Objeto Ruta con los datos encontrados, o null si no existe.
     */
    public Ruta cargarRuta(int id) {

        String sql = "SELECT * FROM Rutas WHERE id = ?";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                double tarifa = rs.getDouble("tarifa");
                int id_usuario = rs.getInt("id_usuario");

                return new Ruta(id, nombre, tarifa, id_usuario);
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar la ruta: " + e);
        } finally {
            cerrarRecursos();
        }

        return null; // si no encuentra nada
    }

    /**
     * Actualiza los datos de una ruta existente en la base de datos.
     *
     * @param ruta Objeto Ruta con los datos actualizados. Debe contener un ID
     * válido.
     * @return true si la actualización fue exitosa, false en caso contrario.
     */
    public boolean actualizarRuta(Ruta ruta) {

        String sql = "UPDATE Rutas set nombre = ?,tarifa = ?, id_usuario = ? where id = ?";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getNombre());
            ps.setDouble(2, ruta.getTarifa());
            ps.setInt(3, ruta.getIdUsuario());
            ps.setInt(4, ruta.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error al actualizar ruta: " + e);
        } finally {
            cerrarRecursos();
        }

        return false;
    }

    /**
     * Elimina una ruta de la base de datos según su ID.
     *
     * @param ruta Objeto Ruta que contiene el ID de la ruta a eliminar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
    public boolean eliminarRuta(Ruta ruta) {

        String sql = "DELETE FROM Rutas where id = ?";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ruta.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error al eliminar ruta: " + e);
        } finally {
            cerrarRecursos();
        }

        return false;
    }

    /**
     * Cuenta el total de rutas registradas para un usuario específico.
     *
     * @param idUsuario ID del usuario cuyas rutas se desean contar.
     * @return Número total de rutas del usuario, o 0 si no tiene rutas o hay un
     * error.
     */
    public int contarRutas(int idUsuario) {

        String sql = "SELECT COUNT(*) FROM Rutas WHERE id_usuario = ?";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Error al contar rutas: " + e);
        } finally {
            cerrarRecursos();
        }

        return 0;
    }
    
     // Metodo para cerrar recursos
    private void cerrarRecursos() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar: " + e.getMessage());
        }
    }

}
