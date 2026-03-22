/*
 */
package tareapractica4;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Calculadora {
    
    public double sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    public double restar(double valor1, double valor2) {
        return valor1 - valor2;
    }
    
    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }
    
    public double dividir(double valor1, double valor2) {
        if (valor2 == 0 || valor1 == 0)
        {
            return 0;
        }
        else
        {
            return valor1/valor2;
        }
    }
    
    public double exponenciar(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
    
    public double raizCuadrada(double valor1) {
        return Math.sqrt(valor1);
    }
    
    public double convertirCelsius(double farenheit) {
        return  (farenheit - 32) * 5/9;
    }
    
    public double convertirFarenheit(double celsius) {
        return  (celsius * 9/5) + 32;
    }
}
