// src/main/java/com/example/Employee.java

package com.example;

/**
 * Represents an employee with a name, department, and salary.
 */
public class Employee {
  private String _name;
  private String _department;
  private double _salary;

  public String getName() {
    return _name;
  }

  public void setName(String name) {
    this._name = name;
  }

  public String getDepartment() {
    return _department;
  }

  public void setDepartment(String department) {
    this._department = department;
  }

  public double getSalary() {
    return _salary;
  }

  public void setSalary(double salary) {
    this._salary = salary;
  }
}