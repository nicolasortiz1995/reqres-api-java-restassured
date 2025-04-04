@E2E
Feature: Registro y Login de usuario en ReqRes
  Como tester de API
  Quiero validar el registro y autenticación de un usuario
  Para asegurar que el flujo de autenticación funcione correctamente

  @happy-path @e2e-test
  Scenario: Flujo completo de registro y login exitoso
    Given que la API de ReqRes está disponible
    When se envía una solicitud POST a "api/register" para registrar usuario "eve.holt@reqres.in" y contraseña "pistol"
    Then la respuesta debe tener un código de estado 200
    Then se extrae el "id" y "token" no deben estar vacíos

    When se envía una solicitud POST a "api/login" para loguearme usuario "eve.holt@reqres.in" y contraseña "cityslicka"
    Then la respuesta debe tener un código de estado 200
    Then la respuesta debe incluir un token
