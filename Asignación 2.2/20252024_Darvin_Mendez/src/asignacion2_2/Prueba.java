/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion2_2;
import java.util.Scanner;
/**
 *
 * @author Darvin Mendez
 */
public class Prueba {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        
        
        System.out.print("Ingresa el primer numero: ");
        int a = sc.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        int b = sc.nextInt();
        
        System.out.print("Ingresa el tercer numero: ");
        int c = sc.nextInt();
        
        System.out.print("Ingresa el cuarto numero: ");
        int d = sc.nextInt();
        
        //Operaciones con 2 parametros
        System.out.println("======== Operaciones con 2 parametros ========");
        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
        System.out.println("Multiplicacion: " + calc.multiplicar(a, b));
        System.out.println("Division: " + calc.dividir(a, b));
        
        //Operaciones con 3 parametros
        System.out.println("======== Operaciones con 3 parametros ========");
        System.out.println("Suma: " + calc.sumar(a, b, c));
        System.out.println("Resta: " + calc.restar(a, b, c));
        System.out.println("Multiplicacion: " + calc.multiplicar(a, b, c));
        
        //Operaciones con 4 parametros
        System.out.println("======== Operaciones con 4 parametros ========");
        System.out.println("Suma: " + calc.sumar(a, b, c, d));
        System.out.println("Resta: " + calc.restar(a, b, c, d));
        System.out.println("Multiplicacion: " + calc.multiplicar(a, b, c, d));
        sc.close();
        
    }
    
}
