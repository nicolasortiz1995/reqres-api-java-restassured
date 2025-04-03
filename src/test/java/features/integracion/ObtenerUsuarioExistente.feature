Feature: Obtener un usuario existente
  Como tester de API
  Quiero obtener los detalles de un usuario específico
  Para validar que los datos del usuario sean correctos

  @ObtenerUsuarioExistente
  Scenario: Obtener un usuario existente
    Given que la API de ReqRes está disponible
    When se envía una solicitud GET a "api/users/2"
    Then la respuesta debe tener un código de estado 200
    Then la respuesta debe incluir los datos del usuario con id 2
