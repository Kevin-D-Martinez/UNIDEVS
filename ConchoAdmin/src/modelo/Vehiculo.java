/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase Vehiculo.
 * Representa la entidad Vehiculo dentro del sistema.
 * @author Darvin Mendez
 */
public class Vehiculo {
    
    private int id;
    private String marca;
    private String modelo;
    private String año;
    private String matricula;
    private int idChofer;
    private int idRuta;
    private int idUsuario;

    /**
     * Constructor vacio.
     */
    public Vehiculo() {}

    /**
     * Constructor con parametros.
     * @param marca
     * @param modelo
     * @param año
     * @param matricula
     * @param idChofer
     * @param idRuta
     * @param idUsuario
     */
    public Vehiculo(String marca, String modelo, String año, String matricula, int idChofer, int idRuta, int idUsuario) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.matricula = matricula;
        this.idChofer = idChofer;
        this.idRuta = idRuta;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}