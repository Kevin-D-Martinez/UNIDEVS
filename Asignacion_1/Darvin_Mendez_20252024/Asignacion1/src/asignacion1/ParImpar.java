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
public class ParImpar {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("= Aca puedes evaluar si un numero es par o impar ="); 
       System.out.println("Ingresa un numero: "); 
       int num  = sc.nextInt();
       
       if(num % 2 == 0){
           System.out.println(num + " es un numero par");
       }
       else{
           System.out.println(num + " es un numero impar");
       }
    }
    
}  
    

