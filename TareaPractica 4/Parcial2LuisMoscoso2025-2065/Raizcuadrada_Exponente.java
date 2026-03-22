/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis
 */
/**
 * Clase para operaciones matematicas avanzadas.
 */
public class Raizcuadrada_Exponente {

    public double calcularRaiz(double a) throws Exception {
        if (a < 0) {
            throw new Exception("Error: No existe raiz de numeros negativos.");
        }
        return Math.sqrt(a);
    }

    public double calcularExponente(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}