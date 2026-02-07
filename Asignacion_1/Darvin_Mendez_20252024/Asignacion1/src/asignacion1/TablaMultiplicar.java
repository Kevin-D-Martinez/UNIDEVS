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
public class TablaMultiplicar {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingresa un numero para proporcionarte su tabla de multiplicacion: ");
         int tabla = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
         
        
    }
    
}  

