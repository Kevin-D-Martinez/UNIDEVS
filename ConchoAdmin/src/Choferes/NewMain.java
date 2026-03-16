
package Choferes;
import Conexion.ConexionDB;

/**
 *
 * @author lapar
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chofer chofer = new Chofer(1,"Kevin", "Martinez", true, 2);
        
        System.out.print(chofer.toString());
        GestionChofer.guardarChofer("Kevin", "Martinez", true, "8297358353", "05253625625");
        
    }
    
}