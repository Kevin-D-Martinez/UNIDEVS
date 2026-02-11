package ejercicio1;
import java.util.Scanner;

//Realizar un programa que imprima por pantalla su nombre y correo electrónico.

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese su correo electrónico: ");
        String correo = sc.nextLine();
        
        System.out.println("Hola "+nombre+". Su correo electrónico es:"+correo);
    }
}

