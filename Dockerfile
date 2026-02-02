# Step 1: Use a "Builder" image to compile the code
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Use a supported "Runtime" image to run the app
# We are switching from 'openjdk' to 'eclipse-temurin'
FROM eclipse-temurin:17-jdk-jammy
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]