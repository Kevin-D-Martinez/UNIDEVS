package gestionUsuarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO Usuarios.
 * @author Kevin Daniel Martinez Reyes
 */
public class UsuarioDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public int login(String nombreCompletoOEmail, String contraseña){
        String sql = "SELECT * FROM Chofer "+
                     "WHERE nombre||apellido||email||contraseña LIKE '%"+nombreCompletoOEmail+"%'";
        
        return 1;
    }
    
    /**
     * Este metodo se encarga de registrar un nuevo usuario.
     * Devuelve un 1 si se ha realizado con exito la insercion.
     * @param c
     * @return 1
     */
    public int agregar(Usuario c){
        
        String sql = "INSERT INTO Chofere(nombre, apellido, email, contraseña) VALUES (?, ?, ?, ?)";
        
        try{
            con = chofer.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
                    
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getContraseña());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e);
        }
        return 1;
    }
    
    /**
     * Este metodo se encarga de actualizar un usuario,
     * devuelve el numero de usuarios afectados.
     * @param c
     * @return r
     */
    public int actualizar(Usuario c){
        int r = 0;
        
        String sql = "UPDATE Chofer set nombre=?, apellido=?, email=?, contraseña=?";
        
        try{
            con = chofer.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getContraseña());
            
            r = ps.executeUpdate();
            
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de actualizar usuario: " + e);
        }
        return r;
    }
}
