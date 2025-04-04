package steps.integracion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.MetodosPage;
import utils.EscenarioContext;
import utils.GenerarPayloads;
import utils.GeneradorDatos;

public class ActualizarUsuarioExistente {
    private final MetodosPage metodosPage = new MetodosPage();
    private Response response;

    @When("se envía una solicitud PUT a {string} con el payload correctamente")
    public void seEnviaUnaSolicitudPUTAConElPayloadCorrectamente(String endpoint) {
        response = metodosPage.RequestPut(endpoint, GenerarPayloads.generarPayloadParaActualizarUsuario());
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
    }

    @Then("la respuesta debe reflejar los cambios realizados")
    public void laRespuestaDebeReflejarLosCambiosRealizados() {
        String nombreCompleto = response.jsonPath().getString("name");
        String trabajo = response.jsonPath().getString("job");
        Assert.assertTrue(nombreCompleto.contains("TCA"), "El nombre completo no contiene 'TCA'");
        Assert.assertTrue(trabajo.contains("TCA"), "El trabajo no contiene 'TCA'");
    }



}
