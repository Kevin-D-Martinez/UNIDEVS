/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.DTO;

/**
 * DTO Pago
 * @author Luis Alberto Moscoso Rivera 2025-2065
 */
public class Pago {
    
    // Declaracion de atributos en el apartado de Pagos
    
    private int id;
    private double monto;
    private String metodoPago;
    private String estadoPago;
    private int id_chofer;
    private int id_ruta;
    private int id_usuario;
    private String fechaCreacion; 
    
    // Creacion del constructor;
    public Pago(){
    }
    
     /**
     * Constructor que asigna los valores de un Pago
     * @param id
     * @param monto
     * @param metodoPago
     * @param estadoPago
     * @param id_chofer
     * @param id_ruta
     * @param id_usuario
     * @param fechaCreacion
     * @return 
     */
     
    
    // Getters
    public int getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public int getId_chofer() {
        return id_chofer;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
    
    
    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setId_chofer(int id_chofer) {
        this.id_chofer = id_chofer;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
    
