package Principal;

/**
 * Gestiona el uso de los datos para sus respectivos procesos
 */
public class ProcesarDatos {
    private String matricula = "sin dato";
    private String nombres = "sin dato";
    private String apellidos = "sin dato";
    private String cuatrimestre = "sin dato";
    
    /**
     * Recibe los datos ingresados
     * @param matricula Matrícula de la persona
     * @param nombres Nombre completo de la persona
     * @param apellidos Apellido de la persona
     * @param cuatrimestre Cuatrimestre en el que se encuentra cursando
     */
    public void capturarDatos(String matricula, String nombres, String apellidos, String cuatrimestre){
        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cuatrimestre = cuatrimestre;
    }
    
    /**
     * Organiza los datos para ser presentados
     * @return datos de la persona
     */
    public String presentarDatos(){
        return "Matrícula: "+matricula
                +"\nNombres: "+nombres
                +"\nApellidos: "+apellidos
                +"\nCuatrimestre cursado: "+cuatrimestre;
    }
}
