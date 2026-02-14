/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase Factura
 * Calcula la factura mensual de un cliente según su plan y consumo real
 * Autor: Darvin Mendez
 */
public class Factura {

    private Cliente cliente;
    private int minutosUsados;
    private double datosUsados; // GB
    private double cargosExtra;

    // Constructor
    public Factura(Cliente cliente, int minutosUsados, double datosUsados) {
        this.cliente = cliente;
        this.minutosUsados = minutosUsados;
        this.datosUsados = datosUsados;
        this.cargosExtra = 0;
    }

    // Calcula monto total incluyendo cargos por exceso
    public double calcularTotal() {
        double total = cliente.getPlanContratado().getPrecioMensual();

        // Cargos por exceso de minutos
        if(minutosUsados > cliente.getPlanContratado().getMinutosIncluidos()) {
            cargosExtra += (minutosUsados - cliente.getPlanContratado().getMinutosIncluidos()) * 0.5;
        }

        // Cargos por exceso de datos
        if(datosUsados > cliente.getPlanContratado().getDatosGB()) {
            cargosExtra += (datosUsados - cliente.getPlanContratado().getDatosGB()) * 10; // $10 por GB extra
        }

        return total + cargosExtra;
    }

    // Genera resumen de factura
    public void generarFactura() {
        System.out.println("Factura para: " + cliente.getNombre());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Plan: " + cliente.getPlanContratado().getMinutosIncluidos() + " min, " 
                           + cliente.getPlanContratado().getDatosGB() + " GB, $"
                           + cliente.getPlanContratado().getPrecioMensual());
        System.out.println("Consumo real: " + minutosUsados + " min, " + datosUsados + " GB");
        System.out.println("Cargos extra: $" + cargosExtra);
        System.out.println("Monto total: $" + calcularTotal());
        System.out.println("------------------------------");
    }
}
