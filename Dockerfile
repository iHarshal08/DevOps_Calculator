FROM ubuntu:latest

# Install dos2unix utility
RUN apt-get update && apt-get install -y dos2unix

# Set the working directory
WORKDIR /app

# Copy the calculator.sh script into the container
COPY calculator.jar /app/calculator.jar

# Convert line endings to Unix-style
RUN dos2unix /app/calculator.jar

# Ensure the script has execute permissions
RUN chmod +x /app/calculator.jar

# Set the default command to execute calculator.sh
CMD ["bash", "/app/calculator.jar"]
