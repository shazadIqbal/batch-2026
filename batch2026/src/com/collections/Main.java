package com.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Course math = new Course(1,"Math");
        Course science = new Course(2,"Science");
        Course english = new Course(3,"English");

        List<Student> studentList = new ArrayList<>();

       Student student1 = new Student(1,"Ali",Arrays.asList(math,english));
       Student student2 = new Student(2,"Ahmed",Arrays.asList(math));
       Student student3 = new Student(3,"Taha",Arrays.asList(math,science));

       studentList.add(student1);
       studentList.add(student2);
       studentList.add(student3);

       for (Student s : studentList){
           for(Course c : s.getCourseList()){
               if("Science".equalsIgnoreCase(c.getName())){
                   System.out.println(s.getName());
               }
           }
       }


    }
}
