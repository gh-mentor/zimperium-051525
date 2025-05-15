import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class SalaryCalculatorTest {

  @Test
  void calculateAverageSalary_ShouldReturnCorrectAverage_WhenEmployeesInDepartment() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "Engineering", 75000));
    employees.add(new Employee("Bob", "Engineering", 50000));
    employees.add(new Employee("Diana", "Engineering", 80000));

    double averageSalary = SalaryCalculator.calculateAverageSalary(employees, "Engineering");
    assertEquals(66666.67, averageSalary, 0.01);
  }

  @Test
  void calculateAverageSalary_ShouldThrowException_WhenNoEmployeesInDepartment() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Charlie", "HR", 60000));

    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      SalaryCalculator.calculateAverageSalary(employees, "Engineering");
    });

    assertEquals("No employees found in the specified department", exception.getMessage());
  }

  @Test
  void calculateAverageSalary_ShouldHandleNegativeSalaries() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "Engineering", 75000));
    employees.add(new Employee("Bob", "Engineering", -50000));
    employees.add(new Employee("Diana", "Engineering", 80000));

    double averageSalary = SalaryCalculator.calculateAverageSalary(employees, "Engineering");
    assertEquals(35000, averageSalary, 0.01);
  }

  @Test
  void calculateAverageSalary_ShouldHandleZeroSalaries() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Alice", "Engineering", 75000));
    employees.add(new Employee("Bob", "Engineering", 0));
    employees.add(new Employee("Diana", "Engineering", 80000));

    double averageSalary = SalaryCalculator.calculateAverageSalary(employees, "Engineering");
    assertEquals(51666.67, averageSalary, 0.01);
  }
}