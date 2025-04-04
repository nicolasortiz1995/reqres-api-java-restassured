package utils;

import io.github.cdimascio.dotenv.Dotenv;

/**
 * Clase utilitaria para la configuración del ambiente.
 * Permite obtener variables de entorno desde un archivo .env.
 */
public class ConfiguracionAmbiente {

    /**
     * Instancia de Dotenv para cargar las variables de entorno.
     */
    private static final Dotenv dotenv = Dotenv.load();

    /**
     * Obtiene el valor de una variable de entorno específica.
     *
     * @param key Nombre de la variable de entorno.
     * @return Valor de la variable de entorno o null si no se encuentra.
     */
    public static String obtenerVariableAmbiente(String key) {
        return dotenv.get(key);
    }
}
