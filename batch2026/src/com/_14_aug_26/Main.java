package com._14_aug_26;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

//        Set<String> names  = new TreeSet<>();
//        Set<String> names  = new TreeSet<>();
//
//        names.add("Bilal");
//        names.add("Taha");
//        names.add("Adil");
//        names.add("Ali");
//        names.add("Ahmed");
//
//        for(String name: names){
//            System.out.println(name);
//        }

        Set<Employee> employeeSet  = new TreeSet<>();

        employeeSet.add(new Employee(1,"Ahmed"));
        employeeSet.add(new Employee(1,"Ahmed"));
        employeeSet.add(new Employee(3,"Bilal"));
        employeeSet.add(new Employee(4,"Ali"));
        employeeSet.add(new Employee(5,"Azam"));
        employeeSet.add(new Employee(6,"Anas"));


        for(Employee e: employeeSet) {
            System.out.println(e);
        }

    }
}
