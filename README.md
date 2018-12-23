# BROC API

Bring Your Own Controller API

## Build and Run

```bash
$ mvn package
$ java -jar target/broc-api-1.0.0-SNAPSHOT.jar server ../config.yml
```

## Test

Create a hot and then list all hosts using `curl`.

```bash
$ curl -X POST -d '{"name":"host1"}' -H "Content-Type: application/json" http://localhost:8000/hosts
{"id":null,"name":"host1","self":null,"timeCreated":null,"timeUpdated":null}✔ ~/personalspace/.m2

$ curl http://localhost:8000/hosts
[{"id":null,"name":"host1","self":null,"timeCreated":null,"timeUpdated":null}]
```

## Dropwizard

This API leverages the [Dropwizard](https://www.dropwizard.io/1.3.5/docs/) framework.

## Swagger Spec

The API is defined by a [Swagger](https://swagger.io/) spec. You can drop the [BROC API spec](./spec/api.yml) into the online [Swagger Editor](https://editor.swagger.io/) and see details on how the API is designed to work.
