# Usamos la imagen oficial de Java 21
FROM eclipse-temurin:21-jdk-jammy

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiamos los archivos de Maven
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Copiamos el código fuente
COPY src src

# Damos permisos al wrapper de Maven
RUN chmod +x mvnw

# Compilamos la aplicación
RUN ./mvnw clean package -DskipTests

# Exponemos el puerto 8080
EXPOSE 8080

# Comando para ejecutar la app
CMD ["java", "-jar", "target/apihorariomed-0.0.1-SNAPSHOT.jar"]
