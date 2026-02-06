/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinarparimpar;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class DeterminarParImpar {

   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Bienvenido al programa para identificar si un numero es par o impar :)");
        
        System.out.println("Dame el numero que te gustaria verificar: ");
        num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El numero " + num +" es Par" );
        }else{
            System.out.println("El numero " + num +" es Impar" );
        }
        
    }
    
}
