package controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador utilitario para la lectura del archivo de preguntas frecuentes
 * (FAQ).
 *
 * <p>
 * Lee el archivo {@code faq.txt} ubicado en {@code /assets/faq.txt} dentro del
 * classpath, y lo parsea en una lista de pares pregunta-respuesta.</p>
 *
 * <p>
 * El archivo debe seguir el siguiente formato por cada entrada:</p>
 * <pre>
 * PREGUNTA: ¿Cómo registro un chofer?
 * RESPUESTA: Dirígete a la sección Choferes y haz clic en "Crear nuevo".
 * </pre>
 *
 * <p>
 * Este controlador es de uso estático — no necesita instanciarse.</p>
 *
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class FAQControlador {

    /**
     * Lee el archivo {@code faq.txt} desde los recursos internos de la
     * aplicación y retorna su contenido como una lista de pares
     * pregunta-respuesta.
     *
     * <p>
     * El método busca líneas que comiencen con {@code PREGUNTA:} y
     * {@code RESPUESTA:}. Cuando encuentra ambas, las agrupa en un arreglo y lo
     * añade a la lista resultado.</p>
     *
     * <p>
     * Si el archivo no se encuentra o ocurre un error de lectura, retorna una
     * lista vacía y registra el error en consola.</p>
     *
     * @return Lista de arreglos {@code String[]} donde:
     * <ul>
     * <li>{@code [0]} contiene el texto de la pregunta.</li>
     * <li>{@code [1]} contiene el texto de la respuesta.</li>
     * </ul>
     * Retorna una lista vacía si el archivo no existe o no pudo leerse.
     */
    public static List<String[]> leerFAQ() {

        List<String[]> items = new ArrayList<>();
        String pregunta = null;
        String respuesta = null;

        InputStream is = FAQControlador.class.getResourceAsStream("/assets/faq.txt");

        if (is == null) {
            System.out.println("No se encontró faq.txt.");
            return items;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("PREGUNTA:")) {
                    pregunta = linea.replace("PREGUNTA:", "").trim();
                } else if (linea.startsWith("RESPUESTA:")) {
                    respuesta = linea.replace("RESPUESTA:", "").trim();
                }

                if (pregunta != null && respuesta != null) {
                    items.add(new String[]{pregunta, respuesta});
                    pregunta = null;
                    respuesta = null;
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo faq.txt: " + e.getMessage());
        }
        return items;
    }
}
