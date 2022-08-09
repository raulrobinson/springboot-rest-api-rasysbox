[![Build Status](https://travis-ci.com/coma123/Spring-Boot-Blog-REST-API.svg?branch=development)](https://travis-ci.com/coma123/Spring-Boot-Blog-REST-API) [![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=coma123_Spring-Boot-Blog-REST-API&metric=alert_status)](https://sonarcloud.io/dashboard?id=coma123_Spring-Boot-Blog-REST-API) [![CII Best Practices](https://bestpractices.coreinfrastructure.org/projects/3706/badge)](https://bestpractices.coreinfrastructure.org/projects/3706)

<p align="center">
  <a href="https://github.com/raulrobinson" target="blank"><img src="./assets/images/tecnologias.png" width="560" alt="Tecnologias" /></a>
</p>

# Spring Boot, MySQL, Spring Security, JWT, JPA, Rest API

Construir Restful CRUD API para un Blog utilizando Spring Boot, Mysql, JPA e Hibernate.

## Pasos para instalar.

**1. Clonar la aplicacion.

```bash
    git clone https://github.com/raulrobinson/springboot-rest-api-rasysbox.git
```

## Requirements

- Postgres: `^14.4`
- Java: `^17`
- Maven: `^3.8.4`

## Postgres

- Crear una base la base de datos
nombre BD: common_app
user_BD: postgres
pass_BD: ***

- Configure los parametros de Sending E-mail para los tokens de Recovery

Esto se configura en application.properties

## Installation

```shell
# download dependencies
$ mvn install -DskipTests

# run the application
$ mvn spring-boot:run

# run the tests
$ mvn test

# to build for production
$ mvn clean package

# to generate the coverage report after testing (available at: target/site/jacoco/index.html)
$ mvn jacoco:report
```

## Running a specific test
utilice el parametro `-Dtest=<class>#<method>`


Por ejemplo para integrar una prueba. creando un usuario:
```
$ mvn test -Dtest=UsersControllerIntegrationTests#should_save_a_new_user
```

## Swagger
Cuando la aplicacion este ejecutandose, estaran disponibles en: [http://localhost:8080/swagger-ui/4.11.1/index.html?configUrl=/documentation/schemas/swagger-config](http://localhost:8080/swagger-ui/4.11.1/index.html?configUrl=/documentation/schemas/swagger-config)

