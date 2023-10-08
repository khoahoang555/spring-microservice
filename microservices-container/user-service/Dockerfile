FROM eclipse-temurin:18
LABEL name=user-service
WORKDIR /app
COPY target/user-service-1.0-SNAPSHOT.jar /app/user-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/user-service-1.0-SNAPSHOT.jar"]