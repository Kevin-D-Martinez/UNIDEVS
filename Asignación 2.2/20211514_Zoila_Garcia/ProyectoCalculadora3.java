package proyectocalculadora3;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class ProyectoCalculadora3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculadora calc = new Calculadora();

        // Pruebas con 2 parámetros
        System.out.println("Suma (2 parámetros): " + calc.sumar(5, 3));
        System.out.println("Resta (2 parámetros): " + calc.restar(10, 4));
        System.out.println("Multiplicación (2 parámetros): " + calc.multiplicar(6, 7));
        System.out.println("División (2 parámetros): " + calc.dividir(20, 4));

        // Pruebas con 3 parámetros
        System.out.println("Suma (3 parámetros): " + calc.sumar(5, 3, 2));
        System.out.println("Resta (3 parámetros): " + calc.restar(10, 4, 2));
        System.out.println("Multiplicación (3 parámetros): " + calc.multiplicar(2, 3, 4));

        // Pruebas con 4 parámetros
        System.out.println("Suma (4 parámetros): " + calc.sumar(1, 2, 3, 4));
        System.out.println("Resta (4 parámetros): " + calc.restar(20, 5, 3, 2));
        System.out.println("Multiplicación (4 parámetros): " + calc.multiplicar(2, 2, 2, 2));
    }

}
