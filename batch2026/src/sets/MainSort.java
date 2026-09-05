package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ahsan", Gender.MALE));
        studentList.add(new Student("Taha", Gender.MALE));
        studentList.add(new Student("Adil", Gender.MALE));
        studentList.add(new Student("Hira", Gender.FEMALE));
        studentList.add(new Student("Alima", Gender.FEMALE));

//        Collections.sort(studentList);
        Collections.sort(studentList, Comparator.comparing (Student :: getName));
        Collections.sort(studentList, Comparator.comparing (Student :: getGender));

        studentList.forEach(s -> System.out.println(s));
    }
}
