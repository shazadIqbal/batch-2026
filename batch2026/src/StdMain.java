import java.util.*;

public class StdMain {
    public static void main(String[] args) {

        Course eng = new Course(1, "English");
        Course math = new Course(2, "Maths");
        Course urdu = new Course(3, "Urdu");
        Course sci = new Course(4, "Science");

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Taha", 1, Arrays.asList(eng,urdu)));
        studentList.add(new Student("Ali", 2, Arrays.asList(eng, math)));
        studentList.add(new Student("Ahsan", 3, new ArrayList<>()));//  SHOWS NO COURSES
        studentList.add(new Student("Ahmed", 4, Arrays.asList(sci, urdu, eng)));

        //to iterate each index
//        for ( int i = 0; i < studentList.size() ; i++ ) {
//            System.out.println(studentList.get(i));
//        }

//        // to iterate using elements in array
//        for(Student s : studentList){
//            System.out.println(s);
//        }
//
        // -> lambda
        studentList.forEach(s -> System.out.println(s));
        System.out.println();

        studentList.forEach(s -> System.out.println(s.getName()));

//        //sets
//        Set<Student> student = new HashSet<>();
//
//        student.add(new Student("Ali", 1, ));


    }




}
