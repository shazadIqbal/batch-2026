package com.collections_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println(" 1  - Display employees");
            System.out.println(" 2  - Search employee by id ");
            System.out.println(" 3  - Remove employee by id ");
            System.out.println(" 4  - Add employee ");
            System.out.println(" 5  - Update employee salary ");
            System.out.println(" 10 - Exit ");

            int input = sc.nextInt();

                switch (input){
                    case 1:
                        es.displayEmployees();
                        break;

                    case 2:
                        System.out.println("Please enter the Id :");
                        Integer id1 = sc.nextInt();
                        System.out.println(es.searchEmployee(id1));
                        break;

                    case 3:
                        System.out.println("Please enter the Id :");
                        Integer id2 = sc.nextInt();
                        es.removeEmployee(id2);
                        break;

                    case 4:
                        System.out.println("Please enter the Id :");
                        Integer empId = sc.nextInt();
                        System.out.println("Please Enter the name : ");
                        String name = sc.next();
                        System.out.println("Please Enter the department : ");
                        String department = sc.next();
                        System.out.println("Please Enter Salary : ");
                        Double salary = sc.nextDouble();
                        Employee employee = new Employee(empId,name,department,salary);
                        es.addEmployee(employee);
                        break;

                    case 5:
                        System.out.println("Please enter the Id :");
                        Integer id3 = sc.nextInt();
                        System.out.println("Please Enter the salary : ");
                        Double salary2 = sc.nextDouble();
                        es.updateEmployeeSalary(id3,salary2);
                        break;

                    case 10:
                        System.exit(1);
                        break;
                }

            System.out.println(" =====================  ");
        }

    }
}
