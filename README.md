# Agrométrica System

Sistema web para la gestión y análisis de producción porcina, desarrollado con Spring Boot.

## Descripción

Agrométrica System es una aplicación web orientada al registro, cálculo y análisis de datos productivos, alimenticios y económicos en granjas porcinas. Permite centralizar la información de cada ciclo productivo y generar indicadores clave para facilitar la toma de decisiones.

## Problema identificado

En muchas granjas porcinas, la información se registra de forma manual o en herramientas aisladas, lo que ocasiona falta de control, errores en cálculos, pérdida de información histórica y dificultad para evaluar la rentabilidad de los ciclos productivos.

## Solución

El sistema desarrollado permite registrar ciclos porcinos, automatizar el cálculo de indicadores como peso ganado, índice de conversión alimenticia, costos, ingresos y rentabilidad, almacenar la información en una base de datos centralizada y consultar registros mediante filtros por nombre de granja y fecha.

## Arquitectura

La aplicación sigue una arquitectura en capas:

- Controller: gestión de rutas y comunicación con las vistas  
- Service: lógica de negocio y cálculos  
- Repository: acceso a datos mediante Spring Data JPA  
- Entity: modelado de la base de datos  
- View: interfaz de usuario desarrollada con Thymeleaf  

<img width="1104" height="537" alt="image" src="https://github.com/user-attachments/assets/4ba69449-939c-4017-a93d-fa47e09536fb" />


## Requerimientos

- Java 17 o superior  
- Maven  
- Base de datos PostgreSQL  
- Conexión a Railway (opcional para despliegue en la nube)  

Dependencias principales:

- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Spring Security  
- Thymeleaf  
- PostgreSQL Driver  

## Instalación, configuración y ejecución

Clonar el repositorio:

git clone https://github.com/jealgaam-ux/agrometrics-system.git

Acceder al proyecto:

cd agrometrica-system

Abrir el proyecto en IntelliJ IDEA o NetBeans.

Configurar la base de datos en el archivo application.properties:

spring.datasource.url=jdbc:postgresql://HOST:PUERTO/NOMBRE_DB
spring.datasource.username=USUARIO
spring.datasource.password=CONTRASEÑA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Ejecutar la aplicación:

mvn spring-boot:run

## Uso del sistema

El sistema permite iniciar sesión, registrar ciclos porcinos mediante formularios, generar cálculos automáticos de indicadores productivos y económicos, consultar registros almacenados, aplicar filtros por nombre de granja y fecha, y visualizar el detalle completo de cada registro.

## Seguridad

El sistema implementa autenticación mediante Spring Security y utiliza encriptación de contraseñas con BCrypt, evitando el almacenamiento de credenciales en texto plano.

## Contribución

Para contribuir al proyecto se debe crear una nueva rama, realizar los cambios y enviarlos al repositorio:

git checkout -b feature/nueva-funcionalidad
git commit -m "Descripción del cambio"
git push origin feature/nueva-funcionalidad

Posteriormente, se debe generar un Pull Request.

## Roadmap

Se contemplan mejoras futuras como la implementación de paneles de control con gráficos, exportación de reportes en formato PDF o Excel, integración de nuevos módulos productivos, gestión de usuarios y roles, así como la implementación de una API REST.

## Video de demostración

Se debe incluir un video que muestre el funcionamiento completo del sistema, incluyendo inicio de sesión, registro de datos, generación de cálculos, consulta de registros, aplicación de filtros y visualización del detalle.

## Despliegue

El sistema puede ejecutarse en entorno local mediante Spring Boot. La base de datos se encuentra alojada en Railway, lo que permite persistencia de datos y acceso remoto.
