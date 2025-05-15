### Section 1 - Planning a Web API Application Using Java

You will be planning a web API application using Java. The app will consist of 3 parts (modules) in the project `JavaREST`: a data library for a SQLite database (`inventory.db`), a RESTful web API, and integration testing. You are given a scripts/`inventory.sql` file that contains the SQL commands to create the database and tables. The application will be designed to manage an inventory of products, suppliers, and categories.

 Below are the instructions for setting up and designing the application:

1. **Setup Instructions**:
   - Provide a detailed explanation of how to set up the application, including dependencies (e.g., Maven/Gradle configurations) and configuration files (e.g., `application.properties` or `application.yml`).
   - Include instructions for running the application locally (e.g., using an embedded server like Tomcat or Jetty) and deploying it to a production server.
   - Specify the Java version (e.g., Java 17 or later) and any required frameworks (e.g., Spring Boot, Hibernate).

2. **Folder Structure**:
   - Describe and visually render the folder structure of the application. 

3. **API Usage**:
   - Provide examples of how to use the web API, including sample requests and responses (e.g., using JSON format).
   - Include examples of HTTP methods (GET, POST, PUT, DELETE) and their corresponding endpoints.

4. **Best Practices**:
   - Include a section on best practices for API development, such as input validation, error handling, and security considerations (e.g., authentication, authorization, and rate limiting).

---

### Section 2 - High-Level Design and Implementation Details

1. **Data Library**:
   - Define a data library to manage a SQLite inventory database using an ORM like Hibernate. The database will include 3 tables: `suppliers`, `categories`, and `products`.
   - Implement basic CRUD operations (Create, Read, Update, Delete) for inventory items.
   - Include a caching mechanism (e.g., using Spring Cache or Ehcache) to improve performance for frequently accessed data.
   - Support database migrations and seeding using tools like Flyway or Liquibase.

2. **Web API**:
   - Define a RESTful web API using Spring Boot. The API should:
     - Provide endpoints for CRUD operations on inventory items.
     - Implement input validation for incoming requests (e.g., using `@Valid` and `@NotNull` annotations).
     - Handle errors gracefully and return meaningful error messages with appropriate HTTP status codes.
     - Include a health check endpoint (e.g., `/health`) that returns a `200 OK` status code and a message indicating that the service is running.
     - Log all incoming requests and outgoing responses using a logging framework like SLF4J/Logback.

3. **Integration Testing**:
   - Define a testing framework using JUnit 5 and Spring Boot Test.
   - Write integration tests against an in-memory H2 database to mock the SQLite database.
   - Ensure tests cover all API endpoints, input validation, and error handling.
   - Test rate limiting and CORS handling.

---

### Section 3 - Future Enhancements

1. **Rate Limiting Middleware**:
   - Implement a rate-limiting middleware using a library like Bucket4j or Resilience4j.
   - Limit the number of requests from a single IP address to 100 requests per minute.
   - Include CORS handling to allow requests from any origin.

2. **Logging Middleware**:
   - Implement a logging middleware that logs all incoming requests and outgoing responses to a file.
   - Include details such as the request method, URL, status code, and response time.
   - Support configurable log levels and log rotation to manage log file sizes.


