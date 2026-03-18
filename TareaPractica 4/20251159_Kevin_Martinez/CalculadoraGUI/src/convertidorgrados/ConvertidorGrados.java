package convertidorgrados;

/**
 * Calcula la conversión de temperaturas
 */
public class ConvertidorGrados {

    /**
     * Convierte los grados celcius a farenheit
     * @param celcius grados celcius
     * @return grados farenheit
     */
    public int convertidorCelciusAFarenheit(int celcius) {
        int farenheit;
        farenheit = (int) (1.8 * celcius + 32);
        return farenheit;
    }

    /**
     * Convierte los grados farenheit a celcius
     * @param farenheit grados farenheit
     * @return grados celcius
     */
    public int convertidorFarenheitACelcius(int farenheit) {
        int celcius;
        celcius = (int) ((farenheit - 32)/1.8);
        return celcius;
    }
}
