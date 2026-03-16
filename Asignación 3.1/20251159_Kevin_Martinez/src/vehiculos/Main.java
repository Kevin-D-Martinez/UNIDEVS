package vehiculos;

public class Main {
    public static void main(String[] args) {
        AutoMovil auto = new AutoMovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAnio(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        auto.encender();
        auto.acelerar();

        System.out.println("\n--- Honda Civic ---");
        HondaCivic honda = new HondaCivic();
        honda.setMarca("Honda");
        honda.setModelo("Civic");
        honda.setAnio(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        honda.encender();
        honda.acelerar();
    }
}
