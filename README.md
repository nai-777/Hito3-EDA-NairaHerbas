# Hito 3 - Estructuras de Datos con Java y Spring Boot

## Requisitos
- Java 17+
- Maven
- Spring Boot 3.x

## Cómo ejecutar
```bash
mvn spring-boot:run
```
El servidor corre en: http://localhost:8080

## Endpoints

### Notas
- GET /notas/agregar?valor=85
- GET /notas
- GET /notas/promedio
- GET /notas/max
- GET /notas/min

### Aula
- GET /aula
- GET /aula/ocupados
- GET /aula/ocupar?fila=1&columna=2
- GET /aula/liberar?fila=1&columna=2

### Estudiantes
- GET /estudiantes/agregar?nombre=Ana&puntaje=95&id=1
- GET /estudiantes
- GET /estudiantes/ordenados
- GET /estudiantes/buscar/Ana