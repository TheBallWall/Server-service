FROM openjdk:17-jdk-slim
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} server.jar
ENTRYPOINT ["java","-jar","/app.jar"]