
/**
 * Representa un vehículo con información básica
 * y operaciones relacionadas con su mantenimiento.
 */
public class Vehiculo{
    private String placa;
    private String marca;
    private String modelo;
    
    /**
     * Constructor por defecto
     * Inicializa con valores predeterminados
     */
    public Vehiculo(){
        this.placa = "A534245";
        this.marca = "Nissan Skyline";
        this.modelo = "R34";
    }
    
    /**
     * Constructor básico
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     */
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    /**
     * Asigna valor a todos los atributos
     * @param placa Identificador único del vehiculo
     * @param marca Marca del vehículo
     * @param modelo Modelo del vehículo
     */
    public Vehiculo(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    /**
     * Calcula costo base según kilometraje.
     * @param kilometraje kilómetros recorridos
     * @return costo estimado
     */
    private double costoPorKilometraje(int kilometraje) {

        int resto20000 = kilometraje % 20000;
        int resto5000  = kilometraje % 5000;

        if (resto20000 <= 1000 || resto20000 >= 19000) {
            return 3000;
        }

        if (resto5000 <= 500 || resto5000 >= 4500) {
            return 2000;
        }

        return 0;
    }
    
    /**
     * Calcula costo según tipo de servicio.
     * @param tipoServicio tipo de mantenimiento
     * @return costo asociado
     */
    private double costoPorTipoServicio(String tipoServicio) {

        if (tipoServicio.equalsIgnoreCase("Preventivo")) {
            return 2000;
        } else if (tipoServicio.equalsIgnoreCase("Intermedio")) {
            return 4000;
        } else if (tipoServicio.equalsIgnoreCase("Completo")) {
            return 8000;
        }

        return 0;
    }
    
    /**
     * Calcula el costo del mantemiento del vehículo por kilometraje
     * @param kilometraje Distancia rrecorrida total del vehículo
     * @return Costo del servicio 
     */
    public double calcularMantenimiento(int kilometraje){
        
        return costoPorKilometraje(kilometraje);
    }
    
    /**
     * Calcula el costo del mantemiento del vehículo por kilometraje y tipo de servicio
     * @param kilometraje Distancia rrecorrida total del vehículo
     * @param tipoServicio Servicio que se le hará al vehículo
     * @return Costo total del servicio
     */
    public double calcularMantenimiento(int kilometraje, String tipoServicio){
        
        double costeTotal = (costoPorKilometraje(kilometraje) + costoPorTipoServicio(tipoServicio));
        return costeTotal;
    }
    
    /**
     * Calcula mantenimiento incluyendo tipo de transmisión.
     * @param kilometraje kilómetros recorridos
     * @param tipoServicio tipo de servicio
     * @param tipoTransmision tipo de transmisión (Manual, Automatica, CVT)
     * @return costo total estimado
     */
    public double calcularMantenimiento(int kilometraje, String tipoServicio, String tipoTransmision) {

        double costeTotal = (costoPorKilometraje(kilometraje) + costoPorTipoServicio(tipoServicio));

        if (tipoTransmision.equalsIgnoreCase("Automatica")) {
            costeTotal += costeTotal * 0.15;
        } else if (tipoTransmision.equalsIgnoreCase("CVT")) {
            costeTotal += costeTotal * 0.20;
        }

        return costeTotal;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}