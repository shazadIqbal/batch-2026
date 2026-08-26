package com.comparing;

import com.collections_3.Employee;

import java.util.Comparator;

public class EmployeeNameComparitor implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
