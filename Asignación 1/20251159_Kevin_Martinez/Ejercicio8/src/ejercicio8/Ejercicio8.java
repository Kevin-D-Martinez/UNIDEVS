package ejercicio8;
import java.util.Scanner;

// Realizar un programa que ingresado un numero, me indique si es par o impar.

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }
    
}
