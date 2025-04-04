Feature: Actualizar un usuario existente
  Como tester de API
  Quiero actualizar los datos de un usuario existente
  Para validar que se reflejen correctamente los cambios realizados

  @happy-path @actualizar-usuario @integration-test
  Scenario: Actualizar un usuario existente
    Given que la API de ReqRes está disponible
    When se envía una solicitud PUT a "api/users/2" con el payload correctamente
    Then la respuesta debe tener un código de estado 200
    Then la respuesta debe reflejar los cambios realizados
