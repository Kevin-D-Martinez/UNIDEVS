package ejercicio5;

// Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos do while.

public class Ejercicio5 {
    public static void main(String[] args) {
        int suma = 0;
        int num = 1;
        
        do{
            suma += num;
            num ++;
        }while(num <= 50);
        
        System.out.println("La sumatoria de los numero del 1 al 50 es: "+suma);
    }
}
