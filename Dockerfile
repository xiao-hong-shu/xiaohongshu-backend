# Stage 1: Build the application
FROM maven:3.6.3-jdk-11 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src/ /app/src/
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:11-jre-slim
COPY --from=build /app/target/*.jar /app.jar
CMD ["java", "-jar", "/app.jar"]
