package registroacademico;

public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private int practicas;
    private int parciales;
    private int asignaciones;
    private int examenFinal;
    
    /**
     * Constructor asigna valores por defecto
     */
    public Estudiante(){
        nombre = "";
        matricula = "";
        carrera = "";
        practicas = 0;
        parciales = 0;
        asignaciones = 0;
        examenFinal = 0;
    }
    
    /**
     * Constructor asigna los valores ingresados por parámetro
     * @param nombre Nombre del estudiante
     * @param matricula Matrícula del estudiante
     * @param carrera Carrera que está cursando el estudiante
     * @param practicas Puntuación total de las practicas
     * @param parciales Puntuación total de los parciales
     * @param asignaciones Puntucación total de las asignaciones
     * @param examenFinal Puntuación del examen final
     */
    public Estudiante(String nombre, String matricula, String carrera, int practicas, int parciales, int asignaciones, int examenFinal){
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.practicas = practicas;
        this.parciales = parciales;
        this.asignaciones = asignaciones;
        this.examenFinal = examenFinal;
    }
    
    // getters y setters
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public void setPracticas(int practicas){
        this.practicas = practicas;
    }
    
    public int getPracticas(){
        return practicas;
    }
    
    public void setParciales(int parciales){
        this.parciales = parciales;
    }
    
    public int getParciales(){
        return parciales;
    }
    
    public void setAsignaciones(int asignaciones){
        this.asignaciones = asignaciones;
    }
    
    public int getAsignaciones(){
        return asignaciones;
    }
    
    public void setExamenFinal(int examenFinal){
        this.examenFinal = examenFinal;
    }
    
    public int getExamenFinal(){
        return examenFinal;
    }
}
