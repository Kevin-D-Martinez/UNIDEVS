/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author ZoeyTato [Zoila García 2021-1514]
 */
class Televisor {
    
    String marca;
    String modelo;
    boolean encendido = false;
    byte volumen = 50;
    
    Televisor() {
        this.marca = "n/a";
        this.modelo = "n/a";
    }
    
    Televisor(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    String encender() {
        if (this.encendido == true)
            return "La television ya esta encendida.";
        else {
            this.encendido = true;
            return "Encendiendo...";
        }
    }
    
    String apagar() {
        if (this.encendido == false)
            return "La television ya esta apagada.";
        else {
            this.encendido = false;
            return "Apagando...";
        }
    }
    
    String subirVolumen() {
        if (encendido == false)
            return "Debe encender el televisor para subir el volumen.";
        
        if (volumen >= 100)
            return "Volumen al máximo.";
        else {
            this.volumen += 5;
            return "Volumen: " + volumen;
        }
    }
    
    String bajarVolumen() {
        if (encendido == false)
            return "Debe encender el televisor para bajar el volumen.";
        
        if (volumen <= 0)
            return "Volumen al mínimo.";
        else {
            this.volumen -= 5;
            return "Volumen: " + volumen;
        }
    }
    
    String obtenerInformacion() {
        return marca + " " + modelo;
    }
    
    String obtenerStatus() {
        if (encendido == true)
            return "Status: Televisor encendido - Volumen: " + volumen;
        else
            return "Status: Televisor apagado.";
    }
    
    
}
