
# Proyecto de Automatización de API con Java y RestAssured

## Descripción

Este proyecto está diseñado para automatizar pruebas de API utilizando Java con RestAssured, Cucumber BDD y TestNG. Además, se generan reportes con Allure y se gestionan entornos con Dotenv.

## Tecnologías Utilizadas

-   **Java 22**: Lenguaje de programación principal.    
-   **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.    
-   **Cucumber**: Framework BDD para escribir pruebas en lenguaje Gherkin.
-   **TestNG**: Framework para la ejecución de pruebas.    
-   **REST Assured**: Biblioteca para realizar pruebas sobre APIs REST.    
-   **Allure**: Herramienta de generación de reportes.    
-   **Dotenv**: Manejo de variables de entorno.    
-   **Log4j**: Manejo de logs.    
-   **JavaFaker**: Generación de datos aleatorios.
    

## Estructura del Proyecto: reqres-api-java-restassured
```
reqres-api-java-restassured/
│-- .idea/
│-- src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/
│   │   │   │   ├── MetodosPage.java
│   │   │   ├── utils/
│   │   │       ├── ConfiguracionAmbiente.java
│   │   │       ├── EscenarioContext.java
│   │   │       ├── GeneradorDatos.java
│   │   │       ├── GenerarPayloads.java
│   │   ├── resources/
│   │       ├── .env
│   │       ├── allure.properties
│   │       ├── cucumber.properties
│   ├── test/
│   │   ├── java/
│   │   │   ├── features/
│   │   │   │   ├── e2e/
│   │   │   │   │   ├── E2E_RegistroYLoginExitoso.feature
│   │   │   │   ├── integracion/
│   │   │   │   │   ├── ActualizarUsuarioExistente.feature
│   │   │   │   │   ├── CrearNuevoUsuario.feature
│   │   │   │   │   ├── EliminarUsuarioExistente.feature
│   │   │   │   │   ├── ObtenerListaUsuarios.feature
│   │   │   │   │   ├── ObtenerUsuarioExistente.feature
│   │   │   ├── runner/
│   │   │   │   ├── TestRunner.java
│   │   │   ├── steps/
│   │   │   │   ├── e2e/
│   │   │   │   │   ├── E2E_RegistroYLoginExitoso.java
│   │   │   │   ├── integracion/
│   │   │   │   │   ├── ActualizarUsuarioExistente.java
│   │   │   │   │   ├── CrearNuevoUsuario.java
│   │   │   │   │   ├── EliminarUsuarioExistente.java
│   │   │   │   │   ├── ObtenerListaUsuarios.java
│   │   │   │   │   ├── ObtenerUsuarioExistente.java
│-- pom.xml
│-- README.md

```

## Configuración y Dependencias

El archivo **pom.xml** gestiona todas las dependencias y configuraciones del proyecto:

-   **Dependencias**: Cucumber, TestNG, REST Assured, Allure, Dotenv, Log4j, JavaFaker.
    
-   **Plugins**:
    
    -   Maven Compiler Plugin        
    -   Allure Maven Plugin        
    -   Maven Clean Plugin
        
-   **Perfiles de Ejecución**:
    
    -   `all-tests`: Ejecuta todas las pruebas.        
    -   `sad-path`: Ejecuta solo escenarios de error.        
    -   `happy-path`: Ejecuta solo escenarios exitosos.        
    -   `e2e-test`: Ejecuta pruebas de extremo a extremo.        
    -   `integration-test`: Ejecuta pruebas de integración.
        

## Instalación

1.  Clonar el repositorio:
    
    ```sh
    git clone https://github.com/tu-repositorio.git    
    ```
    
2.  Ingresar al directorio del proyecto:
    
    ```sh
    cd reqres-api-java-restassured    
    ```
    
3.  Instalar dependencias con Maven:
    
    ```sh
    mvn clean install    
    ```
    

## Ejecución de Pruebas

-   Para ejecutar todas las pruebas:
    
    ```sh
    mvn test -P all-tests    
    ```
    
-   Para ejecutar pruebas con escenarios fallidos:
    
    ```sh
    mvn test -P sad-path    
    ```
    
-   Para ejecutar pruebas de integración:
    
    ```sh
    mvn test -P integration-test    
    ```
    
-   Para generar reportes Allure:
    
    ```sh
    mvn allure:report    
    ```
    

## Reportes con Allure

Los reportes se generan en `target/allure-results`. Para visualizar el reporte, ejecutar:

```sh
allure serve target/allure-results
```

## Contribuciones

Si deseas contribuir, por favor sigue las mejores prácticas de desarrollo y crea un Pull Request con una descripción clara de los cambios.


## Desarrollado Por

Este proyecto fue desarrollado por [Nicolas Ortiz](https://www.linkedin.com/in/ortiznicolas/).

### Información de Contacto:
- **LinkedIn**: [https://www.linkedin.com/in/ortiznicolas/](https://www.linkedin.com/in/ortiznicolas/)
- **Correo Electrónico**: vinico0911@hotmail.com
- **Móvil**: +573202978837

## Contribuir

Siéntete libre de contribuir al proyecto creando pull requests, reportando problemas o sugiriendo mejoras.