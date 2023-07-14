# Use a base image with Java 11 installed
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file and any additional resources to the container
COPY target/helloworld-0.0.1-SNAPSHOT.jar /app/helloworld-0.0.1-SNAPSHOT.jar

# Expose the port on which the Spring Boot application runs
EXPOSE 9300

# Set the command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "helloworld-0.0.1-SNAPSHOT.jar"]
