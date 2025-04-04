package utils;

public class GenerarPayloads {
    public static String generarPayloadParaCrearUsuario(){
        return "{\n" +
                "  \"name\": \"" + GeneradorDatos.generarNombreCompletoAleatorio() + "\",\n" +
                "  \"job\": \"" + GeneradorDatos.generarTrabajoAleatorio() + "\"\n" +
                "}";
    }

    public static String generarPayloadParaActualizarUsuario(){
        return "{\n" +
                "  \"name\": \"" + "Nombre TCA" + "\",\n" +
                "  \"job\": \"" + "Trabajo TCA" + "\"\n" +
                "}";
    }
}
