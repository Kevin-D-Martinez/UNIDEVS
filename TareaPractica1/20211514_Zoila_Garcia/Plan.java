/*
 */
package sistematelefonia;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Plan {
    private int minutosIncluidos;
    private int cantidadDatosGB;
    private double precioMensual;
    private String nombre;
    
    public Plan (String nombre, int minutosIncluidos,int cantidadDatosGB,double precioMensual){
        this.nombre = nombre;
        this.minutosIncluidos = minutosIncluidos;
        this.cantidadDatosGB = cantidadDatosGB;
        this.precioMensual = precioMensual;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
    
    public int obtenerMinutos() {
        return this.minutosIncluidos;
    }
    
    public int obtenerDatos() {
        return this.cantidadDatosGB;
    }
    
    public double obtenerPrecio() {
        return this.precioMensual;
    }
    
}
