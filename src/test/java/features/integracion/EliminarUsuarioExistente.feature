Feature: Eliminar un usuario existente
  Como tester de API
  Quiero eliminar un usuario
  Para validar que el usuario sea eliminado correctamente sin respuesta de contenido

  @happy-path @eliminar-usuario @integration-test
  Scenario: Eliminar un usuario existente
    Given que la API de ReqRes está disponible
    When se envía una solicitud DELETE a "api/users/2"
    Then la respuesta debe tener un código de estado 204
    Then la respuesta no debe contener contenido
