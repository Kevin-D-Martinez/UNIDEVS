package raizcuadrada_exponente;

/**
 * Permite realizar algunas operaciones matemáticas avanzadas
 */
public class Raizcuadrada_Exponente {
    /**
     * Calcula la raíz cuadrada de un valor
     * @param valor1 Valor a encontrar raíz
     * @return La raíz cuadradar del valor
     */
   public double raizcuadrada(Double valor1){
       return Math.sqrt(valor1);
   }
   
    /**
     * Potenciar un valor hasta donde se le indique
     * @param valor1 Valor base
     * @param valor2 Exponente
     * @return Resultado del la porenciación
     */
   public double exponenciar(Double valor1, Double valor2){
       return Math.pow(valor1, valor2);
   }
}
