package Choferes;

/**
 * Entidad del chofer donde se gestiona y aplican sus datos personales
 * @author Kevin Daniel Martinez Reyes 2025-1159
 */
public class Chofer {
    private int id;
    private String nombre;
    private String apellido;
    private boolean activo;
    private String cedula;
    private String telefono;
    private int rutaId;
    
    /**
     * Asigna valores por defecto
     */
    public Chofer(){
        id = 0;
        nombre = "";
        apellido = "";
        activo = true;
        cedula = "";
        telefono = "";
        rutaId = 0;
    }
    
    /**
     * Asigna los valores necesario para crear un chofer
     * @param id Identificador único
     * @param nombre Nombre del chofer
     * @param apellido Apellido del chofer
     * @param activo Indica si esta o no activo en la ruta
     * @param rutaId Identificador único a la ruta que pertenece
     */
    public Chofer(int id, String nombre, String apellido, boolean activo, int rutaId){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.rutaId = rutaId;
    }
    
    /**
     * Asigna los valores necesario para crear un chofer más el número de télefono
     * @param id Identificador único
     * @param nombre Nombre del chofer
     * @param apellido Apellido del chofer
     * @param activo Indica si esta o no activo en la ruta
     * @param rutaId Identificador único a la ruta que pertenece
     * @param telefono Número de teléfono
     */
    public Chofer(int id, String nombre, String apellido, boolean activo, int rutaId, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
        this.rutaId = rutaId;
        this.telefono = telefono;
    }
    
    /**
     * Asigna todos los valores que debe tener un chofer
     * @param id Identificador único
     * @param nombre Nombre del chofer
     * @param apellido Apellido del chofer
     * @param activo Indica si esta o no activo en la ruta
     * @param rutaId Identificador único a la ruta que pertenece
     * @param telefono Número de teléfono
     * @param cedula Número de cédula 
     */
    public Chofer(int id, String nombre, String apellido, boolean activo, int rutaId, String telefono, String cedula){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.activo = activo;
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
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    
    public int getRutaId(){
        return rutaId;
    }
    
    public void setRutaId(int rutaId){
        this.rutaId = rutaId;
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
    
    @Override
    public String toString(){
        return "ID: " + id 
                + "\nNombre: " + nombre 
                + "\nApellido: " + apellido 
                + "\nActivo: " + activo
                + "\nCédula: " + cedula 
                + "\nTeléfono: " + telefono
                + "\nId ruta: " + rutaId;
    }
}
