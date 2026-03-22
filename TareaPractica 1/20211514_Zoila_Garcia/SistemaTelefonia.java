/*
 */
package sistematelefonia;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class SistemaTelefonia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear planes
        System.out.println("=== PRUEBA 1: Creación de planes ===");
        Plan planA = new Plan("Plan básico",100,5,1000);
        Plan planB = new Plan("Plan premium",300,15,2500);
        System.out.println("Planes creados (2).");
        System.out.println("");

        // Crear clientes
        System.out.println("=== PRUEBA 2: Creación de clientes ===");
        Cliente cliente1 = new Cliente("Ana López", "809-555-1111", planA);
        Cliente cliente2 = new Cliente("Carlos Pérez", "809-555-2222", planB);
        System.out.println("Clientes creados (2).");
        System.out.println("");

        // Crear facturas
        System.out.println("=== PRUEBA 3: Creación de facturas ===");
        Factura facturaA = new Factura(cliente1,80,4);
        Factura facturaB = new Factura(cliente2,350,10);
        System.out.println("Facturas creadas (2).");
        System.out.println("");

        // calcular e imprimir facturas
        
        facturaA.imprimirFactura();
        facturaB.imprimirFactura();
    }

}
