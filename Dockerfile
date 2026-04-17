# Use a slim JRE for the final image to keep it small
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copy the JAR already created by CodeBuild in the 'build' phase
COPY target/staynest-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]