package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    static String url = "jdbc:mysql://bua4hqkt6dimvqko4gzv-mysql.services.clever-cloud.com";
    static String user = "u40gkd53pb7ugtgz";
    static String password = "tR7mxHFGLgO9ukfBXxSZ";

    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado");
            return con;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}