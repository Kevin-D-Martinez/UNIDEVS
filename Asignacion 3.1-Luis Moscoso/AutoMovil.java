/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author Luis
 */
public class AutoMovil {

    /**
     * @param args the command line arguments
     */
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    // Constructor
    public AutoMovil(){  
        System.out.println("Constructor de AutoMovil");
    }
   
    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }
    
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // Metodos normales
    public void encender(){
        System.out.println("Auto encendido");
    }
    
    public void apagar(){
        System.out.println("Auto apago");
    }
    
    public void acelerar(){
        System.out.println("Acelerando el auto");
    }
    
    public void frenar(){
        System.out.println("Frenando el auto");
    }
    
}