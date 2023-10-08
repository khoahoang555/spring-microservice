FROM eclipse-temurin:18
LABEL name=config-service
WORKDIR /app
COPY target/config-service-1.0-SNAPSHOT.jar /app/config-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/config-service-1.0-SNAPSHOT.jar"]
EXPOSE 8888