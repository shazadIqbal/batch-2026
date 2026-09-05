package sets;

import com.sun.java.accessibility.util.EventQueueMonitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ahsan");
        names.add("Zain");
        names.add("Taha");
        names.add("Ahmed");
        names.add("Ali");


        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                result.add(name);
                System.out.println(result);
            }
        }
        System.out.println();

        //streams
        names.stream()
                .filter(n -> n.startsWith("A"))

                .forEach(n -> System.out.println(n));

        List<String> filtered = names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println();


        //Employee
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(123, "Ahsan", Dept.ADMIN));
        list.add(new Employee(124, "Taha", Dept.ADMIN));
        list.add(new Employee(125, "Ali", Dept.HR));
        list.add(new Employee(126, "Ahmed", Dept.IT));

        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println();


        List<String> emp = new ArrayList<>();
        for (Employee e : list) {
            if (e.getName().startsWith("A")) {
                emp.add(e.getName());
                System.out.println(emp);
            }

        }
        System.out.println();

        List<String> nameA = list.stream().filter(e->e.getName().startsWith("A"))
                .map(Employee::getName)
                .collect(Collectors.toList());

                nameA.forEach(System.out::println);
        System.out.println();



        List<String> HrNames = list.stream().filter(e->e.getDept().equals(Dept.HR))
                .map(Employee::getName)
                .collect(Collectors.toList());
        HrNames.forEach(System.out::println);
        System.out.println();

        long count = list.stream().filter(e->e.getDept().equals(Dept.IT))
                .count();
        System.out.println(count);

    }
}