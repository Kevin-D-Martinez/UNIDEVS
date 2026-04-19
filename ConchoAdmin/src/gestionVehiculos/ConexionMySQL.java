package gestionVehiculos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexion BD ConchoAdmin (MySQL).
 * @author Darvin Mendez
 */

public class ConexionMySQL {
    
     /**
     * Datos necesarios para la creación de la conexión
     */
    static String url = "jdbc:mysql://bua4hqkt6dimvqko4gzv-mysql.services.clever-cloud.com:3306/bua4hqkt6dimvqko4gzv";
    static String user = "u40gkd53pb7ugtgz";
    static String password = "tR7mxHFGLgO9ukfBXxSZ";

     /**
     * Metodo que crea la conexion a la base de datos.
     * Retorna un objeto de tipo Connection o null si falla.
     * @return con / null
     */
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("La conexión ha sido exitosa");
            return con;
        } catch (SQLException e) {
            System.out.println("Ha ocurrido un error al tratar de conectarse: " + e.getMessage());
            return null;
        }
    }
}