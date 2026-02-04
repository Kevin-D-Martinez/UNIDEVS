package ejercicio7;
import java.util.Scanner;

// Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa el número a: ");
        int a = sc.nextInt();
        
        System.out.print("Ingresa el número b: ");
        int b = sc.nextInt();
        
        if(a > b){
            System.out.println("El número "+a+" es el mayor.");
        }
        else if(a < b){
            System.out.println("El número "+b+" es el mayor.");
        }
        else {
            System.out.println("Los números son iguales.");
        }
    }
}
