package steps.integracion;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.EscenarioContext;

/**
 * Clase que define los pasos para verificar la información de un usuario existente
 * en la respuesta de una API REST.
 */
public class ObtenerUsuarioExistente {

    /**
     * Valida que la respuesta de la API contenga los datos del usuario con el ID esperado.
     *
     * @param idEsperado ID del usuario que debe estar presente en la respuesta.
     */
    @Then("la respuesta debe incluir los datos del usuario con id {int}")
    public void laRespuestaDebeIncluirLosDatosDelUsuarioConId(int idEsperado) {
        // Obtiene la respuesta almacenada en el contexto del escenario
        Response response = (Response) EscenarioContext.get("response");

        // Valida que el ID en la respuesta sea el esperado
        Assert.assertEquals(idEsperado, response.jsonPath().getInt("data.id"), "El id no coincide");
    }
}
