/*
 */
package sistematelefonia;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Cliente {
    private String nombre;
    private String numeroTelefonico;
    private Plan planActual;
    
    public Cliente(String nombre, String numeroTelefonico, Plan planActual) {
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.planActual = planActual;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
    
    public String obtenerNumero() {
        return this.numeroTelefonico;
    }
    
    public Plan obtenerPlan() {
        return this.planActual;
    }
}
