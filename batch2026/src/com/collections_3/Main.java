package com.collections_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        //desc me apko Comparator.reverseOrder()
//        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
//
//        names.add("Ali"); //->dwada123
//        names.add("Taha");
//        names.add("Adil");
//        names.add("Ali"); // -> dwada123
//        names.add("Ahmed");
//
//
//
//        for (String name : names){
//            System.out.println(name);
//        }


        Set<Employee> employeeSet = new TreeSet<>();

        employeeSet.add(new Employee(1,"ALI"));
        employeeSet.add(new Employee(1,"TAHA"));
        employeeSet.add(new Employee(3,"AHMED"));
        employeeSet.add(new Employee(4,"AHSAN"));
        employeeSet.add(new Employee(1,"ALI"));
        employeeSet.add(new Employee(5,"ADIL"));


        for (Employee e : employeeSet){
            System.out.println(e);
        }


    }
}
