FROM openjdk:8u121-jre-alpine

WORKDIR /var/broc-api

ADD target/broc-api-1.0.0-SNAPSHOT.jar /var/broc-api/broc-api.jar
ADD config.yml /var/broc-api/config.yml

EXPOSE 8000 8001

ENTRYPOINT ["java", "-jar", "broc-api.jar", "server", "config.yml"]
