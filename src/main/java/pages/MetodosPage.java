package pages;
import io.restassured.response.Response;
import utils.ConfiguracionAmbiente;

import static io.restassured.RestAssured.given;

public class MetodosPage {

    private final String baseUrl = ConfiguracionAmbiente.obtenerVariableAmbiente("BASE_URL");

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

}
