package utils;

import com.github.javafaker.Faker;

/**
 * Clase utilitaria para la generación de datos aleatorios.
 * Utiliza la librería JavaFaker para generar nombres y títulos de trabajo.
 */
public class GeneradorDatos {

    /**
     * Instancia de Faker para generar datos aleatorios.
     */
    static Faker faker = new Faker();

    /**
     * Genera un nombre completo aleatorio.
     *
     * @return Nombre completo aleatorio (nombre y apellido).
     */
    public static String generarNombreCompletoAleatorio() {
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    /**
     * Genera un título de trabajo aleatorio.
     *
     * @return Título de trabajo aleatorio.
     */
    public static String generarTrabajoAleatorio() {
        return faker.job().title();
    }
}
