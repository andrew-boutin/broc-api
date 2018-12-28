# BROC API

Bring Your Own Controller API

![cool-broccoli](cool-broccoli.png)

## Build and Run

Requires `maven` and `docker`.

```bash
$make
```

Go to `http://localhost:8000/swagger-ui/` to see a list of endpoints, and auto generate `curl` commands to test out the API.

Health checks are exposed at `http://localhost:8001/healthcheck`.

Environment variables can be specified, with the Docker run command, that the application will utilize. For example the application config file optionally allows you to specify the ports.

```bash
$docker run -it -p 8000:9000 -p 8001:8001 -e BROC_API_PORT=9000 broc-api
```

## Technology

This API leverages the [Dropwizard](https://www.dropwizard.io/1.3.5/docs/) framework.

It utilizes [Redis](https://redis.io/) as a data store. [Redis Commander](https://joeferner.github.io/redis-commander/) is also set up.

It uses [Maven](https://maven.apache.org/) as the build tool. [Docker](https://www.docker.com/) and [Docker Compose](https://docs.docker.com/compose/) are used for containerization. [Makefile](https://www.gnu.org/software/make/manual/html_node/Introduction.html) is used for command automation.

The API is defined by a [Swagger](https://swagger.io/) spec. The app also hosts a Swagger UI at `/swagger-ui/`.

Either run the app and go to `/swagger-ui/` or drop the [BROC API spec](./spec/api.yml) into the online [Swagger Editor](https://editor.swagger.io/) to see details on the API design.
