## Requisitos previos

- [MySQL](https://www.mysql.com/downloads/) o tener acceso a una instancia de 
**Configura la base de datos MySQL**:

   - Crea una base de datos llamada `empleadosdb` .
   - Asegúrate de tener el usuario y la contraseña configurados.
    **Configura las propiedades de la base de datos en `application.properties`**:
   En el archivo `src/main/resources/application.properties`, agrega la configuración de conexión a MySQL:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/empleadosdb
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   spring.jpa.hibernate.ddl-auto=update

   estructura de unica tabla en mysql.

| Field              | Type         | Null | Key | Default | Extra          |
+--------------------+--------------+------+-----+---------+----------------+
| id                 | bigint       | NO   | PRI | NULL    | auto_increment |
| nombre             | varchar(255) | YES  |     | NULL    |                |
| email              | varchar(255) | YES  |     | NULL    |                |
| puesto             | varchar(255) | YES  |     | NULL    |                |
| salario            | double       | YES  |     | NULL    |                |
| fecha_contratacion | date         | YES  |     | NULL    |                |

