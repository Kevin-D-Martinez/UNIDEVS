/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tv.java;

/**
 *
 * @author Luis
 */

public class Tv {

    // Atributos
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println("La TV se esta encendiendo...");
    }

    public void apagar() {
        encendido = false;
        System.out.println("La TV se esta apagando...");
    }

    public void subirVolumen() {
        volumen++;
        System.out.println("Subiendo el volumen...");
    }

    public void bajarVolumen() {
        volumen--;
        System.out.println("Bajando el volumen...");
    }
    

public class Prueba {

    public static void main(String[] args) {

        // Crear 3 TVs
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        // ===== TV 1 =====
        tv1.marca = "Samsung";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        System.out.println("=== TV 1 ===");
        System.out.println("Marca: " + tv1.marca);
        System.out.println("Pulgadas: " + tv1.pulgadas);
        System.out.println("Volumen: " + tv1.volumen);

        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();

        // ===== TV 2 =====
        tv2.marca = "LG";
        tv2.pulgadas = 43;
        tv2.volumen = 15;

        System.out.println("\n=== TV 2 ===");
        System.out.println("Marca: " + tv2.marca);
        System.out.println("Pulgadas: " + tv2.pulgadas);
        System.out.println("Volumen: " + tv2.volumen);

        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();

        // ===== TV 3 =====
        tv3.marca = "Sony";
        tv3.pulgadas = 65;
        tv3.volumen = 25;

        System.out.println("\n=== TV 3 ===");
        System.out.println("Marca: " + tv3.marca);
        System.out.println("Pulgadas: " + tv3.pulgadas);
        System.out.println("Volumen: " + tv3.volumen);

        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}

}

