package steps.integracion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.MetodosPage;
import utils.EscenarioContext;

public class EliminarUsuarioExistente {
    private final MetodosPage metodosPage = new MetodosPage();
    private Response response;

    @When("se envía una solicitud DELETE a {string}")
    public void seEnvíaUnaSolicitudDELETEA(String endpoint) {
        response = metodosPage.RequestDelete(endpoint);
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
    }

    @Then("la respuesta no debe contener contenido")
    public void laRespuestaNoDebeContenerContenido() {
        String contenido = response.getBody().asString();
        Assert.assertTrue(contenido == null || contenido.isEmpty(), "La respuesta no debe contener contenido");
    }
}
