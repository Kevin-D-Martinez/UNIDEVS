/**
 * Representa un plan de telefonía ofrecido por la empresa
 */
public class Plan{
    private String idPlan;
    private int minutosIncluidos;
    private int datosGB;
    private double precioMensual;
    
    /**
     * Constructor que inicializa un plan con sus características principales
     *
     * @param idPlan Identificador del plan
     * @param minutosIncluidos Minutos incluidos en el plan
     * @param datosGB Cantidad de datos incluidos en GB
     * @param precioMensual Precio mensual del plan
     */
    public Plan(String idPlan, int minutosIncluidos, int datosGB, double precioMensual){
        this.idPlan = idPlan;
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }
    
    public String getIdPlan(){
        return this.idPlan;
    }
    
    public int getMinutosIncluidos(){
        return this.minutosIncluidos;
    }
    
    public int getDatosGB(){
        return this.datosGB;
    }
    
    public double getPrecioMensual(){
        return this.precioMensual;
    }
}