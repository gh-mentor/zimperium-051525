# Java Producer-Consumer Example

This project demonstrates a simple implementation of the Producer-Consumer pattern in Java using asynchronous programming. The application consists of two main components: a `Producer` that generates messages and a `Consumer` that consumes those messages.

## Project Structure

```
java-producer-consumer
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Producer.java
│   │   │           ├── Consumer.java
│   │   │           └── Main.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           ├── ProducerTest.java
│       │           └── ConsumerTest.java
│       └── resources
├── pom.xml
└── README.md
```

## How to Run

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd java-producer-consumer
   ```

2. **Build the project**:
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Run the application**:
   Execute the main class:
   ```
   mvn exec:java -Dexec.mainClass="com.example.Main"
   ```

## Dependencies

This project uses Maven for dependency management. The required dependencies are specified in the `pom.xml` file.

## Testing

Unit tests are provided for both the `Producer` and `Consumer` classes. To run the tests, use the following command:
```
mvn test
```

