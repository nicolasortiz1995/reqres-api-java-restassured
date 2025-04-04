Feature: Obtener lista de usuarios
  Como tester de API
  Quiero obtener la lista de usuarios
  Para validar que la paginación y la cantidad de usuarios sean correctas

  @happy-path @obtener-lista-usuarios @integration-test
  Scenario: Obtener lista de usuarios
    Given que la API de ReqRes está disponible
    When se envía una solicitud GET a "api/users?page=2"
    Then la respuesta debe tener un código de estado 200
    And la respuesta debe contener una lista de usuarios
