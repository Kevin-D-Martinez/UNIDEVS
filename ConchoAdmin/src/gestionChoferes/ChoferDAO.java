package gestionChoferes;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ChoferDAO {
    
    public static void guardarChofer(String nombre, String apellido, boolean activo, String telefono, String cedula){
        
        String sql = "INSERT INTO Choferes(nombre, apellido, activo, cedula, telefono) VALUES (?, ?, ?, ?, ?)";
        
        try {
            Connection con = chofer.ConexionMySQL.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setBoolean(3, activo);
            ps.setString(4, cedula);
            ps.setString(5, telefono);
            
            ps.executeUpdate();
            
            System.out.println("Chofer agregado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarChofer(int id){

    }
}
