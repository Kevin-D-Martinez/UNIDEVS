package ejercicio6;
import java.util.Scanner;

// Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el numero que desee ver su tabla de multiplicación: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(i+" x "+num+" = "+ (i*num));
        }
    }   
}
