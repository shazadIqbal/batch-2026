package Collection2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(1, "Ali", "IT", 25000.0));
        employeeList.add(new Employee(2, "Ahmed", "IT", 25000.0));
        employeeList.add(new Employee(3, "Raza", "MARKETING", 15000.0));
        employeeList.add(new Employee(4, "Ahsan", "MARKETING", 12000.0));
        employeeList.add(new Employee(5, "Taha", "ADMIN", 12000.0));
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
            System.out.println("Employee is not found: " + id);
        }
    }

    public void displayEmployees() {
        employeeList.forEach(e -> System.out.println(e));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void updateEmployeeSalary(Integer id, Double salary) {

        Employee employee = searchEmployee(id);

        if (employee != null) {
            employee.setSalary(salary);
            System.out.println("Employee Salary Updated");
        } else {
            System.out.println("Employee not found");
        }
    }

    public void updateEmployeeDepartment(Integer id, String department) {

        Employee employee = searchEmployee(id);

        if (employee != null) {
            employee.setDepartment(department);
            System.out.println("Employee Department Updated");
        } else {
            System.out.println("Employee not found: " + id);
        }
    }

    public Employee highestSalaryEmployee() {

        Employee maxSalaryEmployee = employeeList.get(0);

        for (Employee e : employeeList) {

            if (e.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = e;
            }
        }

        return maxSalaryEmployee;
    }

    //search on department
    //list

    public List<Employee> searchEmployeeDepartmentWise (String department) {

        List<Employee> list = new ArrayList<>();
        for (Employee e : employeeList) {
            if (department.equalsIgnoreCase(e.getDepartment())) {
                list.add(e);
            }
        }

        return list;

    }

}

