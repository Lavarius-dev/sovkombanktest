FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar sms-service.jar
ENTRYPOINT ["java", "-jar", "sms-service.jar"]