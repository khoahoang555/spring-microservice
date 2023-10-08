FROM eclipse-temurin:18
LABEL name=auth-service
WORKDIR /app
COPY target/auth-service-1.0-SNAPSHOT.jar /app/auth-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/auth-service-1.0-SNAPSHOT.jar"]
EXPOSE 8081