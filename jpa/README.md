# Internship Management System — Spring Data JPA

A Spring Boot application that interacts with an Internship Management System database using Spring Data JPA and PostgreSQL.

Built as part of an internship training exercise to practice JPA entity mapping, repository patterns, and JPQL queries.

---

## Tech Stack

- Java 17
- Spring Boot 3.5.3
- Spring Data JPA / Hibernate
- PostgreSQL 16
- Maven

---

## Database Schema

The app maps to an existing PostgreSQL schema with the following tables:

- `tracks` — internship tracks
- `mentors` — mentors assigned to interns
- `interns` — intern records with track and mentor relationships
- `projects` — projects with a status (planned / active / completed)
- `intern_projects` — junction table linking interns to projects
- `submissions` — intern project submissions with scores

---

## Setup

**1. Clone the repo and open in your IDE**

**2. Create the database**

Make sure PostgreSQL is running and create the database:
```sql
CREATE DATABASE internship_db;
```
Then run your schema SQL file to create the tables.

**3. Configure the connection**

Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/internship_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

**4. Run the app**
```bash
mvn spring-boot:run
```

---

## Docker

Build the image:
```bash
mvn clean package -DskipTests
docker build -t orange-jpa-app .
```

Run it:
```bash
docker run --network host orange-jpa-app
```

> On Windows/Mac replace `--network host` with `-e SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/internship_db`

---

## Project Structure

```
src/main/java/com/oie/jpa/
├── entity/        # JPA entities
├── repository/    # Spring Data JPA repositories
├── runner/        # CommandLineRunner for testing queries
└── Main.java
```
