package steps.integracion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.MetodosPage;
import utils.EscenarioContext;

/**
 * Clase que define los pasos para eliminar un usuario existente a través de una API REST.
 */
public class EliminarUsuarioExistente {
    private final MetodosPage metodosPage = new MetodosPage(); // Instancia de la clase que maneja las solicitudes HTTP
    private Response response; // Variable para almacenar la respuesta de la API

    /**
     * Envía una solicitud HTTP DELETE al endpoint especificado.
     *
     * @param endpoint URL del servicio al que se enviará la solicitud DELETE.
     */
    @When("se envía una solicitud DELETE a {string}")
    public void seEnvíaUnaSolicitudDELETEA(String endpoint) {
        response = metodosPage.RequestDelete(endpoint);

        // Almacena la respuesta y el código de estado en el contexto del escenario
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
    }

    /**
     * Verifica que la respuesta de la solicitud DELETE no contenga contenido en el cuerpo.
     */
    @Then("la respuesta no debe contener contenido")
    public void laRespuestaNoDebeContenerContenido() {
        String contenido = response.getBody().asString();

        // Asegura que el contenido sea nulo o vacío
        Assert.assertTrue(contenido == null || contenido.isEmpty(), "La respuesta no debe contener contenido");
    }
}
