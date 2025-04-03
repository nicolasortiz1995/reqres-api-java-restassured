package utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class GeneradorDatos {

    static Faker faker = new Faker();

    public static int generarIDAleatorio() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }

    public static String generarNombreUsuarioAleatorio() {
        return faker.name().username();
    }

    public static String generarNombreAleatorio() {
        return faker.name().firstName();
    }

    public static String generarApellidoAleatorio(){
        return faker.name().lastName();
    }

    public static String generarCorreoAleatorio() {
        return faker.internet().emailAddress();
    }

    public static String generarContrasenaAleatoria() {
        return faker.internet().password();
    }

    public static String generarNumeroTelefonoAleatorio() {
        return faker.phoneNumber().cellPhone();
    }
}
