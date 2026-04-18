package gestionRutas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO de rutas
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class RutaDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean agregarRuta(Ruta ruta) {
        String sql = "INSERT INTO Ruta (nombre,tarifa,id_usuario) VALUES (?,?,?)";
        
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1,ruta.getNombre());
            ps.setDouble(2,ruta.getTarifa());
            ps.setInt(3,ruta.getIdUsuario());
            
            return ps.executeUpdate() == 1;
        }
        
        catch(SQLException e){
            System.out.println("Error al agregar ruta: " + e);
        }
        
        return false;
    }
    
    public List leerRutas(){
        String sql = "SELECT * FROM Ruta WHERE idUsuario = 8";
        List<Ruta>datos = new ArrayList<>();
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            //ps.setString(1,);         --necesito el usuario activo, cambiar el statement cuando lo tenga
            rs  = ps.executeQuery();
            
            while(rs.next()){
                
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                double tarifa = rs.getDouble(3);
                int idUsuario = rs.getInt(4);

                Ruta ruta = new Ruta(id,nombre,tarifa,idUsuario);
                datos.add(ruta);
            }
        }catch(SQLException e){
            System.out.println("Error al listar las rutas: " + e);
        }
        return datos;
    }
    
    public boolean actualizarRuta(Ruta ruta) {
        String sql = "UPDATE Ruta set nombre = ?,tarifa = ?, id_usuario = ? where id = ?";
        
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1,ruta.getNombre());
            ps.setDouble(2,ruta.getTarifa());
            ps.setInt(3,ruta.getIdUsuario());
            ps.setInt(4,ruta.getId());
            
            return ps.executeUpdate() == 1;
        }
        
        catch(SQLException e){
            System.out.println("Error al actualizar ruta: " + e);
        }
        
        return false;
    }
    
    public boolean eliminarRuta(Ruta ruta) {
        String sql = "DELETE FROM Ruta where id = ?";
        
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,ruta.getId());
            
            return ps.executeUpdate() == 1;
        }
        
        catch(SQLException e){
            System.out.println("Error al eliminar ruta: " + e);
        }
        
        return false;
    }
    
}
