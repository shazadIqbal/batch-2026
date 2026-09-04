package com.map_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("TAHA",Gender.M));
        studentList.add(new Student("ALINA",Gender.F));
        studentList.add(new Student("ADIL",Gender.M));
        studentList.add(new Student("AHSAN",Gender.M));
        studentList.add(new Student("HIRA",Gender.F));

        Map<Gender,Integer> map = new HashMap<>();
        for(Student s : studentList){
            if(map.containsKey(s.getGender())){
                int val = map.get(s.getGender()) + 1;
                map.put(s.getGender(),val);
            }else{
                map.put(s.getGender(),1);
            }
        }

        System.out.println(map);

        //output
        // M -> 3
        // F -> 2
    }
}
