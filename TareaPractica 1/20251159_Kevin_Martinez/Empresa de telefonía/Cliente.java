/**
 * Representa un cliente de la empresa de telecomunicaciones
 */
public class Cliente{
    private String nombre;
    private String numeroTelefonico;
    Plan plan;
    
    /**
     * Constructor que crea un cliente con su plan asociado
     *
     * @param nombre Nombre del cliente
     * @param numeroTelefonico Número telefónico asignado
     * @param plan Plan contratado
     */
    public Cliente(String nombre, String numeroTelefonico, Plan plan){
        this.nombre = nombre;
        this.numeroTelefonico = numeroTelefonico;
        this.plan = plan;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getNumeroTelefonico(){
        return this.numeroTelefonico;
    }
    
    public Plan getPlan(){
        return this.plan;
    }
}