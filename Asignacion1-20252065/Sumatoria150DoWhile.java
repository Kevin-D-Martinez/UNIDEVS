/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumatoria1.pkg50dowhile;

/**
 *
 * @author Lenovo
 */
public class Sumatoria150DoWhile {

     public static void main(String [] args){
        int num = 50;
        int contador = 1;
        int suma = 0;
        
        do{
             suma += contador;
             contador++;
            
        }while(contador <= num);
        
                
      System.out.println("El resultado de la suma de los numeros del 1-50 es: "+ suma);
    }
}
