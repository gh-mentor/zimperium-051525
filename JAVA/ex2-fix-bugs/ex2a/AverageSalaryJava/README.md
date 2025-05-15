# Average Salary Calculator

This Java project calculates the average salary of employees in a specified department. It is a simple console application that demonstrates the use of classes, methods, and exception handling in Java.

## Project Structure

```
AverageSalaryJava
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Employee.java
│   │   │           ├── SalaryCalculator.java
│   │   │           └── Main.java
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           └── SalaryCalculatorTest.java
├── pom.xml
└── README.md
```

## How to Run

1. Ensure you have Java Development Kit (JDK) and Maven installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Compile the project using Maven:
   ```
   mvn clean install
   ```
5. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.example.Main"
   ```

## Features

- Defines an `Employee` class with properties for name, department, and salary.
- Provides a `SalaryCalculator` class with a method to calculate the average salary for a specified department.
- Handles exceptions for cases where no employees are found in the specified department.

## Testing

The project includes unit tests for the `SalaryCalculator` class, ensuring that the average salary calculation works correctly for various scenarios. To run the tests, use the following Maven command:

```
mvn test
```

## License

This project is licensed under the MIT License. See the LICENSE file for more details.