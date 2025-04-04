package pages;

import io.restassured.response.Response;
import utils.ConfiguracionAmbiente;

import static io.restassured.RestAssured.given;

/**
 * Clase que proporciona métodos para realizar solicitudes HTTP (POST, GET, PUT, DELETE)
 * utilizando la librería RestAssured.
 */
public class MetodosPage {

    /**
     * URL base obtenida desde la configuración del ambiente.
     */
    private final String baseUrl = ConfiguracionAmbiente.obtenerVariableAmbiente("BASE_URL");

    /**
     * Realiza una solicitud HTTP POST.
     *
     * @param endpoint Ruta del endpoint a la que se enviará la solicitud.
     * @param payload Cuerpo de la solicitud en formato JSON.
     * @return Respuesta de la solicitud HTTP.
     */
    public Response RequestPost(String endpoint, String payload) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/xml")
                .body(payload)
                .when()
                .post(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Realiza una solicitud HTTP GET.
     *
     * @param endpoint Ruta del endpoint a la que se enviará la solicitud.
     * @return Respuesta de la solicitud HTTP.
     */
    public Response RequestGet(String endpoint) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/xml")
                .when()
                .get(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Realiza una solicitud HTTP PUT.
     *
     * @param endpoint Ruta del endpoint a la que se enviará la solicitud.
     * @param payload Cuerpo de la solicitud en formato JSON.
     * @return Respuesta de la solicitud HTTP.
     */
    public Response RequestPut(String endpoint, String payload) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/xml")
                .body(payload)
                .when()
                .put(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }

    /**
     * Realiza una solicitud HTTP DELETE.
     *
     * @param endpoint Ruta del endpoint a la que se enviará la solicitud.
     * @return Respuesta de la solicitud HTTP.
     */
    public Response RequestDelete(String endpoint) {
        return given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/xml")
                .when()
                .delete(baseUrl + endpoint)
                .then()
                .extract()
                .response();
    }
}
