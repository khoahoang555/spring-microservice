FROM eclipse-temurin:18
LABEL name=api-gateway
WORKDIR /app
COPY target/api-gateway-1.0-SNAPSHOT.jar /app/api-gateway-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/api-gateway-1.0-SNAPSHOT.jar"]
EXPOSE 8181