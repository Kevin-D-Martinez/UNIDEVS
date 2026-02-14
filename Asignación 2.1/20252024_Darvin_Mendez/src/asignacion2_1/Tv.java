/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion2_1;
/**
 * Clase Tv
 * Representa un televisor con atributos basicos y metodos para controlarlo
 * Permite encender, apagar y controlar el volumen
 * 
 * @author Darvin Mendez
 */
public class Tv {
    
    // Atributos del televisor
    String marca;      // Marca del televisor
    int pulgadas;      // Tamaño de la pantalla en pulgadas
    boolean encendido; // Estado de la TV: encendida o apagada
    int volumen;       // Nivel de volumen actual
    
// Métodos del televisor
    
// Enciende la TV y muestra un mensaje
public void encender(){
     encendido = true;
    System.out.println("La TV se esta encendiendo...");
}

// Apaga la TV y muestra un mensaje
public void apagar(){
    encendido = false; 
    System.out.println("La TV se esta apagando...");
}

// Incrementa el volumen de la TV y muestra un mensaje
public void subirVolumen(){
    volumen++;
    System.out.println("Subiendo el volumen de la TV...");
}

// Disminuye el volumen de la TV y muestra un mensaje
public void bajarVolumen(){
    volumen--;
    System.out.println("Bajando el volumen de la TV...");
}
}




