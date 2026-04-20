package gestionChoferes;

/**
 * DTO chofer
 * @author Kevin Daniel Martinez Reyes 2025-1159
 */
public class Chofer {
    private int id;
    private String nombre;
    private String apellido;
    private String estado;
    private String cedula = "vacío";
    private String telefono = "vacío";
    private int idRuta;
    private int idUsuario;
    
    public Chofer(){
    }
    
    /**
     * Constructor que asigna los valores necesario para crear un chofer
     * @param id 
     * @param nombre
     * @param apellido
     * @param estado
     * @param idRuta
     * @param idUsuario
     */
    public Chofer(int id, String nombre, String apellido, String estado, int idRuta, int idUsuario){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.idRuta = idRuta;
        this.idUsuario = idUsuario;
    }
    
    /**
     * Constructor que asigna los valores necesario para crear un chofer más el número de télefono
     * @param id 
     * @param nombre 
     * @param apellido 
     * @param estado
     * @param idRuta
     * @param idUsuario
     * @param telefono 
     */
    public Chofer(int id, String nombre, String apellido, String estado, int idRuta, int idUsuario, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.telefono = telefono;
        this.idRuta = idRuta;
        this.idUsuario = idUsuario;
    }
    
    /**
     * Constructor que asigna todos los valores de un chofer
     * @param id 
     * @param nombre 
     * @param apellido 
     * @param estado  
     * @param idRuta  
     * @param idUsuario  
     * @param telefono 
     * @param cedula 
     */
    public Chofer(int id, String nombre, String apellido, String estado, int idRuta, int idUsuario, String telefono, String cedula){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.cedula = cedula;
        this.telefono = telefono;
        this.idRuta = idRuta;
        this.idUsuario = idUsuario;
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
    
    public int getIdRuta(){
        return idRuta;
    }
    
    public void setIdRuta(int idRuta){
        this.idRuta = idRuta;
    }
    
    public int getIdUsuario(){
        return idUsuario;
    }
    
    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}