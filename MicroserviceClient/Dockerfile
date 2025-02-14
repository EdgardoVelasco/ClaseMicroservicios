FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceClient-1.0.0.jar client.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","client.jar" ]