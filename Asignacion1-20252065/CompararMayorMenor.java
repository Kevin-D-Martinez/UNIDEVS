/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararmayormenor;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CompararMayorMenor {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
            
        System.out.println("Comparar Dos Numeros (Mayor y Menor)");
        
        System.out.println("Dame el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        num2 = sc.nextInt();
    
        if(num1 > num2){
            
            System.out.println("El numero " + num1 +" Es el mayor");
            
        }else if (num2 > num1){
        
            System.out.println("El numero " + num2 +" Es el mayor");
        
        }else{
             
             System.out.println("Los numeros son iguales, por lo tanto no se pueden comparar :)");
                
             }
   
    }
}
