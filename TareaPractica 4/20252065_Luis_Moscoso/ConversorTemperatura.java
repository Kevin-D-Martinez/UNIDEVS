/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis
 */
/**
 * Clase encargada de las conversiones de temperatura Celsius y Fahrenheit.
 */
public class ConversorTemperatura {

    public double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
