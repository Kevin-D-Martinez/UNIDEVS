package calculadora.guiCalculadora;

/**
 * Permite realizar las operaciones matemáticas básicas
 */
public class Calculadora {
    /**
     * Suma dos valores
     * @param valor1 Primer valor
     * @param valor2 Segundo valor
     * @return La suma de los dos valores
     */
   public double sumar(Double valor1, Double valor2){
       return valor1 + valor2;
   } 
   
    /**
     * Resta dos valores
     * @param valor1 Primer valor
     * @param valor2 Segundo valor
     * @return La resta de los dos valores
     */
   public double restar(Double valor1, Double valor2){
       return valor1 - valor2;
   }
   
    /**
     * Multiplica dos valores
     * @param valor1 Primer valor
     * @param valor2 Segundo valor
     * @return La multiplicación de los dos valores
     */
   public double multiplicar(Double valor1, Double valor2){
       return valor1 * valor2;
   }
   
    /**
     * Divide dos valores
     * @param valor1 Primer valor
     * @param valor2 Segundo valor
     * @return La división de los dos valores
     */
   public double dividir(Double valor1, Double valor2){
       return valor1 / valor2;
   }
}
