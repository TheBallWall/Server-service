FROM openjdk:17-jdk-slim
EXPOSE 8080
ARG JAR_FILE=target/Server-service-1.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/Server-service-1.jar"]