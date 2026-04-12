/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Dalvi
 */
public class procesarDatos {
    
    private String matricula;
    private String nombres;
    private String apellidos;
    private String cuatrimestre;

    public void capturarDatos(String matricula, String nombres, String apellidos, String cuatrimestre) {
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }

    public String presentarDatos() {
        return "Matrícula: " + matricula +
               "\nNombres: " + nombres +
               "\nApellidos: " + apellidos +
               "\nCuatrimestre: " + cuatrimestre;
    }
}
