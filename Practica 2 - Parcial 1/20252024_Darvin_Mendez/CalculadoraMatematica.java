/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.Scanner;
/**
 * Clase que representa una calculadora matematica basica.
 * Implementa operaciones fundamentales siguiendo los principios de POO.
 * @author Dalvi
 */
public class CalculadoraMatematica {
    // Atributos Privados
    private double numero1;
    private double numero2;
    
/**
* Constructor por defecto que inicializa los atributos en cero.
*/
public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica miCalculadora = new CalculadoraMatematica();
        int opcionMenu;
        
        // Bucle do-while para mantener el menu activo
        do{
            System.out.println("===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.println("Seleccione una opcion: ");
            opcionMenu = sc.nextInt();
            
            // Estructura switch para manejar las opciones
            switch(opcionMenu){
                case 1: miCalculadora.ingresarNumeros(sc);
                    break;
                case 2: System.out.println("El resultado de la suma es: " + miCalculadora.sumarNumeros()); 
                    break;
                case 3: System.out.println("El resultado de la resta es: " + miCalculadora.restarNumeros());
                    break;
                case 4: System.out.println("El resultado de la multiplicacion es: " + miCalculadora.multiplicarNumeros());
                    break;
                case 5: System.out.println("El resultado de la division es: " + miCalculadora.dividirNumeros());
                    break;
                case 0: System.out.println("Saliendo del programa...");
                    break;
                default: 
                    System.out.println("Opcion no valida");
             
            }
        } while (opcionMenu != 0);
    }
  
    /**
     * Metodo unico para establecer los valores de numero1 y numero2.
     * @param sc Objeto Scanner para capturar datos por consola.
     */
   public void ingresarNumeros(Scanner sc) {
    try {
        System.out.print("Ingrese el primer numero: ");
        this.numero1 = sc.nextDouble(); 
        
        System.out.print("Ingrese el segundo numero: ");
        this.numero2 = sc.nextDouble(); 
        
        System.out.println("Numeros ingresados correctamente");
    } catch (Exception e) {
        System.out.println("Error: Debes ingresar un valor numerico valido");
        sc.next(); 
    }
    }
   
   /**
     * Calcula la suma de los dos numeros almacenados.
     * @return El resultado de la suma de numero1 y numero2.
     */
   public double sumarNumeros(){
   
        return this.numero1 + this.numero2;
   
   }
   
   /**
     * Calcula la resta de los dos numeros almacenados.
     * @return El resultado de la resta de numero1 y numero2.
     */
   public double restarNumeros(){
   return this.numero1 - this.numero2;
  
   }
        
   /**
     * Calcula la multiplicacion de los dos numeros almacenados.
     * @return El resultado del producto de numero1 y numero2.
     */
   public double multiplicarNumeros(){
   return this.numero1 * this.numero2;
   
   }
   
   /**
     * Calcula la division de los dos numeros almacenados.
     * Valida que el divisor no sea cero mediante un condicional IF.
     * @return El cociente resultante o 0 si el divisor es cero.
     */
   public double dividirNumeros(){
       if(this.numero2 != 0) {
          return this.numero1 / this.numero2;
       } else {
           System.out.println("Error: No se puede dividir entre cero");
           return 0;
       }
   
   }
   
}

    
    
    

