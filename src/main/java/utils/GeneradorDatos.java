package utils;

import com.github.javafaker.Faker;

import java.util.Random;

public class GeneradorDatos {

    static Faker faker = new Faker();

    public static String generarNombreCompletoAleatorio() {
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public static String generarTrabajoAleatorio() {
        return faker.job().title();
    }
}
