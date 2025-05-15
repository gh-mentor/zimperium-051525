// filepath: AverageSalaryJava/AverageSalaryJava/src/main/java/com/example/Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    try {
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee("Alice", "Engineering", 75000));
      employees.add(new Employee("Bob", "Engineering", -50000)); // Negative salary (logical error)
      employees.add(new Employee("Charlie", "HR", 60000));
      employees.add(new Employee("Diana", "Engineering", 80000));
      employees.add(new Employee("Eve", "HR", 0)); // Zero salary (edge case)

      String department = "Engineering";
      double averageSalary = SalaryCalculator.calculateAverageSalary(employees, department);

      System.out.println("The average salary in the " + department + " department is: " + averageSalary);
    } catch (IllegalArgumentException ex) {
      System.out.println("Error: " + ex.getMessage());
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}