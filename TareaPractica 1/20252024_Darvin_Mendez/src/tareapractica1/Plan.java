/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase Plan
 * Representa un plan telefónico con minutos, datos y precio mensual
 * Autor: Darvin Mendez
 */

public class Plan {

    private int minutosIncluidos;
    private double datosGB;
    private double precioMensual;

    // Constructor completo
    public Plan(int minutosIncluidos, double datosGB, double precioMensual) {
        this.minutosIncluidos = minutosIncluidos;
        this.datosGB = datosGB;
        this.precioMensual = precioMensual;
    }

    // Getters y Setters
    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public void setMinutosIncluidos(int minutosIncluidos) {
        this.minutosIncluidos = minutosIncluidos;
    }

    public double getDatosGB() {
        return datosGB;
    }

    public void setDatosGB(double datosGB) {
        this.datosGB = datosGB;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }
}