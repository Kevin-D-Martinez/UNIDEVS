package gestionVehiculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO Vehiculos.
 * Clase encargada de gestionar las operaciones CRUD
 * sobre la tabla Vehiculo en la base de datos.
 * @author Darvin Mendez
 */
public class VehiculoDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Este metodo se encarga de listar todos los vehiculos.
     * Devuelve un objeto tipo ArrayList con los datos.
     * @return datos
     */
    public List listar(){
        String sql = "SELECT * FROM Vehiculo";
        List<Vehiculo> datos = new ArrayList<>();
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Vehiculo v = new Vehiculo();
                v.setId(rs.getInt(1));
                v.setMarca(rs.getString(2));
                v.setModelo(rs.getString(3));
                v.setAño(rs.getString(4));
                v.setMatricula(rs.getString(5));
                v.setIdChofer(rs.getInt(6));
                v.setIdRuta(rs.getInt(7));
                v.setIdUsuario(rs.getInt(8));
                datos.add(v);
            }
            
        } catch(SQLException e){
            System.out.println("Error al listar vehiculos: " + e);
        }
        return datos;
    }

    /**
     * Este metodo se encarga de registrar un nuevo vehiculo.
     * Devuelve 1 si la insercion se realiza correctamente.
     * @param v
     * @return 1
     */
    public int agregar(Vehiculo v){
        
        String sql = "INSERT INTO Vehiculo(marca, modelo, año, matricula, id_chofer, id_ruta, id_usuario) VALUES(?,?,?,?,?,?,?)";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
                    
            ps.setString(1, v.getMarca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getAño());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, v.getIdChofer());
            ps.setInt(6, v.getIdRuta());
            ps.setInt(7, v.getIdUsuario());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al insertar vehiculo: " + e);
        }
        return 1;
    }

    /**
     * Este metodo se encarga de actualizar un vehiculo.
     * Devuelve el numero de registros afectados.
     * @param v
     * @return r
     */
    public int actualizar(Vehiculo v){
        int r = 0;
        
        String sql = "UPDATE Vehiculo set marca=?, modelo=?, año=?, matricula=?, id_chofer=?, id_ruta=?, id_usuario=? WHERE id=?";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, v.getMarca());
            ps.setString(2, v.getModelo());
            ps.setString(3, v.getAño());
            ps.setString(4, v.getMatricula());
            ps.setInt(5, v.getIdChofer());
            ps.setInt(6, v.getIdRuta());
            ps.setInt(7, v.getIdUsuario());
            ps.setInt(8, v.getId());
            
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar vehiculo: " + e);
        }
        return r;
    }

    /**
     * Este metodo se encarga de eliminar un vehiculo.
     * Devuelve el numero de registros afectados.
     * @param id
     * @return r
     */
    public int eliminar(int id){
        int r = 0;
        
        String sql = "DELETE FROM Vehiculo WHERE id = " + id;
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            
            r = ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al eliminar vehiculo: " + e);
        }
        return r;
    }
}