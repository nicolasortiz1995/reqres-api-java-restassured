package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase utilitaria para gestionar el contexto de un escenario de prueba.
 * Permite almacenar y recuperar valores durante la ejecución de pruebas automatizadas.
 */
public class EscenarioContext {

    /**
     * Mapa que almacena los valores del contexto.
     */
    private static final Map<String, Object> context = new HashMap<>();

    /**
     * Almacena un valor en el contexto asociado a una clave específica.
     *
     * @param key   Clave bajo la cual se almacenará el valor.
     * @param value Valor a almacenar en el contexto.
     */
    public static void set(String key, Object value) {
        context.put(key, value);
    }

    /**
     * Recupera un valor almacenado en el contexto.
     *
     * @param key Clave del valor a recuperar.
     * @return Valor asociado a la clave o null si no existe.
     */
    public static Object get(String key) {
        return context.get(key);
    }

    /**
     * Limpia el contexto eliminando todos los valores almacenados.
     */
    public static void clear() {
        context.clear();
    }
}