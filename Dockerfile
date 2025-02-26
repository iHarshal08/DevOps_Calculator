FROM ubuntu:latest

# Install OpenJDK 17
RUN apt-get update && \
    DEBIAN_FRONTEND=noninteractive apt-get install -y openjdk-17-jdk \
    rm -rf /var/lib/apt/lists/*
# Set the working directory
WORKDIR /app

# Copy the calculator.jar script into the container
COPY target/calculator.jar /app/calculator.jar

# Ensure the script has execute permissions
RUN chmod +x /app/calculator.jar

# Set the default command to execute jar file
CMD ["java", "-jar", "/app/calculator.jar"]
