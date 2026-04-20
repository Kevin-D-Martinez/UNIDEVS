package gestionVehiculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO Vehiculos. Clase encargada de gestionar las operaciones CRUD sobre la
 * tabla Vehiculo en la base de datos.
 *
 * @author Darvin Mendez
 */
public class VehiculoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Lista todos los vehículos registrados en la base de datos.
     *
     * @param idUsuario
     * @return
     */
    public List<Vehiculo> listar(int idUsuario) {

        String sql = "SELECT * FROM Vehiculo WHERE id_usuario = ?";
        List<Vehiculo> datos = new ArrayList<>();

        try {

            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, idUsuario);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    Vehiculo v = new Vehiculo();
                    v.setId(rs.getInt("id"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setAño(rs.getString("año"));
                    v.setMatricula(rs.getString("matricula"));
                    v.setIdChofer(rs.getInt("id_chofer"));
                    v.setIdRuta(rs.getInt("id_ruta"));
                    v.setIdUsuario(rs.getInt("id_usuario"));

                    datos.add(v);
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al listar vehiculos: " + e);
        }

        return datos;
    }

    /**
     * Carga un solo vehículo según su ID.
     *
     * @param id
     * @return
     */
    public Vehiculo cargarVehiculo(int id) {

        String sql = "SELECT * FROM Vehiculo WHERE id = ?";
        Vehiculo v = null;

        try {

            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    v = new Vehiculo();
                    v.setId(rs.getInt("id"));
                    v.setMarca(rs.getString("marca"));
                    v.setModelo(rs.getString("modelo"));
                    v.setAño(rs.getString("año"));
                    v.setMatricula(rs.getString("matricula"));
                    v.setIdChofer(rs.getInt("id_chofer"));
                    v.setIdRuta(rs.getInt("id_ruta"));
                    v.setIdUsuario(rs.getInt("id_usuario"));
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al cargar vehiculo: " + e);
        }

        return v;
    }

    /**
     * Registra un nuevo vehículo en la base de datos.
     *
     * @param v
     * @return
     */
    public int agregar(Vehiculo v) {

        String sql = "INSERT INTO Vehiculo(marca, modelo, año, matricula, id_chofer, id_ruta, id_usuario) VALUES(?,?,?,?,?,?,?)";

        try {

            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            // Se asignan los valores del objeto al query
            ps.setString(1, v.getMarca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getAño());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, v.getIdChofer());
            ps.setInt(6, v.getIdRuta());
            ps.setInt(7, v.getIdUsuario());

            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al insertar vehiculo: " + e);
        }
        return 0;
    }

    /**
     * Actualiza un vehículo existente en la base de datos.
     */
    public int actualizar(Vehiculo v) {
        String sql = "UPDATE Vehiculo SET marca=?, modelo=?, año=?, matricula=?, id_chofer=?, id_ruta=?, id_usuario=? WHERE id=?";

        try {

            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            // Se actualizan los campos del vehículo
            ps.setString(1, v.getMarca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getAño());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, v.getIdChofer());
            ps.setInt(6, v.getIdRuta());
            ps.setInt(7, v.getIdUsuario());
            ps.setInt(8, v.getId());

            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al actualizar vehiculo: " + e);
            return 0;
        }
    }

    /**
     * Elimina un vehículo según su ID.
     *
     * @param id
     * @return
     */
    public int eliminar(int id) {
        String sql = "DELETE FROM Vehiculo WHERE id = ?";

        try {
            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar vehiculo: " + e);
        }
        return 0;
    }

    /**
     * Cuenta la cantidad de vehículos registrados por usuario.
     *
     * @param idUsuario
     * @return
     */
    public int contarVehiculos(int idUsuario) {
        String sql = "SELECT COUNT(*) FROM Vehiculo WHERE id_usuario = ?";
        int total = 0;

        try {
            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, idUsuario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    total = rs.getInt(1);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al contar vehiculos: " + e);
        }
        return total;
    }
    
    /**
     * Este metodo se encarga de filtrar los vehículos. El mismo devuelve un
     * objeto tipo arrayList.
     *
     * @param valorBuscar
     * @param id_usuario
     * @return datos
     */
    public List<Vehiculo> filtrarVehiculo(String valorBuscar, int id_usuario) {

        String sql = "SELECT * FROM Vehiculo "
                + "WHERE (marca LIKE ? OR modelo LIKE ? OR año LIKE ? OR matricula LIKE ?) AND id_usuario = ?";

        List<Vehiculo> datos = new ArrayList<>();
        try {

            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            String buscar = "%" + valorBuscar + "%";
            ps.setString(1, buscar);
            ps.setString(2, buscar);
            ps.setString(3, buscar);
            ps.setString(4, buscar);
            ps.setInt(5, id_usuario);

            rs = ps.executeQuery();

            while (rs.next()) {
                Vehiculo v = new Vehiculo();
                v = new Vehiculo();
                v.setId(rs.getInt("id"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));
                v.setAño(rs.getString("año"));
                v.setMatricula(rs.getString("matricula"));
                v.setIdChofer(rs.getInt("id_chofer"));
                v.setIdRuta(rs.getInt("id_ruta"));
                v.setIdUsuario(rs.getInt("id_usuario"));
                datos.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los vehículos: " + e);
        } finally {
            cerrarRecursos();
        }
        return datos;
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
            //if(con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar conexión: " + e.getMessage());
        }
    }

    
}
