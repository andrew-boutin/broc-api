default: clean build run

# Clean out previously compiled classes, artifacts, etc.
.PHONY: clean
clean:
	mvn clean

# Build the Java artifact and then build the Docker image
.PHONY: build
build:
	mvn package
	docker build -t broc-api .

# Run the application in a Docker container
.PHONY: run
run:
	docker run -it -p 8000:8000 -p 8001:8001 broc-api

# Run the application without containerization
.PHONY: run-uncontained
run-uncontained:
	java -jar target/broc-api-1.0.0-SNAPSHOT.jar server config.yml
