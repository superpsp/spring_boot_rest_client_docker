# FROM amazoncorretto:21
# FROM amazoncorretto:21.0.4-alpine3.18
FROM openjdk:21-ea-33-slim-bullseye
WORKDIR /app
ARG JAR_FILE=SpringBootRestClient-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} SpringBootRestClient.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","SpringBootRestClient.jar"]
