FROM openjdk:17-jdk-slim
EXPOSE 8080
WORKDIR /app
COPY ./target/*.jar /app
ADD *.jar /app/server.jar
ENTRYPOINT ["java","-jar","/server.jar"]