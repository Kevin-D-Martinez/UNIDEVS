/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro;

/**
 * La clase {@code Estudiante} representa un estudiante con datos personales
 * y calificaciones en distintas evaluaciones académicas.
 * Permite calcular la nota final y determinar si el estudiante está aprobado o reprobado.
 * 
 * @author Dalvi
 */
public class Estudiante {

    /** Nombre completo del estudiante */
    private String nombre;
    
    /** Matrícula del estudiante */
    private String matricula;
    
    /** Carrera o programa académico */
    private String carrera;
    
    /** Calificación obtenida en prácticas (0-40) */
    private double practicas;
    
    /** Calificación obtenida en parciales (0-20) */
    private double parciales;
    
    /** Calificación obtenida en asignaciones (0-20) */
    private double asignaciones;
    
    /** Calificación obtenida en el examen final (0-20) */
    private double examenFinal;

    
     /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre Nombre completo del estudiante
     * @param matricula Matrícula del estudiante
     * @param carrera Carrera o programa académico
     * @param practicas Nota de prácticas (0-40)
     * @param parciales Nota de parciales (0-20)
     * @param asignaciones Nota de asignaciones (0-20)
     * @param examenFinal Nota del examen final (0-20)
     */
    public Estudiante(String nombre, String matricula, String carrera,
            double practicas, double parciales,
            double asignaciones, double examenFinal) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }

     /**
     * Calcula la nota final sumando todas las evaluaciones.
     *
     * @return La nota final del estudiante
     */
    public double calcularNotaFinal() {
        return practicas + parciales + asignaciones + examenFinal;
    }

    /**
     * Determina si el estudiante aprobó o reprobó según su nota final.
     * La nota mínima para aprobar es 60.
     *
     * @return "APROBADO" si la nota final es mayor o igual a 60, "REPROBADO" en caso contrario
     */
    public String getResultado() {
        return (calcularNotaFinal() >= 60) ? "APROBADO" : "REPROBADO";
    }

    /**
     * Devuelve el nombre completo del estudiante.
     *
     * @return Nombre completo del estudiante
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
    * Devuelve la matrícula del estudiante.
    *
    * @return Matrícula del estudiante
    */
    public String getMatricula() {
        return matricula;
    }

    /**
    * Devuelve la carrera del estudiante.
    *
    * @return Carrera o programa académico del estudiante
    */
    public String getCarrera() {
        return carrera;
    }
}
