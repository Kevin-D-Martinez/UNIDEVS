/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion2_1;
/**
 * Clase Prueba
 * Demuestra la creacion y manipulacion de objetos Tv
 * Se crean 3 televisores con distintos atributos y se prueban sus metodos
 * 
 * @author Darvin Mendez
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creacion y configuracion de la TV 1
        Tv tv1 = new Tv();
        tv1.marca = "TCL";
        tv1.pulgadas = 32;
        tv1.volumen = 50;
        
        System.out.println("===== TV 1 =====");
          System.out.println("Marca: " + tv1.marca);
            System.out.println("Pulgadas: " + tv1.pulgadas);
              System.out.println("Volumen: " + tv1.volumen);
               
              
              // Prueba de metodos de la TV 1
              tv1.encender();
              System.out.println("Estado: " + (tv1.encendido ? "Encendida" : "Apagada"));
              tv1.subirVolumen();
              tv1.bajarVolumen();
              tv1.apagar();
              System.out.println("Estado: " + (tv1.encendido ? "Encendida" : "Apagada"));
              
        
        // Creacion y configuracion de la TV 2
        Tv tv2 = new Tv();
        tv2.marca = "Tecnomaster";
        tv2.pulgadas = 40;
        tv2.volumen = 75;
        
        System.out.println("===== TV 2 =====");
          System.out.println("Marca: " + tv2.marca);
            System.out.println("Pulgadas: " + tv2.pulgadas);
              System.out.println("Volumen: " + tv2.volumen);
               
              
              // Prueba de metodos de la TV 2
              tv2.encender();
              System.out.println("Estado: " + (tv2.encendido ? "Encendida" : "Apagada"));
              tv2.subirVolumen();
              tv2.bajarVolumen();
              tv2.apagar();
              System.out.println("Estado: " + (tv2.encendido ? "Encendida" : "Apagada"));
        
        
        // Creacion y configuracion de la TV 3
        Tv tv3 = new Tv();
        tv3.marca = "Hisense";
        tv3.pulgadas = 65;
        tv3.volumen = 35;
        
        System.out.println("===== TV 3 =====");
          System.out.println("Marca: " + tv3.marca);
            System.out.println("Pulgadas: " + tv3.pulgadas);
              System.out.println("Volumen: " + tv3.volumen);
               
              // Prueba de metodos de la TV 3
              tv3.encender();
              System.out.println("Estado: " + (tv3.encendido ? "Encendida" : "Apagada"));
              tv3.subirVolumen();
              tv3.bajarVolumen();
              tv3.apagar();   
              System.out.println("Estado: " + (tv3.encendido ? "Encendida" : "Apagada"));
        
    }
    
}
