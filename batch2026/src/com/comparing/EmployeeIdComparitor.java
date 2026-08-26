package com.comparing;

import com.collections_3.Employee;

import java.util.Comparator;

public class EmployeeIdComparitor implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getId().compareTo(e1.getId());
    }
}
