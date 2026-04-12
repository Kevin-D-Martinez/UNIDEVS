/*
 */
package asignacion3_1;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class AutoMovil {

    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor
    public AutoMovil() {
        System.out.println("Constructor de AutoMóvil");
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Metodos
    public void encender() {
        System.out.println("El auto está encendido.");

    }

    public void apagar() {
        System.out.println("El auto está apagado.");

    }

    public void acelerar() {
        System.out.println("El auto ha acelerado 5kph.");

    }

    public void frenar() {
        System.out.println("El auto ha desacelerado 5kph.");

    }

}
