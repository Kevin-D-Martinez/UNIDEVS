/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class CalculadoraMatematica {

    
    // ==============================
    // Atributos privados
    // ==============================
    
    // Primer número ingresado por el usuario
   private double numero1;
   
   
    // Segundo número ingresado por el usuario
   private double numero2;
   
   
    // ==============================
    // Constructor por defecto
    // ==============================

       /**
     * Constructor por defecto.
     * Inicializa los números en 0.
     */
   public CalculadoraMatematica(){
       this.numero1 = 0;
       this.numero2 = 0;
   }
   
   // Metodo main (menu)
    public static void main(String[] args) {
         // Crear objeto Scanner para leer desde consola
        Scanner sc = new Scanner(System.in);
        
        
        CalculadoraMatematica calc = new CalculadoraMatematica();
        int num;
    
        // Bucle que mantiene activo el menú hasta que el usuario elija 0
        do{
            System.out.println("\n===== CALCULADORA MATEMATICA =====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");
            num = sc.nextInt();
                
             // Estructura switch para manejar cada opción
            switch  (num){
                case 1:
                    calc.ingresarNumeros(sc);
                    break;
                 
                case 2:
                    System.out.println("Resultado: " + calc.calcularSuma());
                    break;

                case 3:
                    System.out.println("Resultado: " + calc.calcularResta());
                    break;

                case 4:
                    System.out.println("Resultado: " + calc.calcularMultiplicacion());
                    break;

                case 5:
                    System.out.println("Resultado: " + calc.calcularDivision());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("❌ Opción inválida.");
            
            }
            
        } while(num != 0);
        
        
          sc.close();       
            
        }
    
    
     // ==============================
    // Método para ingresar números
    // ==============================

    /**
     * Permite al usuario ingresar los dos números que se usarán
     * para realizar las operaciones matemáticas.
     * 
     * @param sc Objeto Scanner utilizado para capturar datos desde consola
     */
 
public void ingresarNumeros(Scanner sc){
    System.out.print("Ingrese el primer : ");
    numero1 = sc.nextDouble();
    
    System.out.print("Ingrese el segundo numero: ");
    numero2 = sc.nextDouble();
}

   //Métodos matemáticos
    public double calcularSuma() {
        return numero1 + numero2; //Metodo para la suma, toma dos valores y retorna suma.
    }

    public double calcularResta() {
        return numero1 - numero2; // Metodo para la rest, toma dos valores y retorna una resta.
    }

    public double calcularMultiplicacion() {
        return numero1 * numero2; // Metodo para la multiplicacion, toma dos valores y retorna una multiplicacion.
    }

    public double calcularDivision() {
        if (numero2 == 0) {  // Metodo apra la division, toma dos valores y si la condicion es verdadera lanza un mensaje de error y retorna 0 y si no retorna una division.
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return numero1 / numero2;
    }

}

    

    



 