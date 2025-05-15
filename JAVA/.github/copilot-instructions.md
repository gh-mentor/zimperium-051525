# Copilot Code Generation Instructions for Java Development

## General Guidelines
- Use camelCase for variable and method names.
- Use PascalCase for class and interface names.
- Use double quotes for strings.
- Ensure all methods have Javadoc comments.
- Ensure consistent indentation using 2 spaces.
- Use `private` for member variables and prefix them with `_`.
- Separate implementation and design by using interfaces (`.java`) and implementation classes (`.java`) where applicable.
- Favor composition over inheritance where possible.

## Specific Instructions
- Use `final` for fields that do not change after initialization.
- Use `var` (if using Java 10+) for local variable type inference where appropriate.
- Prefer lambda expressions for anonymous methods or functional interfaces.
- Use `StringBuilder` for string concatenation in loops or performance-critical code.
- Ensure all methods handle errors using exceptions.
- Verify that all imported packages are used.
- Check for proper error handling in all methods.
- Ensure all loops have proper termination conditions.
- Use descriptive names for variables and methods.
- Avoid deeply nested code; refactor into smaller methods if necessary.
- Use `CompletableFuture` or `ExecutorService` for asynchronous programming.
- Verify that all dependencies are listed in the `pom.xml` or `build.gradle` file.
- Check for any potential performance issues.
- Ensure all abstract base classes implement the `AutoCloseable` interface if resources need to be released.
- Complete all open TODO comments in the code.

## Testing Guidelines
- Use JUnit 5 for all tests. [Reference](https://junit.org/junit5/)
- Ensure all tests are self-contained and do not rely on external state.
- Write tests for all public methods and classes.
- Ensure tests cover both typical and edge cases.
- Use descriptive names for test cases and methods.

### Example Test Snippet
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTests {

  @Test
  void getDetails_ShouldReturnCorrectDetails() {
    Manager manager = new Manager(1, "Alice", 75000.0, "Engineering");
    assertEquals("ID: 1, Name: Alice, Salary: 75000.0, Department: Engineering", manager.getDetails());
  }

  @Test
  void getDepartment_ShouldReturnCorrectDepartment() {
    Manager manager = new Manager(1, "Alice", 75000.0, "Engineering");
    assertEquals("Engineering", manager.getDepartment());
  }
}

