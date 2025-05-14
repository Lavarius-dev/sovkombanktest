FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar email-service.jar
ENTRYPOINT ["java", "-jar", "email-service.jar"]