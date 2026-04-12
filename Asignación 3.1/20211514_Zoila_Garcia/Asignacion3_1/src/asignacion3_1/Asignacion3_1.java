/*
 */
package asignacion3_1;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Asignacion3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear instancia de AutoMovil
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAño(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.acelerar();

        System.out.println("\n--- Honda Civic ---");
        // Crear instancia de HondaCivic
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAño(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        honda.encender(); // Método sobrescrito
        honda.acelerar(); // Método sobrescrito
    }
}
