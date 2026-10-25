
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.jar demo-app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "demo-app.jar"]
