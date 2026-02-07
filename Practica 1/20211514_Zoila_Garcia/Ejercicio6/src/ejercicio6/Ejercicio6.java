package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        // Programa que despliega la tabla de multiplicar de un número
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero del que quiere ver la tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        for (int x = 1; x <= 12; x++)
        {
            System.out.println(numero + " x " + x + "= " + numero*x);
        }
    }
    
}
