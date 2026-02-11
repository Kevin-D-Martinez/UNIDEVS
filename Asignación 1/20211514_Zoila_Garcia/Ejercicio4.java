package ejercicio4;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        // Programa que cuenta los números pares del 1 al 100
        
        int contador = 2;
        
        while (contador <= 100)
        {
            if (contador % 2 == 0)
            {
                System.out.println(contador);
            }
            contador = contador + 2;
        }
    }
    
}
