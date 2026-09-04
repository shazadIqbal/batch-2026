package com.movie_assignment;

import java.util.*;

public class Main {

    // implement LinkedList ,
    public static void main(String[] args) {

//        Cinema cinema = new Cinema();
//        cinema.setShowList(cinema.initShows());
//
//        boolean flag = true;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while(flag){
//            System.out.println("1) view all shows");
//            System.out.println("2) make booking");
//            System.out.println("3) view booking");
//            System.out.println("4) view booking by customer phone");
//            System.out.println("5) Exit");
//
//            int input = scanner.nextInt();
//
//            switch (input){
//
//                case 1 :
//                    cinema.viewAllShows();
//                    break;
//
//                case 2:
//                    Customer customer = cinema.createCustomer(scanner);
//                    System.out.println("Please tell the movie name");
//                    String movieName = scanner.next();
//                    cinema.makeBooking(customer,movieName);
//                    break;
//
//
//                case 3:
//                    cinema.viewAllBookings();
//                    break;
//
//                case 4:
//                    // view booking with customer phone number
//                    System.out.println("Please enter customer phone number");
//                    String phone = scanner.next();
//                    cinema.viewBookingByCustomerPhone(phone);
//                    break;
//
//                case 5:
//                    flag = false;
//                    break;
//
//            }
//
//
//        }
//
//

        Set<Plane> treeSetPlane = new TreeSet<>();
        treeSetPlane.add(new Plane("PIA 747"));
        treeSetPlane.add(new Plane("AIR Blue A320"));
        treeSetPlane.add(new Plane("AIR Blue A320"));

        System.out.println(treeSetPlane);

        Set<Plane> hashSetPlane = new HashSet<>();
        hashSetPlane.add(new Plane("PIA 747"));
        hashSetPlane.add(new Plane("AIR Blue A320"));
        hashSetPlane.add(new Plane("Emirates 7787"));


        Set<Plane> linkedHashSetPlane = new LinkedHashSet<>(0);

        linkedHashSetPlane.add(new Plane("PIA 747"));
        linkedHashSetPlane.add(new Plane("AIR Blue A320"));
        linkedHashSetPlane.add(new Plane("Emirates 7787"));


    }

}
