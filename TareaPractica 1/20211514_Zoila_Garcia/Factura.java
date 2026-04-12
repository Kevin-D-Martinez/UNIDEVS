/*
 */
package sistematelefonia;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Factura {
    private Cliente cliente;
    private Plan plan;
    private double minutosConsumidos;
    private double datosConsumidosGB;
    private double cargosExtra = 0;
    private double total;
    
    public Factura(Cliente cliente,double minutosConsumidos, double datosConsumidosGB) {
        this.cliente = cliente;
        this.datosConsumidosGB = datosConsumidosGB;
        this.plan = cliente.obtenerPlan();
        this.minutosConsumidos = minutosConsumidos;
    }
    
    private void generarFactura() {
        if (this.minutosConsumidos > this.plan.obtenerMinutos())
            this.cargosExtra = 1200;
        
        this.total = this.plan.obtenerPrecio() + this.cargosExtra;
    }
    
    public void imprimirFactura() {
        this.generarFactura();
        
        System.out.println("========= Factura Mensual =========");
        System.out.println("Nombre del cliente: " + this.cliente.obtenerNombre());
        System.out.println("Teléfono: " + this.cliente.obtenerNumero());
        System.out.println("Plan contratado: " + this.plan.obtenerNombre());
        System.out.println("Minutos incluidos: " + this.plan.obtenerMinutos());
        System.out.println("Datos incluidos: " + this.plan.obtenerDatos());
        System.out.println("");
        System.out.println("Minutos consumidos: " + this.minutosConsumidos);
        System.out.println("Datos consumidos: " + this.datosConsumidosGB);
        System.out.println("");
        System.out.println("Costo plan: " + this.plan.obtenerPrecio());
        System.out.println("Multa por exceso: " + this.cargosExtra);
        System.out.println("Total a pagar: " + this.total);
        System.out.println("");
    }
    
    
}
