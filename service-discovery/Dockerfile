# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory (optional but recommended)
WORKDIR /app

# Copy the application JAR file
COPY target/service-discovery-0.0.1-SNAPSHOT.jar /app/service-discovery.jar

# Expose the port that the service runs on (Eureka typically runs on port 8761)
EXPOSE 8761

# Define the command to run the service
ENTRYPOINT ["java", "-jar", "/app/service-discovery.jar"]
