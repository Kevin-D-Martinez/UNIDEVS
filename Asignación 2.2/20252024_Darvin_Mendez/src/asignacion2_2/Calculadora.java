/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion2_2;
/**
 * Clase Calculadora
 * Contiene metodos para realizar operaciones basicas: suma, resta, multiplicacion y division
 * Soporta sobrecarga de metodos para 2, 3 o 4 parámetros (excepto división)
 * 
 * @author Darvin Mendez
 */
public class Calculadora {
    
    // Metodos con 2 parametros
    // Suma dos números
    public int sumar(int a, int b){
    return a + b;
    }
    
    // Resta dos numeros
    public int restar(int a, int b){
    return a - b;
    }
     
    // Multiplica dos numeros
    public int multiplicar (int a, int b){
    return a * b;
    }
    
     // Divide dos numeros
    public int dividir(int a, int b){
    return a / b;
    }
    
    // Metodos con 3 parametros
    // Suma tres numeros
    public int sumar(int a, int b, int c){
    return a + b + c;
    }
    
    // Resta tres numeros
    public int restar(int a, int b, int c){
    return a - b - c;
    }
 
    // Multiplica tres numeros
    public int multiplicar (int a, int b, int c){
    return a * b * c;
    }
    
    // Metodos con 4 parametros
    // Suma cuatro numeros
    public int sumar(int a, int b, int c, int d){
    return a + b + c + d;
    }
    
    // Resta cuatro numeros
    public int restar(int a, int b, int c, int d){
    return a - b - c - d;
    }
     
    // Multiplica cuatro numeros
    public int multiplicar (int a, int b, int c, int d){
    return a * b * c * d;
    }
    
}
