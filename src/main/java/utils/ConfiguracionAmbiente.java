package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfiguracionAmbiente {
    private static final Dotenv dotenv = Dotenv.load();

    public static String obtenerVariableAmbiente(String key) {
        return dotenv.get(key);
    }
}
