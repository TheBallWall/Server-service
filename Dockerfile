FROM openjdk:17-jdk-slim
EXPOSE 8080
ARG JAR_FILE=target/Server-service-1-jar-with-dependencies.jar
ADD ${JAR_FILE} server.jar
ENTRYPOINT ["java","-jar","/server.jar"]