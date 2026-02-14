/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapractica1;
/**
 * Clase Cliente
 * Representa un cliente con nombre, teléfono y su plan
 * Autor: Darvin Mendez
 */
public class Cliente {

    private String nombre;
    private String telefono;
    private Plan planContratado;

    // Constructor completo
    public Cliente(String nombre, String telefono, Plan planContratado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.planContratado = planContratado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Plan getPlanContratado() {
        return planContratado;
    }

    public void setPlanContratado(Plan planContratado) {
        this.planContratado = planContratado;
    }
}