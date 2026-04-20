package gestionRutas;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Conexion BD ConchoAdmin (MySQL) V2
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class ConexionMySQL {

    private static Connection connect;

    public static Connection conectar() {

        // Si ya hay una conexión abierta, no abre otra
        if (connect == null) {
            try {

                /*
                Carga el archivo config.properties y los datos que contiene,
                luego los asigna a variables para la conexión con la base de datos.
                 */
                Properties props = new Properties();
                props.load(new FileInputStream("config.properties"));
                String url = props.getProperty("db.url");
                String usuario = props.getProperty("db.usuario");
                String contra = props.getProperty("db.contra");
                connect = DriverManager.getConnection(url, usuario, contra);
                System.out.println("Conexión exitosa");

            } catch (IOException e) {
                System.out.println("No se encontró config.properties");

            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos");
            }
        }
        return connect;
    }
}







//package gestionRutas;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
///**
// * Clase  para gestionar la conexión a la base de datos MySQL.
// * <p>
// * Lee las credenciales desde el archivo externo config.properties.
// * Cada llamada a conectar() abre una nueva conexión independiente,
// * por lo que debe ser cerrada al terminar.
// * </p>
// *
// * <b>Ejemplo de config.properties:</b>
// * <pre>
// *   db.url=jdbc:mysql://host:3306/basededatos
// *   db.usuario=usuario
// *   db.contra=contraseña
// * </pre>
// *
// * @author Kevin Daniel Martinez Reyes y Zoila García
// * @version 3.0
// */
//public class ConexionMySQL {
//
//    /**
//     * Datos necesarios para la creación de la conexión
//     */
//    static Properties props = new Properties();
//    static String url = null;
//    static String user = null;
//    static String password = null;
//
//    /**
//     * Metodo que crea la conexion a la Bases de Datos MySQL y retorna un objeto
//     * de tipo Connection o nulo.
//     *
//     * @return Objeto Connection si la conexión fue exitosa, null en caso de error.
//     */
//    public static Connection conectar() {
//        try {
//            props.load(new FileInputStream("config.properties"));
//            url = props.getProperty("db.url");
//            user = props.getProperty("db.usuario");
//            password = props.getProperty("db.contra");
//
//            Connection con = DriverManager.getConnection(url, user, password);
//            System.out.println("La conexión ha sido exitosa");
//            return con;
//        } catch (IOException e) {
//            System.out.println("No se encontró config.properties");
//            return null;
//
//        } catch (SQLException e) {
//            System.out.println("Ha ocurrido un error al tratar de conectarse: " + e.getMessage());
//            return null;
//        }
//    }
//}
