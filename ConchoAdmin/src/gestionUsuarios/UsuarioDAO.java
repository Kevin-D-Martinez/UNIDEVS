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
        
        String sql = "UPDATE Usuario set nombre=?, apellido=?, email=?, contraseña=?";
        
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
        
        String sql = "DELETE FROM Usuario WHERE id = " + id;
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            
            r = ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar usuario: " + e);
        }
        return r;
    }
}
