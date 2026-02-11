import java.util.Scanner;

/**
 * Representa una calculadora matemática básica.
 */
public class CalculadoraMatematica{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Matematica operacion = new Matematica();

        System.out.println("===== CALCULADORA MATEMÁTICA =====");
        System.out.println("1. Ingresar números");
        System.out.println("2. Sumar");
        System.out.println("3. Restar");
        System.out.println("4. Multiplicar");
        System.out.println("5. Dividir");
        System.out.println("0. Salir");
        System.out.println("==================================");
        
        int opcion;
        
        do{
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1 :
                    operacion.ingresarNumeros(sc);
                    break;
                case 2 :
                    double resultadoSuma = operacion.calcularSuma();
                    System.out.println("Resultado de la suma: "+resultadoSuma);
                    System.out.println(" ");
                    break;
                case 3 :
                    double resultadoResta = operacion.calcularResta();
                    System.out.println("Resultado de la resta: "+resultadoResta);
                    System.out.println(" ");
                    break;
                case 4 :
                    double resultadoMultiplicacion = operacion.calcularMultiplicacion();
                    System.out.println("Resultado de la multiplicación: "+resultadoMultiplicacion);
                    System.out.println(" ");
                    break;
                case 5 :
                    double resultadoDivision = operacion.calcularDivision();
                    System.out.println("Resultado de la división: "+resultadoDivision);
                    System.out.println(" ");
                    break;
                case 0 :
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("La opción seleccionada no es permitida\n");
            }
        }while(opcion != 0);
    }
}


/**
 * Realiza la solicitud de los numeros y calcula operaciones matemáticas básicas
 */
class Matematica{
    /**
     * Constructor por defecto
     */
    Matematica(){}
    private double numero1;
    private double numero2;
    
    /**
     * Establece el valor del numero1
     * @param numero1  valor del numero1
     */
    private void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    /**
     * Establece el valor del numero2
     * @param numero2  valor del numero2
     */
    private void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    
    /**
    * Solicita al usuario dos números desde consola
    * @param sc objeto Scanner para la entrada de datos
    */
    public void ingresarNumeros(Scanner sc){
        System.out.println(" ");
        System.out.print("Ingrese el primer numero: ");
        double numero1 = sc.nextDouble();
        setNumero1(numero1);

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = sc.nextDouble();
        setNumero2(numero2);
        
        System.out.print("Números ingresados correctamente.\n\n");
    }
    
    /**
     * Calcula la suma de dos números
     * @return resultado de la suma
     */
    public double calcularSuma(){
        return this.numero1 + this.numero2;
    }
    
    /**
     * Calcula la resta de dos números
     * @return resultado de la resta
     */
    public double calcularResta(){
        return this.numero1 - this.numero2;
    }
    
    /**
     * Calcula la multiplicación de dos números
     * @return resultado de la multiplicación
     */
    public double calcularMultiplicacion(){
        return this.numero1 * this.numero2;
    }
    
    /**
     * Calcula la división de dos números validando que no sea entre cero
     * @return resultado de la división. Devuelve 0 cuando el divisor es cero.
     */
    public double calcularDivision(){
        if(this.numero2 == 0){
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        return this.numero1 / this.numero2;
    }
}