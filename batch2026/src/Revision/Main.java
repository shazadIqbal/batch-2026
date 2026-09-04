package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        EasyPaisa es = new EasyPaisa();
//        es.pay();
//
//        JazzCash jz = new JazzCash();
//        jz.pay();

//        List<String> names = new ArrayList<>();
//        names.add("Ali");
//        names.add("Taha");
//        names.add("Adil");
//        names.add("Sami");
//
//        System.out.pritln(names);
//
//        for (int i = 0 ; i <names.size() ; i++) {
//            System.out.println(names.get(i));
//        }
//
//        for (String n : names) {
//            System.out.println(n);
//        }
//
//        names.forEach( el -> System.out.println(el));



        Course english = new Course(1,"English");
        Course urdu = new Course(2,"Urdu");
        Course math = new Course(3,"Math");
        Course science = new Course(4,"Science");

        //creating without object
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("hammamd" , 1 , Arrays.asList(english , urdu)));
        studentList.add(new Student("asim" , 2 , Arrays.asList(english,math)));
        studentList.add(new Student("ahmed" , 3 , Arrays.asList()));
        studentList.add(new Student("hammamd" , 4 , Arrays.asList(science)));


        studentList.forEach(el -> {
            System.out.println(el.name);
        });


    }
}
