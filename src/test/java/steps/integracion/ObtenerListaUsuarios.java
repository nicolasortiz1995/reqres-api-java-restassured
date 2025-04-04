package steps.integracion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pages.MetodosPage;
import org.testng.Assert;
import utils.EscenarioContext;

/**
 * Clase que define los pasos para obtener una lista de usuarios a través de una API REST.
 */
public class ObtenerListaUsuarios {
    private final MetodosPage metodosPage = new MetodosPage(); // Instancia de la clase que maneja las solicitudes HTTP
    private Response response; // Variable para almacenar la respuesta de la API

    /**
     * Verifica que la API de ReqRes esté disponible antes de ejecutar las pruebas.
     */
    @Given("que la API de ReqRes está disponible")
    public void queLaAPIDeReqResEstaDisponible() {
        System.out.println("Test Started"); // Mensaje de inicio de prueba
    }

    /**
     * Envía una solicitud HTTP GET al endpoint especificado para obtener la lista de usuarios.
     *
     * @param endpoint URL del servicio al que se enviará la solicitud GET.
     */
    @When("se envía una solicitud GET a {string}")
    public void seEnviaUnaSolicitudGETA(String endpoint) {
        response = metodosPage.RequestGet(endpoint);

        // Almacena la respuesta y el código de estado en el contexto del escenario
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
    }

    /**
     * Valida que la respuesta de la API tenga el código de estado esperado.
     *
     * @param statusCodeEsperado Código de estado HTTP esperado en la respuesta.
     */
    @Then("la respuesta debe tener un código de estado {int}")
    public void laRespuestaDebeTenerUnCodigoDeEstado(int statusCodeEsperado) {
        int statusCode = (int) EscenarioContext.get("statusCode");

        // Compara el código de estado obtenido con el esperado
        Assert.assertEquals(statusCode, statusCodeEsperado, "El código de estado no es el esperado");
    }

    /**
     * Verifica que la respuesta de la API contenga una lista de usuarios y no esté vacía.
     */
    @Then("la respuesta debe contener una lista de usuarios")
    public void laRespuestaDebeContenerUnaListaDeUsuarios() {
        // Valida que el campo "data" contenga una lista de usuarios
        Assert.assertFalse(response.jsonPath().getList("data").isEmpty(), "La lista de usuarios está vacía");
    }
}
