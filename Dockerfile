# Step 1: Use a Maven image with Java 21 to compile the code
FROM maven:3.9.6-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Use a Java 21 Runtime image to run the app
FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]