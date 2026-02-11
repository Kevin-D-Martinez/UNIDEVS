/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerparcial;

/**
 *
 * @author LaChichi
 */
public class CalculadoraMatematica {

    //Atributos
    private double numero1;
    private double numero2;

    /**
     * Constructor sin argumentos.
     * 
     * Establece el valor por defecto 0 a ambas variables.
     */
    CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;    
    }
    
    /**
     * Almacena los números a calcular
     * 
     * @param a primer número (double) a utilizar
     * @param b segundo número (double) a utilizar
     */
    public void registrarNumeros(double a, double b) {
        this.numero1 = a;
        this.numero2 = b;    
    }
    
    /**
     * Calcula la suma de dos números
     *
     * @return resultado de la suma
     */
    public double sumar() {
        return numero1 + numero2;
    }
    
    /**
     * Calcula la resta de dos números
     *
     * @return resultado de la resta
     */
    public double restar() {
        return numero1 - numero2;
    }
    
    /**
     * Calcula la multiplicación de dos números
     *
     * @return resultado de la multiplicación
     */
    public double multiplicar() {
        return numero1 * numero2;
    }
    
    /**
     * Calcula la división del primer número entre el segundo número, siempre y cuando ninguno de los dos sea 0.
     *
     * @return resultado de la división o 0 si alguno de los números fue igual a 0.
     */
    public double dividir() {
        //Revisa si uno de los dos números es 0, en caso de que sí retorna 0, en caso contrario realzia la división.
        if (numero2 == 0 || numero1 == 0)
        {
            System.out.println("La división no acepta ceros, inténtelo de nuevo con otros números.");
            return 0;
        }
        else
        {
            return numero1/numero2;
        }
    }
}
