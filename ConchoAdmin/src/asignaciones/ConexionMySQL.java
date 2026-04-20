package asignaciones;

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