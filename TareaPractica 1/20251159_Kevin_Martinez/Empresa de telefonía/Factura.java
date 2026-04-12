/**
 * Representa la factura mensual de un cliente
 */
public class Factura {

    private Cliente cliente;
    private int minutosConsumidos;
    private int datosConsumidosGB;

    private static final double COSTO_MINUTO_EXTRA = 2.0;
    private static final double COSTO_GB_EXTRA = 5.0;

    /**
     * Constructor que crea una factura para un cliente específico
     *
     * @param cliente Cliente facturado
     * @param minutosConsumidos Minutos utilizados en el mes
     * @param datosConsumidosGB Datos utilizados en el mes (GB)
     */
    public Factura(Cliente cliente, int minutosConsumidos, int datosConsumidosGB) {
        this.cliente = cliente;
        this.minutosConsumidos = minutosConsumidos;
        this.datosConsumidosGB = datosConsumidosGB;
    }

    /**
     * Calcula el cargo adicional por exceso de minutos
     *
     * @return Monto por minutos adicionales
     */
    public double calcularExcesoMinutos() {
        int exceso = minutosConsumidos - cliente.getPlan().getMinutosIncluidos();
        if (exceso > 0) {
            return exceso * COSTO_MINUTO_EXTRA;
        }
        return 0;
    }

    /**
     * Calcula el cargo adicional por exceso de datos
     *
     * @return Monto por datos adicionales
     */
    public double calcularExcesoDatos() {
        int exceso = datosConsumidosGB - cliente.getPlan().getDatosGB();
        if (exceso > 0) {
            return exceso * COSTO_GB_EXTRA;
        }
        return 0;
    }

    /**
     * Calcula el monto total a pagar
     *
     * @return Total a pagar
     */
    public double calcularTotal() {
        double base = cliente.getPlan().getPrecioMensual();
        return base + calcularExcesoMinutos() + calcularExcesoDatos();
    }

    /**
     * Genera un resumen detallado de la factura y lo muestra en consola.
     */
    public void generarFactura() {
        System.out.println("===== FACTURA =====");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Número: " + cliente.getNumeroTelefonico());
        System.out.println("Plan: " + cliente.getPlan().getIdPlan());
        System.out.println("Precio Base: $" + cliente.getPlan().getPrecioMensual());
        System.out.println("Exceso Minutos: $" + calcularExcesoMinutos());
        System.out.println("Exceso Datos: $" + calcularExcesoDatos());
        System.out.println("TOTAL A PAGAR: $" + calcularTotal());
    }
}