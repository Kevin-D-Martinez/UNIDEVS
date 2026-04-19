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
            ps = con.prepareStatement(sql);
            
            // Usamos los Getters del DTO para llenar los campos '?'
            ps.setDouble(1, pago.getMonto());
            ps.setString(2, pago.getMetodoPago());
            ps.setString(3, pago.getEstadoPago());
            ps.setInt(4, pago.getId_chofer());
            ps.setInt(5, pago.getId_ruta());
            ps.setInt(6, pago.getId_usuario());
            
            int resultado = ps.executeUpdate();
            return resultado > 0; // Retorna true si se guardo
            
    }catch(SQLException e){
        System.err.println("Error al someter el pago: " + e.getMessage());
        return false;
    }
    
}
    
    
    public int contarPagosPendientes(){
        String sql = "SELECT COUNT(*) AS total FROM Pago WHERE estado = 'Pendiente'";
        int total = 0;
        
        try{
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          
          if (rs.next()){
              total = rs.getInt("total");
          }
          
        }catch (SQLException e){
            System.err.println("Error al contar Pagos: " + e.getMessage());
    }
        return total;
}
    
}

// Commit Final