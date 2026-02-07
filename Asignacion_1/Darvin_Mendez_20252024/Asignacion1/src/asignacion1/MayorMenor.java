/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1;

import java.util.Scanner;
/**
 *
 * @author Dalvi
 */
public class MayorMenor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("= Aca puedes evaluar cual es el mayor y menos de dos numeros =");
        System.out.println("Ingresa el primer numero: ");        
        int num1  = sc.nextInt();
        System.out.println("Ingresa el segundo numero: "); 
        int num2 = sc.nextInt();
       
        if (num1 > num2)
        {
            System.out.println(num1 + " es el mayor y " + num2 + " es el menor");
        }
        else if (num2 > num1) 
        {
            System.out.println(num2 + " es el mayor y " + num1 + " es el menor");
        }
        else
        {
            System.out.println("Ambos números son iguales");
        }
            
             
    }
    
}  
   