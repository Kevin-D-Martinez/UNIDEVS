/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerparcial;

import java.util.Scanner;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class PrimerParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializa la clase scanner para el ingreso de datos
        Scanner sc = new Scanner(System.in);

        //Variables a utilizar
        double a = 0;
        double b = 0;
        byte menu;
        CalculadoraMatematica calc = new CalculadoraMatematica();

        System.out.println("===== CALCULADORA MATEMÁTICA =====");
        System.out.println("[1]: Ingresar números");
        System.out.println("[2]: Sumar");
        System.out.println("[3]: Restar");
        System.out.println("[4]: Multiplicar");
        System.out.println("[5]: Dividir");
        System.out.println("[0]: Salir");
        System.out.println("==================================");

        //Menú de opciones
        do {

            System.out.print("Seleccione una opción: ");
            menu = sc.nextByte();

            switch (menu) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    a = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    b = sc.nextDouble();

                    calc.registrarNumeros(a, b);
                    System.out.println("Números registrados correctamente.\n");
                    break;
                case 2:
                    System.out.println("El resultado de la suma es igual a " + calc.sumar() + "\n");
                    break;
                case 3:
                    System.out.println("El resultado de la resta es igual a " + calc.restar() + "\n");
                    break;
                case 4:
                    System.out.println("El resultado de la multiplicación es igual a " + calc.multiplicar() + "\n");
                    break;
                case 5:
                    System.out.println("El resultado de la división es igual a " + calc.dividir() + "\n");
                    break;
                case 0:
                    System.out.println("Bye bye!\n");
                    System.exit(0);
                default:
                    System.out.println("Elige una opcion valida.\n");
                    break;
            }
        } while (menu != 0);
    }

}
