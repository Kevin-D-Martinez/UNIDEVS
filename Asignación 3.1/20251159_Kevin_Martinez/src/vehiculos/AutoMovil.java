package vehiculos;

public class AutoMovil {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    
    public AutoMovil(){
        System.out.println("Constructor de AutoMóvil");
        marca = "";
        modelo = "";
        anio = 0;
        color = "";
    }
    
    public AutoMovil(String marca, String modelo, int anio, String color){
        System.out.println("Constructor de AutoMóvil");
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }
    
    public void encender(){
        System.out.println("El automóvil está encendiendo...");
    }
    
    public void apagar(){
        System.out.println("El automóvil se está apagando...");
    }
    
    public void acelerar(){
        System.out.println("El automóvil está acelerando...");
    }
    
    public void frenar(){
        System.out.println("El automóvil está frenando...");
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    public int getAnio(){
        return anio;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getaColor(){
        return color;
    }
}
