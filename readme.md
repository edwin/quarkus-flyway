# Quarkus and Flyway for a multi-tenancy Database Integration

## About
Quarkus provide a convenient library to connect to a multiple Databases, and generate its table accordingly. In this example, we are planning to build an application which can be run within a container, and connecting to a MySql Database. We are relying on `Flyway` to create a table structure to maintain database versioning and audit trail.

## How to Build

Do Maven build,
```
$ mvn clean package
```

Build container image,
```
$ podman build -t quarkus-flyway .
```

## How to Run

```
$ mvn quarkus:dev
```

## How to Test

Check application's health
```
$ curl -kv http://localhost:8080/q/health
```

Check application's data
```
$ curl -kv http://localhost:8080/student/get-all
```