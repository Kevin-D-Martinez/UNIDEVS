package ejercicio5;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // Programa que te da la sumatoria de los números del 1 al 50
        
        int contador = 1;
        int sumatoria = 0;
        
        do
        {
            sumatoria = sumatoria + contador;
            contador++;
        } while (contador <= 50);
        
        System.out.println("Resultado: " + sumatoria);
    }
    
}
