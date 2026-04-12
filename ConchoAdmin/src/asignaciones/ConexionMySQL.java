package asignaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexión BD ConchoAdmin (MySQL).
 * @author Kevin Daniel Martinez Reyes
 */
public class ConexionMySQL {

    /**
     * Datos necesarios para crear la conexión
     */
    static String url = "jdbc:mysql://bua4hqkt6dimvqko4gzv-mysql.services.clever-cloud.com:3306/bua4hqkt6dimvqko4gzv";
    static String user = "u40gkd53pb7ugtgz";
    static String password = "tR7mxHFGLgO9ukfBXxSZ";

    /**
    * Método que crea la conexión a la Bases de Datos
    * MySQL y retorna un objeto de tipo Connection o null.
    * @return cn / null
    */
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("La conexión a sido exitosa");
            return con;
        } catch (SQLException e) {
            System.out.println("Error al tratar de conectar: " + e.getMessage());
            return null;
        }
    }
}