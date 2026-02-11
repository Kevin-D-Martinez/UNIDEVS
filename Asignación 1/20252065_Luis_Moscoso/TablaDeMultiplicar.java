/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TablaDeMultiplicar {

   public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
       
        System.out.println("=== TABLA DE MULTIPLICACION JAVA");
        System.out.println("Introducir el numero de la tabla a multiplicar: ");
        num = sc.nextInt();
        System.out.println("=== Tabla del " + num + " ===");
        
        for (int i = 1; i <= 10; i++){
                int resultado = i * num;
                System.out.println(num + " x " + i + " = " + resultado);
        }
        
    }
}
