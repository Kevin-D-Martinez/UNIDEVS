package ejercicio2;
import java.util.*;

//  Realizar un programa que incluya las 4 operaciones matemáticas básicas (Suma, Resta, Multiplicación y División).

class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el numero 'a': ");
        double a = sc.nextDouble();
    
        System.out.print("Ingrese la operacion a ejecutar (+, -, *, /): ");
        String operacion = sc.next();
        
        System.out.print("Ingrese el numero 'b': ");
        double b = sc.nextDouble();
        
        switch(operacion) {
            case "+" -> { 
                double suma = Suma(a,b);
                System.out.println("La suma de los numeros es: "+suma);
            }
            case "-" -> { 
                double resta = Resta(a,b);
                System.out.println("La resta de los numeros es: "+resta);
            }
            case "*" -> { 
                double multiplicacion = Multiplicacion(a,b);
                System.out.println("La multiplicación de los numeros es: "+multiplicacion);
            }
            case "/" -> { 
                double division = Division(a,b);
                System.out.println("La división de los numeros es: "+division);
            }
            default -> System.out.println("Operación fuera de lo permitido");
        }
    }
    
    static double Suma(double a, double b){
        return a + b;
    }
    
    static double Resta(double a, double b){
        return a - b;
    }
    
    static double Multiplicacion(double a, double b){
        return a * b;
    }
    
    static double Division(double a, double b){
        return a / b;
    }
    
}
