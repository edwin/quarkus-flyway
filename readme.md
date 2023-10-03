# Quarkus and Flyway for a multi-tenancy Database Integration

## About
Quarkus provide a convenient library to connect to a multiple Databases, and generate its table accordingly. In this example, we are planning to build an application which can be run within a container, and connecting to a MySql Database. We are relying on `Flyway` to create a table structure to maintain database versioning and audit trail.