package com._13_aug;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(1, "Ali", "IT", 25000.0));
        employeeList.add(new Employee(2, "Ahmed", "IT", 25000.0));
        employeeList.add(new Employee(3, "Raza", "MARKETING", 15000.0));
        employeeList.add(new Employee(4, "Ahsan", "MARKETING", 12000.0));
        employeeList.add(new Employee(5, "Taha", "ADMIN", 5000.0));
    }

    public List<Employee> addEmployee(Employee employee) {
        employeeList.add(employee);
        return employeeList;
    }

    public Employee searchEmployee(Integer id) {
        for (Employee e : employeeList) {
            if (e.getId().equals(id)) {
                return e;
            }
        }

        return null;
    }

    public void removeEmployee(Integer id) {
        Employee found = searchEmployee(id);

        if (found != null) {
            employeeList.remove(found);
            System.out.println("Successfully Removed");
        } else {
            System.out.println("Employee not found on " + id);
        }
    }

    public void displayEmployees() {
        employeeList.forEach(employee -> System.out.println(employee));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void updateEmployeeSalary(Integer id, Double salary) {
        Employee found = searchEmployee(id);

        if (found != null) {
            found.setSalary(salary);
            System.out.println("Salary Updated Successfully");
        } else {
            System.out.println("Employee not found on " + id);
        }
    }
    public void updateEmployeeDepartment(Integer id, String department) {
        Employee found = searchEmployee(id);

        if (found != null) {
            found.setDepartment(department);
            System.out.println("Department Updated Successfully");
        } else {
            System.out.println("Employee not found on " + id);
        }
    }
    public Employee highestSalaryEmployee() {
        Employee highest = employeeList.get(0);

        for (Employee employee : employeeList) {
            if (employee.getSalary() > highest.getSalary()) {
                highest = employee;
            }
        }

        return highest;
    }

    public List<Employee> searchEmployeeDepartmentWise(String department) {
        List<Employee> employees = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                employees.add(employee);
            }
        }

        return employees;
    }
}