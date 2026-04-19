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
    
    /**
     * Este metodo se encarga de validar la existencia de un usuario para iniciar sesión.
     * Devuelve 1 si cumple con todo lo requerido, sino 0.
     * @param email
     * @param contraseña
     * @return 1/0
     */
    public int login(String email, String contraseña){
        String sql = "SELECT * FROM Usuario WHERE email = ?";
       
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery(); 
            
            if(rs.next()){
                Usuario u = new Usuario();
                
                u.setId(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setContraseña(rs.getString(5));
                
                if(contraseña.equals(u.getContraseña())){
                    Sesion.getInstancia().setUsuarioActual(u);
                    return 1;
                }
            }
            
        } catch(SQLException e){
            System.out.println("Error al iniciar sesión: " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        
        return 0;
    }
    
    /**
     * Este metodo se encarga de registrar un nuevo usuario.
     * Devuelve un 1 si se ha realizado con exito la insercion.
     * @param c
     * @return 1
     */
    public int agregar(Usuario c){
        
        String sql = "INSERT INTO Usuario(nombre, apellido, email, contraseña) VALUES (?, ?, ?, ?)";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
                    
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getContraseña());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                return 0;
            } else {
                System.out.println("Error al insertar usuario: " + e);
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
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
        
        String sql = "UPDATE Usuario set nombre=?, apellido=?, email=?, contraseña=? WHERE id=?";
        
        try{
            con = ConexionMySQL.conectar();
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
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        return r;
    }
    
    /**
     * Este metodo se encarga de eliminar el chofer seleccionado.
     * El mismo devuelve el numero de choferes afectados.
     * @param id
     * @return r
     */
    public int eliminar(int id){

        int r = 0;
        
        String sql1 = "DELETE FROM Pago WHERE id_usuario = ?";
        String sql2 = "DELETE FROM Vehiculo WHERE id_usuario = ?";
        String sql3 = "DELETE FROM Chofer WHERE id_usuario = ?";
        String sql4 = "DELETE FROM Ruta WHERE id_usuario = ?";
        String sql5 = "DELETE FROM Usuario WHERE id = ?";
        
        try{
            con = ConexionMySQL.conectar();
            
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setInt(1, id);
            ps1.executeUpdate();
            
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, id);
            ps2.executeUpdate();
            
            PreparedStatement ps3 = con.prepareStatement(sql2);
            ps3.setInt(1, id);
            ps3.executeUpdate();
            
            PreparedStatement ps4 = con.prepareStatement(sql3);
            ps4.setInt(1, id);
            ps4.executeUpdate();
            
            PreparedStatement ps5 = con.prepareStatement(sql4);
            ps5.setInt(1, id);
            ps5.executeUpdate();
            
            r = ps1.executeUpdate() + ps2.executeUpdate() + ps3.executeUpdate() + ps4.executeUpdate() + ps5.executeUpdate();
            if(r == 5){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar usuario: " + e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar: " + e);
            }
        }
        return r;
    }
}
