package steps.integracion;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.EscenarioContext;

public class ObtenerUsuarioExistente {
    @Then("la respuesta debe incluir los datos del usuario con id {int}")
    public void laRespuestaDebeIncluirLosDatosDelUsuarioConId(int idEsperado) {
        Response response = (Response) EscenarioContext.get("response");
        Assert.assertEquals(idEsperado, response.jsonPath().getInt("data.id"), "El id no coincide");
    }
}
