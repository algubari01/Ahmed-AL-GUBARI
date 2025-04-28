# Use OpenJDK 17 slim version
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy source code into container
COPY src/ src/

# Compile all Java files
RUN javac src/*/*.java

# Set default to run Launcher
CMD ["java", "-cp", "src", "launcher.Launcher"]
