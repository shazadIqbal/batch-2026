package Collection2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1 - Display Employees");
            System.out.println("2 - Search Employee By ID");
            System.out.println("3 - Remove Employee");
            System.out.println("4 - Add Employee");
            System.out.println("5 - Update Employee Salary");
            System.out.println("6 - Update Employee Department");
            System.out.println("7 - Highest Salary Employee");
            System.out.println("8 - Exit");

            System.out.print("Enter your choice: ");
            int input = sc.nextInt();

            switch (input) {

                case 1:
                    es.displayEmployees();
                    break;

                case 2:
                    System.out.print("Please enter the ID: ");
                    Integer id = sc.nextInt();

                    System.out.println(es.searchEmployee(id));
                    break;

                case 3:
                    System.out.print("Please enter the ID: ");
                    Integer removeId = sc.nextInt();

                    es.removeEmployee(removeId);
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    Integer employeeId = sc.nextInt();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.next();

                    System.out.print("Enter Department: ");
                    String department = sc.next();

                    System.out.print("Enter Salary: ");
                    Double salary = sc.nextDouble();

                    Employee employee = new Employee(
                            employeeId,
                            name,
                            department,
                            salary
                    );

                    es.addEmployee(employee);
                    System.out.println("Employee Added Successfully");
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    Integer salaryId = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    Double newSalary = sc.nextDouble();

                    es.updateEmployeeSalary(salaryId, newSalary);
                    break;

                case 6:
                    System.out.print("Enter Employee ID: ");
                    Integer departmentId = sc.nextInt();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.next();

                    es.updateEmployeeDepartment(
                            departmentId,
                            newDepartment
                    );
                    break;

                case 7:
                    System.out.println(
                            es.highestSalaryEmployee()
                    );
                    break;

                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.println("====================");
        }
    }
}