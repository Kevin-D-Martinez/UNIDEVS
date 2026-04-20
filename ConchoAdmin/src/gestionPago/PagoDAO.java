package gestionPago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * DAO de Pagos
 * @author Luis Alberto Moscoso Rivera 2025-2065.
 */

public class PagoDAO{
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    // Metodo para insertar un nuevo pago
    public boolean crearPago(Pago pago){
        String sql = "INSERT INTO Pago (monto, metodoPago, estado, id_chofer, id_ruta, id_usuario) VALUES (?, ?, ?, ?, ?, ?)";
        
        try{
            con = ConexionMySQL.conectar();
            ps = con.prepareStatement(sql);
            
            // Usamos los Getters del DTO para llenar los campos '?'
            ps.setDouble(1, pago.getMonto());
            ps.setString(2, pago.getMetodoPago());
            ps.setString(3, pago.getEstadoPago());
            ps.setString(4, pago.getId_chofer());
            ps.setString(5, pago.getId_ruta());
            ps.setInt(6, pago.getId_usuario());
            
            int resultado = ps.executeUpdate();
            return resultado > 0; // Retorna true si se guardo
            
    }catch(SQLException e){
        System.err.println("Error al someter el pago: " + e.getMessage());
        return false;
    }finally{
        cerrarRecursos();
    }
    
}
    // Metodo para Listar (Ver todos los pagos
    public List<Pago> listarPagos() {
    List<Pago> lista = new ArrayList<>();
    String sql = "SELECT * FROM Pago ORDER BY fechaCreacion DESC";
    try {
        con = ConexionMySQL.conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Pago p = new Pago();
            p.setId(rs.getInt("id"));
            p.setMonto(rs.getDouble("monto"));
            p.setMetodoPago(rs.getString("metodoPago"));
            p.setEstadoPago(rs.getString("estado"));
            p.setId_chofer(rs.getString("id_chofer"));
            p.setId_ruta(rs.getString("id_ruta"));
            p.setId_usuario(rs.getInt("id_usuario"));
            p.setFechaCreacion(rs.getString("fechaCreacion"));
            lista.add(p);
        }
    } catch (SQLException e) {
        System.err.println("Error al listar pagos: " + e.getMessage());
    } finally{
        cerrarRecursos();
    }
    return lista;
}
    
    // Metodo pra Actualizar Estado (Aprobar Pago)
    public boolean actualizarEstado(int idPago, String nuevoEstado) {
    String sql = "UPDATE Pago SET estado = ? WHERE id = ?";
    try {
        con = ConexionMySQL.conectar();
        ps = con.prepareStatement(sql);
        ps.setString(1, nuevoEstado);
        ps.setInt(2, idPago);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.err.println("Error al actualizar estado: " + e.getMessage());
        return false;
     }
   }
    
    
    // Metodo para Buscar por Chofer
    public List<Pago> listarPorChofer(int idChofer) {
    List<Pago> lista = new ArrayList<>();
    String sql = "SELECT * FROM Pago WHERE id_chofer = ?";
    try {
        con = ConexionMySQL.conectar();
        ps = con.prepareStatement(sql);
        ps.setInt(1, idChofer);
        rs = ps.executeQuery();
          while (rs.next()) {
            Pago p = new Pago();
            p.setId(rs.getInt("id"));
            p.setMonto(rs.getDouble("monto"));
            p.setMetodoPago(rs.getString("metodoPago"));
            p.setEstadoPago(rs.getString("estado"));
            p.setId_chofer(rs.getString("id_chofer"));
            p.setId_ruta(rs.getString("id_ruta"));
            p.setId_usuario(rs.getInt("id_usuario"));
            p.setFechaCreacion(rs.getString("fechaCreacion"));
            lista.add(p);
        } 
    } catch (SQLException e) {
        System.err.println("Error al buscar por chofer: " + e.getMessage());
    } finally{
        cerrarRecursos();
    }
    return lista;
}
    
    // Metodo para Contar Pagos Pendientes
    public int contarPagosPendientes(){
        String sql = "SELECT COUNT(*) AS total FROM Pago WHERE id_usuario = 'Pendiente'";
        int total = 0;
        
        try{
          con = ConexionMySQL.conectar();
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          
          if (rs.next()){
              total = rs.getInt("total");
          }
          
        }catch (SQLException e){
            System.err.println("Error al contar Pagos: " + e.getMessage());
        }finally{
            cerrarRecursos();
        }   
        return total;
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

