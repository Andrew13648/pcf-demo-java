This project is a simple employee application for playing around with PCF and Spring Boot.

Locally, this app provides simple CRUD operations against an embedded H2 database.

On Cloud Foundry, this application was bound to an ElephantSQL Postgres instance with an employee table for persistent data storage.

To deploy the application, run:

```
mvnw clean install
cf push
```
