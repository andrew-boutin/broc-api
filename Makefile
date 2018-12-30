# So we can see what commands get ran from the command line output.
SHELL = sh -xv

default: down clean build up

# Clean out previously compiled classes, artifacts, etc.
.PHONY: clean
clean:
	mvn clean

# Build the Java artifact and then build the Docker image
.PHONY: build
build:
	mvn package

# Bring up the Docker network daemonized with compose. The --build forces
# the app's Dockerfile to be rebuilt so that the updated .jar is used in the
# container.
.PHONY: up
up:
	docker-compose up --build -d

# Bring down the Docker network with compose
.PHONY: down
down:
	docker-compose down

# Run the single app container with Docker
.PHONY: run
run:
	docker run -it -p 8000:8000 -p 8001:8001 broc-api-app

# Run the application without containerization
.PHONY: run-uncontained
run-uncontained:
	java -jar broc-api-app/target/broc-api-app-1.0.0-SNAPSHOT.jar server config.yml
