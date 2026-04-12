package gestionChoferes;

/**
 * DTO chofer
 * @author Kevin Daniel Martinez Reyes 2025-1159
 */
public class Chofer {
    private int id = 1;
    private String nombre = "vacío";
    private String apellido = "vacío";
    private String estado = "vacío";
    private String cedula = "vacío";
    private String telefono = "vacío";
    
    public Chofer(){
    }
    
    /**
     * Constructor que asigna los valores necesario para crear un chofer
     * @param id 
     * @param nombre
     * @param apellido
     * @param estado
     */
    public Chofer(int id, String nombre, String apellido, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
    
    /**
     * Constructor que asigna los valores necesario para crear un chofer más el número de télefono
     * @param id 
     * @param nombre 
     * @param apellido 
     * @param estado
     * @param telefono 
     */
    public Chofer(int id, String nombre, String apellido, String estado, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.telefono = telefono;
    }
    
    /**
     * Constructor que asigna todos los valores que puede tener un chofer
     * @param id 
     * @param nombre 
     * @param apellido 
     * @param estado  
     * @param telefono 
     * @param cedula 
     */
    public Chofer(int id, String nombre, String apellido, String estado, String telefono, String cedula){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
}