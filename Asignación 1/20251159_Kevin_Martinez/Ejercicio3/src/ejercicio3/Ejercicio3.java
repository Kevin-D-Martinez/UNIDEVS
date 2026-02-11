package ejercicio3;

// Realizar un programa que imprima los números impares del 1 al 100 utilizando ciclos for.

public class Ejercicio3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i ++){
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
