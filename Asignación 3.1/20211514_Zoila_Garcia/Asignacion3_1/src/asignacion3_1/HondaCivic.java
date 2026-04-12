/*
 */
package asignacion3_1;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class HondaCivic extends AutoMovil {

    // constructor
    
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }
    
    //Métodos

    @Override
    public void acelerar() {
        System.out.println("El Honda Civic ha acelerado 10kph.");
    }

    @Override
    public void encender() {
        System.out.println("El Honda Civic ha desacelerado 10kph.");
    }
    
    
    
}
