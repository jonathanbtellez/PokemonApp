# Ejecución del Proyecto

## Prerrequisitos

Asegúrate de tener instalado en tu sistema:
- Java Development Kit (JDK) 21 o superior
- Apache Maven 3.6.0 o superior

## Implementación de la base de datos
Se debe crear una base de datos en PostgreSQL con el nombre pokemon_app
```
   CREATE DATABASE pokemon_app;
```

## Pasos para Ejecutar el Proyecto

1. **Clonar el repositorio:**
   ```sh
   git clone <repository-url>
   cd <repository-directory>
    ```

Construir el proyecto:  
- mvn clean install


Ejecutar la aplicación:  
- mvn spring-boot:run

Acceder a la aplicación: Abre tu navegador web y navega a http://localhost:18081.

El puerto debe puede ser modificado en el archivo application.yml


## Documentación de la API

La documentación de la API se encuentra disponible en Swagger UI.
http://localhost:18081/swagger-ui/index.html


## Estructura del Proyecto

   ```src/main/java/com/coding/challenge/pokemonapp```

   Contiene el código fuente de la aplicación.  
   * __Controller:__ Aquí se encuentran los controladores REST que manejan las solicitudes HTTP.
   
   * __Exception__: Contiene las clases de excepciones personalizadas.
   
   * __Model__: Incluye las entidades del modelo de datos.
   
   * __Entities__: Define las entidades del dominio.
   
   * __Entities/jpa__: Define las entidades JPA que se mapean a la base de datos.
   
   * __Repository__: Contiene las interfaces de los repositorios que extienden JpaRepository para interactuar con la base de datos.
   
   * __Service__: Define las interfaces y las implementaciones de los servicios de negocio.
   * __Mapper__: Contiene las clases de mapeo entre entidades y DTOs.


## Mejoras Futuras

- Implementar la paginación y la clasificación de los resultados de la API.
- Implementar la autenticación y la autorización de los usuarios.
- implementar pruebas unitarias y de integración.
- Implementar docker para facilitar la ejecución del proyecto.
