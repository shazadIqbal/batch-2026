package com.Exception_Handling;

public class Main2 {

    public static void main(String[] args) {

        try {

            Employee employee = new Employee(
                    1,
                    "Ali",
                    "IT",
                    -50000.0
            );

            System.out.println(employee);

        } catch (InvalidSalaryException e) {

            System.out.println("Exception: " + e.getMessage());
        }
    }
}