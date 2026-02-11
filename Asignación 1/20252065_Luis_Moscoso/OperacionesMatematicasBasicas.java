/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesmatematicasbasicas;

import java.util.Scanner;


/**
 *
 * @author Lenovo
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
                System.out.println("El resultado de la division es " + division(a, b));
                break;
                
            default:
               System.out.println("Ingrese un numero valido");
             
        }
               
      }
        
    }





// Metodos de la calculadora
public static float suma(int a, int b){

        return a+b;
}

public static float resta(int a, int b){
    
        return a-b;
}

public static float multiplicacion(int a, int b){

        return a*b;
}

public static float division(float a, int b){
      
       if (a != 0){
       return  a/ b; 
       }else {
           return 0;
       }
}

}
    

