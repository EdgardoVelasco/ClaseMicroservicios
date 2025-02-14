FROM openjdk:17
WORKDIR /app
COPY ./target/MicroserviceConfig-1.0.0.jar config.jar
EXPOSE 8888
ENTRYPOINT [ "java","-jar","config.jar" ]