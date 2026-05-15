#generate a Dockerfile for a Spring Boot application using OpenJDK 17 as the base image. The application should be built using Maven and the JAR file should be named "app.jar". The Dockerfile should include instructions to copy the JAR file into the container and set the entry point to run the application use openjdk 21.
# Use OpenJDK 21 as the base image
FROM openjdk:21-jdk-slim    
# Set the working directory in the container
WORKDIR /app    
# Copy the JAR file into the container
COPY target/app.jar app.jar    
# Expose the port that the application will run on  
EXPOSE 8080
# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]