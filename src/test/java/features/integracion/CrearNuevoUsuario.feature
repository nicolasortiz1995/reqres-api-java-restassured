@API @CrearNuevoUsuario
Feature: Crear un nuevo usuario
  Como tester de API
  Quiero crear un nuevo usuario
  Para validar que se genere un "id" y se registre la fecha de creación

  @happy-path
  Scenario: Crear un nuevo usuario
    Given que la API de ReqRes está disponible
    When se envía una solicitud POST a "api/users" con el payload correcto
    Then la respuesta debe tener un código de estado 201
    Then la respuesta debe contener un id generado y la fecha de creación
