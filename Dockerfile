FROM openjdk:8u121-jre-alpine

WORKDIR /var/broc-api

EXPOSE 8000 8001

CMD ["java", "-jar", "broc-api-app.jar", "server", "config.yml"]

COPY broc-api-app/target/broc-api-app-1.0.0-SNAPSHOT.jar /var/broc-api/broc-api-app.jar
COPY broc-api-app/config.yml /var/broc-api/config.yml
