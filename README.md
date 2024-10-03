# API CRUD de Empleados - Spring Boot & MySQL

Este proyecto es una API RESTful simple para la gestión de empleados, utilizando Spring Boot y MySQL como base de datos. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una tabla de empleados.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot**
- **MySQL** como base de datos
- **Spring Data JPA** para la persistencia de datos
- **Maven** para la gestión de dependencias

## Requisitos previos

Antes de comenzar, asegúrate de tener instalado:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [MySQL](https://www.mysql.com/downloads/) o tener acceso a una instancia de MySQL
- [Maven](https://maven.apache.org/install.html)

## Configuración del proyecto

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/luzrestrepo/crud-empleados-springboot.git
   cd nombre-del-repositorio
   ```

2. **Construye el proyecto**:

   ```bash
   mvn clean install
   ```

3. **Ejecuta la aplicación**:
   ```bash
   Java run
   ```

## Endpoints de la API

### Obtener todos los empleados

- **Método**: `GET`
- **URL**: `/api/empleados`
- **Descripción**: Retorna una lista con todos los empleados.

### Obtener un empleado por ID

- **Método**: `GET`
- **URL**: `/api/empleados/{id}`
- **Descripción**: Retorna los detalles de un empleado específico según el ID.
- **Ejemplo**:
  ```bash
  GET /api/empleados/1
  ```

### Crear un nuevo empleado

- **Método**: `POST`
- **URL**: `/api/empleados`
- **Descripción**: Crea un nuevo empleado en la base de datos.
- **Cuerpo (JSON)**:
  ```json
  {
    "nombre": "Juan Pérez",
    "email": "juan.perez@empresa.com",
    "puesto": "Desarrollador",
    "salario": 50000,
    "fechaContratacion": "2023-10-01"
  }
  ```

### Actualizar un empleado existente

- **Método**: `PUT`
- **URL**: `/api/empleados/{id}`
- **Descripción**: Actualiza los detalles de un empleado existente.
- **Cuerpo (JSON)**:
  ```json
  {
    "nombre": "Juan Pérez",
    "email": "juan.perez@empresa.com",
    "puesto": "Desarrollador Senior",
    "salario": 60000,
    "fechaContratacion": "2023-10-01"
  }
  ```

### Eliminar un empleado

- **Método**: `DELETE`
- **URL**: `/api/empleados/{id}`
- **Descripción**: Elimina un empleado específico según el ID.

## Estructura del Proyecto

├── src │ ├── main │ │ ├── java │ │ │ └── com │ │ │ └── tu-proyecto │ │ │ └── controller │ │ │ └── service │ │ │ └── model │ │ └── resources │ │ └── application.properties └──
