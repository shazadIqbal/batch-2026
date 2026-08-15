package com._13_aug;

public class Main {
    public static void main(String[] args) {

        EmployeeService es = new EmployeeService();
        System.out.println(es.searchEmployee(7));

        es.displayEmployees();


    }
}
