/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Luis
 */
/**
 * Clase Calculadora
 * Realiza operaciones matemáticas básicas utilizando
 * sobrecarga de métodos.
 *
 */

public class Calculadora {

    // =========================
    // MÉTODOS CON 2 PARÁMETROS
    // =========================

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    // =========================
    // SOBRECARGA CON 3 PARÁMETROS
    // =========================

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    // =========================
    // SOBRECARGA CON 4 PARÁMETROS
    // =========================

    public int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int restar(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public int multiplicar(int a, int b, int c, int d) {
        return a * b * c * d;
    }
    
    
    /**
 * Clase principal para probar la Calculadora
 */
public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // ===== PRUEBAS CON 2 PARÁMETROS =====
        System.out.println("Suma (2 params): " + calc.sumar(5, 3));
        System.out.println("Resta (2 params): " + calc.restar(10, 4));
        System.out.println("MultiplicaciOn (2 params): " + calc.multiplicar(6, 7));
        System.out.println("DivisiOn (2 params): " + calc.dividir(20, 4));

        // ===== PRUEBAS CON 3 PARÁMETROS =====
        System.out.println("Suma (3 params): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 params): " + calc.restar(10, 4, 2));
        System.out.println("MultiplicaciOn (3 params): " + calc.multiplicar(2, 3, 4));

        // ===== PRUEBAS CON 4 PARÁMETROS =====
        System.out.println("Suma (4 params): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 params): " + calc.restar(20, 5, 3, 2));
        System.out.println("MultiplicaciOn (4 params): " + calc.multiplicar(2, 2, 2, 2));
    }
}
}



