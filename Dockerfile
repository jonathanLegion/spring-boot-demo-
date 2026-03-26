# 1. Use a Java 17 base image
FROM eclipse-temurin:17-jdk

# 2. Set working directory inside container
WORKDIR /app

# 3. Copy everything from repo into container
COPY . .

# 4. Build the application using Maven Wrapper
RUN ./mvnw clean package

# 5. Run the Spring Boot JAR
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]