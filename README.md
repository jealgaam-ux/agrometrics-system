# Agrométrica System

Sistema web para la gestión y análisis de producción porcina, desarrollado con Spring Boot.

---

## Descripción

Agrométrica System es una aplicación web diseñada para registrar, calcular y analizar información relacionada con la producción porcina. El sistema permite capturar datos productivos, sanitarios, alimenticios y económicos de cada ciclo, generando indicadores clave que apoyan la toma de decisiones.

---

## Problema identificado

En muchas unidades de producción porcina, el control de información se realiza de forma manual o mediante herramientas dispersas. Esto genera:

- Falta de control y trazabilidad de los ciclos productivos
- Errores en cálculos de costos, ingresos y rentabilidad
- Dificultad para analizar el desempeño histórico
- Toma de decisiones basada en información incompleta

---

## Solución

Se desarrolló un sistema web que permite:

- Registrar ciclos productivos porcinos
- Calcular automáticamente indicadores como peso ganado, índice de conversión alimenticia, costos, ingresos y rentabilidad
- Almacenar la información en una base de datos centralizada
- Consultar registros mediante filtros por nombre de granja y fecha
- Visualizar el detalle completo de cada registro

---

## Arquitectura

El sistema está basado en una arquitectura en capas:

- Controller: Manejo de rutas HTTP y comunicación con las vistas
- Service: Implementación de la lógica de negocio y cálculos
- Repository: Acceso a datos mediante Spring Data JPA
- Entity: Modelado de las tablas de la base de datos
- View: Interfaces construidas con HTML y Thymeleaf

---

## Tabla de contenidos

- Descripción
- Problema identificado
- Solución
- Arquitectura
- Requerimientos
- Instalación
- Configuración
- Uso
- Contribución
- Roadmap
- Video de demostración
- Despliegue

---

## Requerimientos

- Java 17 o superior
- Maven
- Conexión a base de datos PostgreSQL
- Cuenta en Railway para base de datos en la nube

Dependencias principales:

- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Thymeleaf
- PostgreSQL Driver

---

## Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/jealgaam-ux/agrometrics-system.git
