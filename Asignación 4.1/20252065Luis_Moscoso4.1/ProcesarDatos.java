/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesardatos;

/**
 *
 * @author Luis
 */
public class ProcesarDatos {

    /**
     * @param args the command line arguments
     */
   
   // Atributos privados
    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;
    
    // Metodo para capturar los datos desde la GUI
    public void capturarDatos(String mat, String nom, String ape, String cuat){
        this.matricula = mat;
        this.nombres = nom;
        this.apellidos = ape;
        this.cuatrimestre = cuat;
    }
    
    // Metodo para presentar los datos en un formato legible
    public String presentarDatos(){
        return "--- Datos del Participante ---\n" +
               "Matricula: " + matricula + "\n" +
               "Nombres: " + nombres + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Cuatrimestre: " + cuatrimestre;
    }
}
