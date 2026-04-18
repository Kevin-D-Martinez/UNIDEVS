/*
 */
package gestionRutas;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ruta {
    private int id;
    private String nombre;
    private double tarifa;
    private int idUsuario;

    public Ruta(int id, String nombre, double tarifa, int idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
