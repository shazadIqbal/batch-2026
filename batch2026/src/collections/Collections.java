package collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

        Course math = new Course(1, "Math");
        Course science = new Course(2, "Science");
        Course english = new Course(3, "English");

        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1, "Ali", Arrays.asList(math,english));
        Student student2 = new Student (2, "Ahmed", Arrays.asList(math));
        Student student3 = new Student(3, "Taha", Arrays.asList(math,science));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student s : studentList) {
            for (Course c : s.getCourseList()){
                if("Science".equalsIgnoreCase(c.getName())){
                    System.out.println(s.getName());
                }
            }

        }

//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"Ali");
//        map.put(2,"Ahmed");
//        map.put(3,"Hammad");
//
//        System.out.println(map.get(3));
//
//        for (Map.Entry record : map.entrySet()) {
//            System.out.println(record.getKey());
//            System.out.println(record.getValue());
//        }
//
//        List <String> names = new ArrayList<>();
//        names.add("Ali");
//        names.add("Junain");
//        names.add("Taha");
//        names.add("Hammad");
//        names.add("Ahmed");
//        names.add("asim");
//
//        System.out.println(names);
//
//        for (String name : names) {
//
////            name.length>==3;
//            int three = 3;
//            if (name.length()>three){
//                System.out.println(name);
//            }
//            if (name.startsWith("A") || name.startsWith("a")){
//                System.out.println(name);
//            }
        }

}
