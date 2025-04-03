package steps.integracion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pages.MetodosPage;
import org.testng.Assert;
import utils.EscenarioContext;

public class ObtenerListaUsuarios {
    private final MetodosPage metodosPage = new MetodosPage();
    private Response response;

    @Given("que la API de ReqRes está disponible")
    public void queLaAPIDeReqResEstaDisponible() {
        System.out.println("Test Started");
    }

    @When("se envía una solicitud GET a {string}")
    public void seEnviaUnaSolicitudGETA(String endpoint) {
        response = metodosPage.RequestGet(endpoint);
        EscenarioContext.set("response", response);
    }

    @Then("la respuesta debe tener un código de estado {int}")
    public void laRespuestaDebeTenerUnCodigoDeEstado(int statusCodeEsperado) {
        Assert.assertEquals(response.getStatusCode(), statusCodeEsperado, "El código de estado no es el esperado");
    }

    @Then("la respuesta debe contener una lista de usuarios")
    public void laRespuestaDebeContenerUnaListaDeUsuarios() {
        Assert.assertFalse(response.jsonPath().getList("data").isEmpty(), "La lista de usuarios está vacía");
    }

    // Método para compartir la respuesta con otros steps sin usar variables globales
    public Response obtenerResponse() {
        return response;
    }
}
