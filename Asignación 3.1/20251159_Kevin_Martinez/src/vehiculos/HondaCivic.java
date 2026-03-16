package vehiculos;

public class HondaCivic extends AutoMovil{
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }

    @Override
    public void encender() {
        System.out.println("El Honda Civic está encendiendo con arranque deportivo...");
    }

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic acelera rápidamente...");
    }
}
