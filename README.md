# HMCTS Dev Test Backend

This is a Spring Boot backend for a task management application that provides REST APIs to manage tasks, complete with Swagger documentation and an in-memory H2 database for development.

## Features
- CRUD operations for tasks
- Swagger UI for interactive API testing
- Preloaded tasks via DataLoader
- H2 in-memory database for easy setup
- Logging using SLF4J and Logback

## Prerequisites
- Java 21+
- Gradle (or use included wrapper)

## Getting Started
1. **Clone the repository**
```bash
git clone https://github.com/IdrisShittu/hmcts-dev-test-backend.git
cd hmcts-dev-test-backend
```
2. **Build the application**
```bash
./gradlew build
```
3. **Run the application**
```bash
./gradlew bootRun
```
Application runs on: `http://localhost:4000`

## API Documentation
- Swagger UI: [http://localhost:4000/swagger-ui.html](http://localhost:4000/swagger-ui.html)
- OpenAPI Docs: [http://localhost:4000/v3/api-docs](http://localhost:4000/v3/api-docs)

## H2 Database Access
- Console: [http://localhost:4000/h2-console](http://localhost:4000/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: `password`

## Key Endpoints
- `GET /tasks` – Get all tasks
- `POST /tasks` – Create a task
- `GET /tasks/{id}` – Get task by id
- `PATCH /tasks/{id}/status` – Update task status
- `DELETE /tasks/{id}` – Delete a task

## Testing
Run all tests:
```bash
./gradlew test
```
