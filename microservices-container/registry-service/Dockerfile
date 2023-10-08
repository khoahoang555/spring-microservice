FROM eclipse-temurin:18
LABEL name=registry-service
WORKDIR /app
COPY target/registry-service-1.0-SNAPSHOT.jar /app/registry-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/registry-service-1.0-SNAPSHOT.jar"]
EXPOSE 8761