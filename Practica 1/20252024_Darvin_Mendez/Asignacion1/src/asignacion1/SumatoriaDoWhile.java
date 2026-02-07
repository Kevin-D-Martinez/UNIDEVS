/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1;

/**
 *
 * @author Dalvi
 */
public class SumatoriaDoWhile {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;
        
        do{
            suma += i;
            i++;
        
        
        }while(i <= 50);
        
         System.out.println("La sumatoria de los numeros del 1 al 50 es: "+ suma);

    }
    
}  

