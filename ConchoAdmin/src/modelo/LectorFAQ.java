package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilidad para leer el archivo FAQ.
 * @author ZoeyTato [Zoila Garcia 2021-1514]
 */
public class LectorFAQ {
    /**
     * Lee el archivo faq.txt y retorna una lista de pares [pregunta, respuesta].
     *
     * @return Lista de arreglos String[] donde [0]=pregunta y [1]=respuesta
     */
    public static List<String[]> leerFAQ() {

        List<String[]> items = new ArrayList<>();
        String pregunta = null;
        String respuesta = null;

        InputStream is = LectorFAQ.class.getResourceAsStream("/utilidades/faq.txt");

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

        items.add(new String[]{
            "Creado por UNIDEVS:",
            "Darvin Mendez - Líder del equipo\n" +
            "Zoila García - UX/UI\n" +
            "Luis Moscoso - SQA\n" +
            "Kevin Martinez - Administrador Base de Datos"
        });
        return items;
    }
}
