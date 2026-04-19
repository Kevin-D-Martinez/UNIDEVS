package gestionRutas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO de rutas
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class RutaDAO {

    public boolean agregarRuta(Ruta ruta) {

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "INSERT INTO Ruta (nombre,tarifa,id_usuario) VALUES (?,?,?)";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, ruta.getNombre());
            ps.setDouble(2, ruta.getTarifa());
            ps.setInt(3, ruta.getIdUsuario());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error al agregar ruta: " + e);
        }

        return false;
    }

    public List leerRutas(int idUsuario) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Ruta WHERE id_usuario = ?";
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
        }
        return datos;
    }

    public List filtrarRutas(int idUsuario, String valorFiltro) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM Ruta WHERE id_usuario = ? AND nombre LIKE ?";
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
        }
        return datos;
    }

    public Ruta cargarRuta(int id) {

        String sql = "SELECT * FROM Ruta WHERE id = ?";

        try (Connection con = ConexionMySQL.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String nombre = rs.getString("nombre");
                    double tarifa = rs.getDouble("tarifa");
                    int id_usuario = rs.getInt("id_usuario");

                    return new Ruta(id, nombre, tarifa, id_usuario);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar la ruta: " + e);
        }

        return null; // si no encuentra nada
    }

    public boolean actualizarRuta(Ruta ruta) {

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "UPDATE Ruta set nombre = ?,tarifa = ?, id_usuario = ? where id = ?";

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
        }

        return false;
    }

    public boolean eliminarRuta(Ruta ruta) {

        Connection con = null;
        PreparedStatement ps = null;

        String sql = "DELETE FROM Ruta where id = ?";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ruta.getId());

            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error al eliminar ruta: " + e);
        }

        return false;
    }

    public int contarRutas(int idUsuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(*) FROM Ruta WHERE id_usuario = ?;";

        try {

            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUsuario);
            rs = ps.executeQuery();

            if (rs.next()) {          // ← esto faltaba
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Error al contar rutas: " + e);
        }

        return 0;
    }

}
