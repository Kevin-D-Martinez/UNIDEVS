package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        // Programa que dice si un número es par o impar
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero que desea evaluar: ");
        int numero = sc.nextInt();
        
        if (numero % 2  == 0)
            System.out.println(numero +" es un numero par.");
        else
            System.out.println(numero +" es un numero impar.");
    
    
}
