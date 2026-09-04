package com._03_09_26;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Employee> list = new ArrayList<>();
//
//        list.add(new Employee("Ali",1,Department.IT));
//        list.add(new Employee("Ahmed",2,Department.ADMIN));
//        list.add(new Employee("Zunail",3,Department.HR));
//        list.add(new Employee("Ahad",4,Department.IT));
//
////        for (Employee e : list){
////            System.out.println(e);
////       }
//
////        List<String> names = new ArrayList<>();
//
//
//
//        List<String> names = list.stream()
//                .filter(e-> e.getName().startsWith("A"))
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//
////        names.forEach(System.out :: println);
//
//        List<String> hrNames = list.stream()
//                .filter(e-> e.getDepartment().equals(Department.HR))
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//
//        hrNames.forEach(System.out :: println);
//
//        Long count = list.stream().
//                filter(e -> e.getDepartment().equals(Department.IT))
//                .count();
//        System.out.println(count);

        List<Integer> list = List.of(1,2,2,4,6,6,7,8,9);

        list.stream()
                .filter(n-> n % 2 == 0)
                .forEach(System.out :: println);

        List<Integer> evens = list.stream()
                .filter(n-> n % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        evens.forEach(System.out :: println);
    }
}
