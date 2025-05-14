FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar push-service.jar
ENTRYPOINT ["java", "-jar", "push-service.jar"]