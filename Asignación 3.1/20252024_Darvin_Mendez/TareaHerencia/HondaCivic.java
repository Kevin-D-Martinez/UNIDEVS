package TareaHerencia;


import TareaHerencia.AutoMovil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Clase HondaCivic
 * Hereda de AutoMovil.
 * Sobrescribe algunos métodos para cambiar su comportamiento.
 * 
 * @author Dalvi
 */
public class HondaCivic extends AutoMovil {

    
    /**
    * Constructor de la clase HondaCivic
    */
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }
    
    
    /**
    * Método sobrescrito para encender el vehículo
    */
    @Override
    public void encender() {
        System.out.println("El Honda Civic esta encendiendo con arranque deportivo...");
    }

    
    /**
    * Método sobrescrito para acelerar el vehículo
    */
    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rapidamente...");
    }
}