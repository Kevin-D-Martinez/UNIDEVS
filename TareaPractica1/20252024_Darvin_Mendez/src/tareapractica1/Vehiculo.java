/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase Vehiculo
 * Esta clase representa un automóvil con sus datos básicos: placa, marca y modelo.
 * También permite calcular mantenimiento usando métodos sobrecargados según los parámetros que se le pasen.
 * 
 * Autor: Darvin Mendez
 */
public class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;

    // Constructor básico: solo se define la placa
    public Vehiculo(String placa) {
        this.placa = placa;
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Constructor completo: todos los atributos
    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor por defecto: valores generales
    public Vehiculo() {
        this.placa = "XXX000";
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
    }

    // Calcula mantenimiento solo con km recorridos
    public double calcularMantenimiento(int km) {
        return km * 0.5;
    }

    // Calcula mantenimiento según km y tipo de servicio
    public double calcularMantenimiento(int km, String tipoServicio) {
        double costo = km * 0.5;
        if(tipoServicio.equalsIgnoreCase("completo")) {
            costo += 100;
        } else if(tipoServicio.equalsIgnoreCase("basico")) {
            costo += 50;
        }
        return costo;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

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
}