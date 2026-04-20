package gestionChoferes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO choferes.
 * @author Kevin Daniel Martinez Reyes
 */
public class ChoferDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /**
     * Este metodo se encarga de listar los choferes activos. El mismo devuelve un objeto tipo arrayList.
     * @param estado
     * @param id_usuario
     * @return datos
     */
    public List<Chofer> listarChoferActivo(String estado, int id_usuario){
        
        String sql = "SELECT * FROM Chofer "+
                     "WHERE estado = ? AND id_usuario = ?";
        
        List<Chofer>datos = new ArrayList<>();
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id_usuario);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Chofer c = new Chofer();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCedula(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setEstado(rs.getString(6));
                datos.add(c);
            }
        }catch(SQLException e){
            System.out.println("Error al listar los choferes: " + e);
        }finally {
            cerrarRecursos();
        }
        return datos;
    }
    
    /**
     * Este metodo se encarga de listar un chofer.El mismo devuelve un objeto tipo arrayList.
     * @param valorBuscar
     * @param id_usuario
     * @return datos
     */
    public List<Chofer> listarChofer(String valorBuscar, int id_usuario){
        
        String sql = "SELECT * FROM Chofer "+
                     "WHERE nombre||apellido||cedula LIKE '%?%' AND id_usuario = ?";
        
        List<Chofer>datos = new ArrayList<>();
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, valorBuscar);
            ps.setInt(2, id_usuario);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Chofer c = new Chofer();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCedula(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setEstado(rs.getString(6));
                datos.add(c);
            }
        }catch(SQLException e){
            System.out.println("Error al listar los choferes: " + e);
        }finally {
            cerrarRecursos();
        }
        return datos;
    }
    
    
    /**
     * Este metodo se encarga de listar todos los choferes.El mismo devuelve un objeto tipo arrayList.
     * @param id_usuario
     * @return datos
     */
    public List<Chofer> listar(int id_usuario){
        String sql = "SELECT * FROM Chofer WHERE id_usuario = ?";
        List<Chofer>datos = new ArrayList<>();
        try{
            
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_usuario);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Chofer c = new Chofer();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setCedula(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setEstado(rs.getString(6));
                datos.add(c);
            }
        }catch(SQLException e){
            System.out.println("Error al listar los choferes: " + e);
        } finally {
            cerrarRecursos();
        }
        return datos;
    }
    
    /**
     * Este metodo se encarga de registrar un nuevo chofer.
     * Devuelve un 1 si se ha realizado con exito la insercion.
     * @param c
     * @return 1
     */
    public int agregar(Chofer c){
        
        String sql = "INSERT INTO Chofere(nombre, apellido, cedula, telefono, estado, id_ruta, id_usuario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
                    
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getCedula());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getEstado());
            ps.setInt(6, c.getIdRuta());
            ps.setInt(7, c.getIdUsuario());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al insertar chofer: " + e);
        } finally {
            cerrarRecursos();
        }
        return 1;
    }
    
    /**
     * Este metodo se encarga de actualizar un chofer,
     * devuelve el numero de choferes afectados.
     * @param c
     * @return r
     */
    public int actualizar(Chofer c){
        int r = 0;
        
        String sql = "UPDATE Chofer set nombre=?, apellido=?, cedula=?, telefono=?, estado=? WHERE id=?";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getCedula());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getEstado());
            ps.setInt(6, c.getId());
            
            r = ps.executeUpdate();
            
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de actualizar chofer: " + e);
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

        int r = 0;
        
        String sql = "DELETE FROM Chofer WHERE id = " + id;
        
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
            System.out.println("Error al tratar de borrar chofer: " + e);
        } finally {
            cerrarRecursos();
        }
        return r;
    }
    
     // Metodo para cerrar recursos
    private void cerrarRecursos(){
        try{
            if(rs != null) rs.close();
            if(ps != null) ps.close();
            if(con != null) con.close();
        } catch(SQLException e){
            System.err.println("Error al cerrar: " + e.getMessage());
        }
    }
}
