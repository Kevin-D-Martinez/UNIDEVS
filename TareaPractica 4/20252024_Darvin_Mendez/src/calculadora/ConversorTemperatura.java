/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 * Clase que permite convertir temperaturas entre Celsius y Fahrenheit.
 *
 * @author Dalvi
 */
public class ConversorTemperatura {

    /**
     * Convierte de Fahrenheit a Celsius.
     *
     * @param f temperatura en Fahrenheit
     * @return temperatura en Celsius
     */
    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    /**
     * Convierte de Celsius a Fahrenheit.
     *
     * @param c temperatura en Celsius
     * @return temperatura en Fahrenheit
     */
    public double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
