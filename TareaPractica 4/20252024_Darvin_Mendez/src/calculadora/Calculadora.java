/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * Clase que contiene las operaciones básicas de una calculadora. Permite sumar,
 * restar, multiplicar y dividir dos valores.
 *
 * @author Dalvi
 */
public class Calculadora {

    /**
     * Suma dos valores numéricos.
     *
     * @param valor1 primer número
     * @param valor2 segundo número
     * @return resultado de la suma
     */
    public double sumar(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    /**
     * Resta dos valores numéricos.
     *
     * @param valor1 primer número
     * @param valor2 segundo número
     * @return resultado de la resta
     */
    public double restar(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    /**
     * Resta dos valores numéricos.
     *
     * @param valor1 primer número
     * @param valor2 segundo número
     * @return resultado de la resta
     */
    public double multiplicar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    /**
     * Divide dos valores.
     *
     * @param valor1 dividendo
     * @param valor2 divisor
     * @return resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(Double valor1, Double valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return valor1 / valor2;
    }
}
