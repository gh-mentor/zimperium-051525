### Modern Java Practices with Streams and Dependency Injection

In this exercise, you will explore advanced Java features, including Streams, Lambdas, and dependency injection using Spring. The goal is to design a flexible and reusable component that processes a collection of data while adhering to modern Java practices.

#### Requirements

- Create a class `DataProcessor` with the following features:
  - A private `List<String>` to store data, initialized via the constructor.
  - Ensure the list is immutable after initialization using `Collections.unmodifiableList`.

- Implement a method `filterData` that accepts a `Predicate<String>`:
  - Use Java Streams to filter the data based on the predicate and return a new `List<String>`.

- Implement a method `transformData` that accepts a `Function<String, String>`:
  - Use Java Streams to apply the transformation function to each element and return a new `List<String>`.

- Use Spring for dependency injection:
  - Define a `DataTransformationService` interface with a method `String transform(String input)`.
  - Provide an implementation of the service and inject it into `DataProcessor` using Spring's `@Autowired` annotation.

#### Testing

- Implement a test suite using JUnit 5 to validate the functionality of the `DataProcessor` class:
  - Test filtering with various predicates, including edge cases like empty strings or null values.
  - Test transformations with different functions, including uppercase conversion, trimming, and custom logic.
  - Validate Spring's dependency injection by mocking the `DataTransformationService`.

#### Documentation

- Document the code with Javadoc comments.
- Provide a README file explaining the design choices, usage, and testing instructions.

