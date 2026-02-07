package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Zoila
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        // Calculadora
        
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        short menu = 0;
        
        while (menu != 6)
        {
            System.out.println("-----Calculadora de Zoila-----");
            System.out.println("[1]: Ingresar valores");
            System.out.println("[2]: Sumar");
            System.out.println("[3]: Restar");
            System.out.println("[4]: Multiplicar");
            System.out.println("[5]: Dividir");
            System.out.println("[6]: Salir");
            
            menu = sc.nextShort();
            
            switch (menu) {
                case 1:
                    System.out.print("Ingrese el primer valor: ");
                    a = sc.nextInt();
                    System.out.print("Ingrese el segundo valor: ");
                    b = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Suma = " + suma(a,b));
                    break;
                case 3:
                    System.out.println("Resta = " + resta(a,b));
                    break;
                case 4:
                    System.out.println("Multiplicacion = " + mult(a,b));
                    break;
                case 5:
                    System.out.println("Division = " + division(a,b));
                    break;
                case 6:
                    System.out.println("Bye bye!");
                    System.exit(0);
                default:
                    System.out.println("Elige una opcion valida.");
                    break;
            }
        }
    }
    
    public static float suma(int num1, int num2) {
        return num1+num2;
    }
    
     public static float resta(int num1, int num2) {
        return num1-num2;
    }
 
    public static float mult(int num1, int num2) {
        return num1*num2;
    }
    
        public static float division(float num1, int num2) {
        if (num2 == 0 || num1 == 0)
        {
            return 0;
        }
        else
        {
            return num1/num2;
        }
    }
}
