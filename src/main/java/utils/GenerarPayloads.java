package utils;

/**
 * Clase utilitaria para la generación de payloads JSON utilizados en pruebas de API.
 */
public class GenerarPayloads {

    /**
     * Genera un payload JSON para la creación de un usuario con datos aleatorios.
     *
     * @return Cadena JSON con el nombre y el trabajo generados aleatoriamente.
     */
    public static String generarPayloadParaCrearUsuario(){
        return "{\n" +
                "  \"name\": \"" + GeneradorDatos.generarNombreCompletoAleatorio() + "\",\n" +
                "  \"job\": \"" + GeneradorDatos.generarTrabajoAleatorio() + "\"\n" +
                "}";
    }

    /**
     * Genera un payload JSON con datos predefinidos para actualizar un usuario.
     *
     * @return Cadena JSON con valores estáticos para nombre y trabajo.
     */
    public static String generarPayloadParaActualizarUsuario(){
        return "{\n" +
                "  \"name\": \"Nombre TCA\",\n" +
                "  \"job\": \"Trabajo TCA\"\n" +
                "}";
    }

    /**
     * Genera un payload JSON para la autenticación de un usuario.
     *
     * @param usuario    Dirección de correo electrónico del usuario.
     * @param contrasena Contraseña del usuario.
     * @return Cadena JSON con los datos de autenticación proporcionados.
     */
    public static String generarPayloadParaUsuarioConDatos(String usuario, String contrasena) {
        return "{\n" +
                "  \"email\": \"" + usuario + "\",\n" +
                "  \"password\": \"" + contrasena + "\"\n" +
                "}";
    }
}
