package gestionChoferes;

/**
 * DTO chofer
 * @author Kevin Daniel Martinez Reyes 2025-1159
 */
public class Chofer {
    private int id;
    private String nombre;
    private String apellido;
    private String numeroRuta;
    private String cedula;
    private String telefono;
    private String estado;
    private int rutaId;
    
    public Chofer(){
    }
    
    /**
     * Contructor que asigna los valores necesario para crear un chofer
     * @param nombre
     * @param apellido
     * @param numeroRuta
     * @param estado
     * @param rutaId
     */
    public Chofer(String nombre, String apellido, String numeroRuta, String estado, int rutaId){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRuta = numeroRuta;
        this.estado = estado;
        this.rutaId = rutaId;
    }
    
    /**
     * Contructor que asigna los valores necesario para crear un chofer más el número de télefono
     * @param nombre 
     * @param apellido 
     * @param numeroRuta 
     * @param estado 
     * @param rutaId 
     * @param telefono 
     */
    public Chofer(String nombre, String apellido, String numeroRuta, String estado, int rutaId, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRuta = numeroRuta;
        this.estado = estado;
        this.rutaId = rutaId;
        this.telefono = telefono;
    }
    
    /**
     * Contructor que asigna todos los valores que puede tener un chofer 
     * @param nombre 
     * @param apellido 
     * @param numeroRuta 
     * @param estado
     * @param rutaId 
     * @param telefono 
     * @param cedula 
     */
    public Chofer(String nombre, String apellido, String numeroRuta, String estado, int rutaId, String telefono, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroRuta = numeroRuta;
        this.estado = estado;
        this.cedula = cedula;
        this.telefono = telefono;
        this.rutaId = rutaId;
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
    
    public String getNumeroRuata(){
        return numeroRuta;
    }
    
    public void setNumeroRuta(String numeroRuta){
        this.numeroRuta = numeroRuta;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public int getRutaId(){
        return rutaId;
    }
    
    public void setRutaId(int rutaId){
        this.rutaId = rutaId;
    }
}