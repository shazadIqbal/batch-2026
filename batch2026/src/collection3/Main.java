package collection3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<Employee> employeeSet = new TreeSet<>();
        employeeSet.add(new Employee(1,"ALI")); //same hash because of equal override both int and and string
        employeeSet.add(new Employee(2,"TAHA"));
        employeeSet.add(new Employee(1,"ALI")); //same hash because of equal override both int and and string
        employeeSet.add(new Employee(3,"AHMED"));
        employeeSet.add(new Employee(4,"AHSAN"));
        employeeSet.add(new Employee(5,"ADIL"));




        Set <String> names = new TreeSet<>();

        names.add("Ali");
        names.add("Taha");
        names.add("Adil");
        names.add("Ahmed");
        names.add("Ali");

//        Set<String> names = new HashSet<>();

//        Set<Employee> employeeSet = new HashSet<>();

//        employeeSet.add(new Employee(1,"ALI")); //same hash because of equal override both int and and string
//        employeeSet.add(new Employee(2,"TAHA"));
//        employeeSet.add(new Employee(1,"ALI")); //same hash because of equal override both int and and string
//        employeeSet.add(new Employee(3,"AHMED"));
//        employeeSet.add(new Employee(4,"AHSAN"));
//        employeeSet.add(new Employee(5,"ADIL"));


        for (Employee e : employeeSet) {
            System.out.println(e);
        }


        names.add("Ali");
        names.add("Taha");
        names.add("Adil");
        names.add("Ali");
        names.add("Ahmed");
        names.add("ALI");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
