package com._27_08_26;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ayesha",Gender.F));
        studentList.add(new Student("Ali",Gender.M));
        studentList.add(new Student("Ahmed",Gender.M));
        studentList.add(new Student("Rida",Gender.F));
        studentList.add(new Student("Zoheb",Gender.M));


        Collections.sort(studentList);

        studentList.forEach(student -> System.out.println(student));

//        Map<Gender, Integer> map = new HashMap<>();
//
//        for (Student s: studentList){
//            if (map.containsKey(s.getGender())){
//                int val = map.get(s.getGender()) + 1;
//                map.put(s.getGender(),val);
//            }else{
//                map.put(s.getGender(),1);
//            }
//        }
//        System.out.println(map);
    }
}
