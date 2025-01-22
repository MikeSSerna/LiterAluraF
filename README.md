# LiterAlura

**LiterAlura** es una aplicación backend desarrollada con Java y Spring Boot que permite gestionar y consultar libros desde una API. El proyecto utiliza PostgreSQL como base de datos y se integra con la API Gutendex para obtener información adicional sobre los libros.

## Tecnologías

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Spring Security** (si es necesario)

## Requisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- JDK 17 o superior
- PostgreSQL
- Maven (o el wrapper de Maven si prefieres)

## Instalación

Sigue estos pasos para poner en marcha el proyecto en tu máquina local:

1. **Clona este repositorio** en tu máquina:

   ```bash
   git clone https://github.com/tu_usuario/LiterAlura.git
2. **Configura la base de datos en PostgreSQL.** Crea una nueva base de datos y actualiza los detalles de conexión en el archivo src/main/resources/application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

3.**Ejecuta la aplicación. Puedes hacerlo con Maven:**
mvn spring-boot:run


Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
