package com._12_aug_26;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course math = new Course(1, "Math");
        Course science = new Course(2, "Science");
        Course english = new Course(3, "English");


        // List<Course> courseList = new ArrayList<>();
        // courseList.add(math);
        // courseList.add(science);
        // courseList.add(english);


        Student student1 = new Student(1, "Ali", Arrays.asList(math, english));
        Student student2 = new Student(2, "Ahmed", Arrays.asList(math));
        Student student3 = new Student(3, "Taha", Arrays.asList(math, science));


        List<Student> studentList = new ArrayList<>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student s : studentList) {
            System.out.println(s);
        }


    }
}