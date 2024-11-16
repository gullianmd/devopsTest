# Usa una imagen base de OpenJDK 17
FROM openjdk:17-jdk-slim

# Copia el archivo JAR compilado al contenedor
COPY target/devopscert-1.0-SNAPSHOT.jar /app/devopscert-1.0-SNAPSHOT.jar

# Define el comando que ejecutará la aplicación
ENTRYPOINT ["java", "-jar", "/app/devopscert-1.0-SNAPSHOT.jar"]

# Expone el puerto en el que la aplicación estará escuchando
EXPOSE 8080
