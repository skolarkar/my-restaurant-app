# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Install curl using apt-get
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/my-restaurant-app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]