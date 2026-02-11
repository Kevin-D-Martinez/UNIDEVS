package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        // Programa que dice cual número es mayor entre dos números
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " es mayor que " + num1);
        else
            System.out.println("Ambos números son iguales");
    }
    
}
