public class Tv{
    String marca;
    int pulgadas ;
    boolean encendido;
    int volumen;
    
    public void encender(){
        System.out.println("La TV se está encendiendo...");
        this.encendido = true;
    }
    
    public void apagar(){
        System.out.println("La TV se está apagando...");
        this.encendido = false;
    }
    
    public void subirVolumen(){
        System.out.println("Subiendo el volumen...");
        this.volumen++;
    }
    
    public void bajarVolumen(){
        System.out.println("Bajando el volumen...");
        this.volumen--;
    }
}