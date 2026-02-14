package proyectocalculadora3;

/**
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class Calculadora {

    // Métodos de suma, con sus sobrecargas
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int sumar(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    // Métodos de resta, con sus sobrecargas
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public int restar(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    public int restar(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }

    // Métodos de multiplicación, con sus sobrecargas
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int multiplicar(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public int multiplicar(int num1, int num2, int num3, int num4) {
        return num1 * num2 * num3 * num4;
    }

    // Método de division, sin sobrecargas
    public float dividir(int num1, int num2) {
        float num3 = num1 / num2;
        return num3;
    }
}
