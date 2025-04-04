package steps.integracion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.MetodosPage;
import utils.EscenarioContext;
import utils.GenerarPayloads;

public class CrearNuevoUsuario {
    private final MetodosPage metodosPage = new MetodosPage();

    @When("se envía una solicitud POST a {string} con el payload correcto")
    public void seEnvíaUnaSolicitudPOSTAConElPayloadCorrecto(String endpoint) {
        Response response = metodosPage.RequestPost(endpoint, GenerarPayloads.generarPayloadParaCrearUsuario());
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
        System.out.println("Status code: "+ response.getStatusCode());
    }

    @Then("la respuesta debe contener un id generado y la fecha de creación")
    public void laRespuestaDebeContenerUnIdGeneradoYLaFechaDeCreacion() {
        Response response = (Response) EscenarioContext.get("response");
        Assert.assertNotNull(response.jsonPath().getString("id"), "El id no fue generado");
        Assert.assertNotNull(response.jsonPath().getString("createdAt"), "La fecha de creación no fue generada");
    }
}
