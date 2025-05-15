// File: /AverageSalaryJava/AverageSalaryJava/src/main/java/com/example/SalaryCalculator.java

package com.example;

import java.util.List;

/**
 * Provides methods to calculate the average salary of employees in a given department.
 */
public class SalaryCalculator {

  /**
   * Calculates the average salary of employees in a given department.
   *
   * @param employees A list of employees.
   * @param department The department to filter by.
   * @return The average salary of employees in the department.
   * @throws IllegalArgumentException Thrown if no employees are found in the specified department.
   */
  public static double calculateAverageSalary(List<Employee> employees, String department) {
    var departmentEmployees = employees.stream()
      .filter(e -> e.getDepartment().equals(department))
      .toList();

    if (departmentEmployees.isEmpty()) {
      throw new IllegalArgumentException("No employees found in the specified department");
    }

    return departmentEmployees.stream()
      .mapToDouble(Employee::getSalary)
      .average()
      .orElse(0.0);
  }
}