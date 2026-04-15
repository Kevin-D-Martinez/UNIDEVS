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
     * Este metodo se encarga de listar un chofer.
     * El mismo devuelve un objeto tipo arrayList.
     * @param valorBuscar
     * @return datos
     */
    public List listarChofer(String valorBuscar){
        
        String sql = "SELECT * FROM Chofer "+
                     "WHERE id||nombre||apellido||cedula||telefono||estado LIKE '%"+valorBuscar+"%'";
        
        List<Chofer>datos = new ArrayList<>();
        try{
            
            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
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
        }
        return datos;
    }
    
    
    /**
     * Este metodo se encarga de listar todos los choferes. 
     * El mismo devuelve un objeto tipo arrayList.
     * @return datos
     */
    public List listar(){
        String sql = "SELECT * FROM Chofer";
        List<Chofer>datos = new ArrayList<>();
        try{
            
            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
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
        
        String sql = "INSERT INTO Choferes(nombre, apellido, cedula, telefono, estado, id_ruta, id_usuario) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try{
            con = asignaciones.ConexionMySQL.conectar();
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
        
        String sql = "UPDATE Chofer set nombre=?, apellido=?, cedula=?, telefono=?, estado=? where id=?";
        
        try{
            con = asignaciones.ConexionMySQL.conectar();
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
            con = asignaciones.ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            
            r = ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar chofer: " + e);
        }
        return r;
    }
}
