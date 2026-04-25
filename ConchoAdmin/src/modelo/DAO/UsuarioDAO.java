package modelo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.estructuraBD.ConexionMySQL;
import modelo.SesionActiva;
import modelo.DTO.Usuario;

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
        String sql = "SELECT * FROM Usuarios WHERE email = ?";
       
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
                    SesionActiva.getInstancia().setUsuarioActual(u);
                    return 1;
                }
            }
            
        } catch(SQLException e){
            System.out.println("Error al iniciar sesión: " + e);
        } finally {
            cerrarRecursos();
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
        
        String sql = "INSERT INTO Usuarios(nombre, apellido, email, contraseña) VALUES (?, ?, ?, ?)";
        
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
            cerrarRecursos();
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
        
        String sql = "UPDATE Usuarios set nombre=?, apellido=?, email=?, contraseña=? WHERE id=?";
        
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
            cerrarRecursos();
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
        
        String sql1 = "DELETE FROM Pagos WHERE id_usuario = ?";
        String sql2 = "DELETE FROM Vehiculos WHERE id_usuario = ?";
        String sql3 = "DELETE FROM Choferes WHERE id_usuario = ?";
        String sql4 = "DELETE FROM Rutas WHERE id_usuario = ?";
        String sql5 = "DELETE FROM Usuarios WHERE id = ?";
        
        try{
            con = ConexionMySQL.conectar();
            con.setAutoCommit(false);
            
            ps = con.prepareStatement(sql1);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            PreparedStatement ps2 = con.prepareStatement(sql2);
            ps2.setInt(1, id);
            ps2.executeUpdate();
            
            PreparedStatement ps3 = con.prepareStatement(sql3);
            ps3.setInt(1, id);
            ps3.executeUpdate();
            
            PreparedStatement ps4 = con.prepareStatement(sql4);
            ps4.setInt(1, id);
            ps4.executeUpdate();
            
            PreparedStatement ps5 = con.prepareStatement(sql5);
            ps5.setInt(1, id);
            ps5.executeUpdate();
            
            con.commit();
            
            try{
                ps2.close();
                ps3.close();
                ps4.close();
                ps5.close();
            } catch(SQLException e){
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
            
            return 1;
        } catch (SQLException e) {
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException ex) {
                System.out.println("Error en rollback: " + ex);
                return 0;
            }
            System.out.println("Error al tratar de borrar usuario: " + e);
        } finally {
            cerrarRecursos();
        }
        return 0;
    }
    
     // Metodo para cerrar recursos
    private void cerrarRecursos(){
        try{
            if(rs != null) {
                rs.close();
            }
            if(ps != null) {
                ps.close();
            }
        } catch(SQLException e){
            System.err.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}
