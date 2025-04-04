package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Clase encargada de ejecutar las pruebas de Cucumber con TestNG.
 * Configura las opciones de Cucumber, incluyendo la ubicación de los archivos de características,
 * los paquetes de definición de pasos y los plugins de reporte.
 */
@CucumberOptions(
        features = "src/test/java/features", // Ubicación de los archivos .feature
        glue = "steps", // Paquete donde se encuentran las definiciones de pasos
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} // Plugins para la generación de reportes
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Esta clase actúa como un punto de entrada para la ejecución de pruebas con Cucumber y TestNG.
}