package com.stream_practice;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

//        List<Employee> list = new ArrayList<>();
//
//        list.add(new Employee(1,"TAHA",Department.ADMIN));
//        list.add(new Employee(2,"ALI",Department.HR));
//        list.add(new Employee(3,"AHMED",Department.IT));
//        list.add(new Employee(4,"SHAHZAD",Department.IT));
//        list.add(new Employee(5,"RAZA",Department.IT));
//        list.add(new Employee(6,"ADIL",Department.HR));
//
//        for(Employee employee : list){
//            System.out.println(employee);
//        }
//
//        List<String> names = list.stream()
//                .filter(e -> e.getName().startsWith("A"))
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//
//        List<String> HrNames = list.stream()
//                .filter(e-> e.getDepartment().equals(Department.HR))
//                .map(Employee::getName)
//                .collect(Collectors.toList());
//
//        Long count = list.stream()
//                .filter(e->e.getDepartment().equals(Department.IT))
//                .count();
//        System.out.println(count);
//        //11
//
//       // names.forEach(System.out :: println);
//
//        HrNames.forEach(System.out::println);
//

        List<Integer> list = List.of(1,8,12,4,5,21,33,2,12,4);

        List<Integer> evens = list.stream()
                .filter(n-> n % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(evens);



        String str = "Hello this is programming , welcome to java";
        // a, p ,e , i
        //




    }
}
