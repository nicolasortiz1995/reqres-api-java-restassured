package steps.e2e;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import pages.MetodosPage;
import utils.EscenarioContext;
import utils.GenerarPayloads;

/**
 * Clase que contiene los pasos definidos para el flujo de registro y login exitoso en una API.
 */
public class E2E_RegistroYLoginExitoso {
    private final MetodosPage metodosPage = new MetodosPage();

    /**
     * Envía una solicitud POST para registrar un usuario con las credenciales proporcionadas.
     *
     * @param endpoint   URL del servicio donde se registrará el usuario.
     * @param usuario    Correo electrónico del usuario.
     * @param contrasena Contraseña del usuario.
     */
    @When("se envía una solicitud POST a {string} para registrar usuario {string} y contraseña {string}")
    public void seEnvíaUnaSolicitudPOSTAParaRegistrarUsuarioYContraseña(String endpoint, String usuario, String contrasena) {
        Response response = metodosPage.RequestPost(endpoint, GenerarPayloads.generarPayloadParaUsuarioConDatos(usuario, contrasena));
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
        EscenarioContext.set("id", response.jsonPath().getInt("id"));
        EscenarioContext.set("token", response.jsonPath().getString("token"));
    }

    /**
     * Envía una solicitud POST para iniciar sesión con las credenciales proporcionadas.
     *
     * @param endpoint   URL del servicio de autenticación.
     * @param usuario    Correo electrónico del usuario.
     * @param contrasena Contraseña del usuario.
     */
    @When("se envía una solicitud POST a {string} para loguearme usuario {string} y contraseña {string}")
    public void seEnvíaUnaSolicitudPOSTAAParaLoguearmeUsuarioYContraseña(String endpoint, String usuario, String contrasena) {
        Response response = metodosPage.RequestPost(endpoint, GenerarPayloads.generarPayloadParaUsuarioConDatos(usuario, contrasena));
        EscenarioContext.set("response", response);
        EscenarioContext.set("statusCode", response.getStatusCode());
        EscenarioContext.set("token", response.jsonPath().getString("token"));
    }

    /**
     * Verifica que los valores de ID y token obtenidos en la respuesta no sean nulos ni vacíos.
     *
     * @param idKey    Clave para extraer el ID del contexto.
     * @param tokenKey Clave para extraer el token del contexto.
     */
    @Then("se extrae el {string} y {string} no deben estar vacíos")
    public void seExtraeElYNoDebenEstarVacios(String idKey, String tokenKey) {
        Assert.assertNotNull(EscenarioContext.get(idKey), "El ID no debe ser null");
        Assert.assertFalse(EscenarioContext.get(idKey).toString().trim().isEmpty(), "El ID no debe estar vacío");
        Assert.assertNotNull(EscenarioContext.get(tokenKey), "El token no debe ser null");
        Assert.assertFalse(EscenarioContext.get(tokenKey).toString().trim().isEmpty(), "El token no debe estar vacío");
    }

    /**
     * Verifica que la respuesta contenga un token válido.
     */
    @Then("la respuesta debe incluir un token")
    public void laRespuestaDebeIncluirUnToken() {
        Response response = (Response) EscenarioContext.get("response");
        Assert.assertNotNull(response.jsonPath().getString("token"), "El token no fue generado");
    }
}