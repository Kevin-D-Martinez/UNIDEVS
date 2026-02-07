/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion1;

import java.util.Scanner;

/**
 *
 * @author Dalvi
 */
public class OperacionesMatematicasBasicas {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        var a = 0;
        var b = 0;

        while(menu != 6){
            System.out.println("=== CALCULADORA JAVA ===");
            System.out.println("1. Asignar valores para a y b");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Salir");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Ingresar el valor de [a]: ");
                    a = sc.nextInt();
                    System.out.println("Ingresar el valor de [b]: ");
                    b = sc.nextInt();
                    break; 
                    
                case 2:
                    System.out.println("El resultado de la suma es " + suma(a, b));
                    break;
                    
                case 3:
                    System.out.println("El resultado de la resta es " + resta(a, b));
                    break;
                    
                case 4:
                    System.out.println("El resultado de la multiplicacion es " + multiplicacion(a, b));
                    break;
                
                case 5:
                    System.out.println("El resultado de la division es " + division(a, b));
                    break;
                
                case 6:
                    System.out.println("Saliendo del programa..."); 
                    break;
                    
                default:
                    System.out.println("Ingrese un numero valido");
            }
        }
    }

    // Metodos de la calculadora
    public static double suma(int a, int b){
        return (double)a + b;
    }

    public static double resta(int a, int b){
        return (double)a - b;
    }

    public static double multiplicacion(int a, int b){
        return (double)a * b;
    }

    public static double division(int a, int b){
        if (b != 0){
            return (double)a / b;
        } else {
            System.out.println("Error: No se puede dividir entre cero");
            return 0;
        }
    }
}