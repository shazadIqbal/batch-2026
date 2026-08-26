package com.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections {

    public static void main(String[] args) {


        // Customer
        // id
        // name
        // phone num

        // Movie
        // id
        // name
        // genre
        // duration

        // Booking
        // Show show;
        // Customer;


        //Cinema
        // List<Booking> bookings;
        // List<Show> shows;


        // Show
        // Movie
        // LocalDataTime start;
        // price
        // totalSeat;
        // availableSeats;


        // basic busniess flow
        // 1) view shows
        // 2) search shows by date
        // 3) search shows by movie name
        // 1) customer can book a show with single or multiples seats;
        // 2)




        Course english = new Course(1,"ENGLISH");
        Course urdu = new Course(2,"URDU");
        Course math = new Course(3,"MATH");
        Course science = new Course(4,"SCIENCE");


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1,"Taha", Arrays.asList(english,urdu)));
        studentList.add(new Student(2,"ALI",Arrays.asList(english,math)));
        studentList.add(new Student(3,"Adil",new ArrayList<>()));
        studentList.add(new Student(4,"Sami",Arrays.asList(science,urdu,english)));


        // -> lambda
        studentList.forEach(s -> System.out.println(s));


















        //        List<String> names = new ArrayList<>();
//        names.add("ALI");
//        names.add("TAHA");
//        names.add("ADIL");
//        names.add("SAMI");
//
//        //System.out.println(names);
//
//        //names[0]
////        for (int i = 0; i < names.size() ; i++) {
////            System.out.println(names.get(i));
////        }
//
////        for(String n : names){
////            System.out.println(n);
////        }
//
//        // referencing CLASS::method
//        names.forEach(el -> System.out.println(el));

    }
}
