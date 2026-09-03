package com.movie_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        cinema.setShowList(cinema.initShows());

        boolean flag = true;

        Scanner scanner = new Scanner(System.in);

        while(flag){
            System.out.println("1) view all shows");
            System.out.println("2) make booking");
            System.out.println("3) view booking");
            System.out.println("4) view booking by phone number");
            System.out.println("5) Exit");

            int input = scanner.nextInt();

            switch (input){

                case 1 :
                    cinema.viewAllShows();
                    break;

                case 2:
                    Customer customer = cinema.createCustomer(scanner);
                    System.out.println("Please tell the movie name");
                    String movieName = scanner.next();
                    cinema.makeBooking(customer,movieName);
                    break;


                case 3:
                    cinema.viewBookings();
                    break;


                case 4:
                    System.out.println("Please enter customer phone number:");
                    String phoneNumber = scanner.next();
                    cinema.viewBookingByPhoneNumber(phoneNumber);
                    break;


                case 5:
                    flag = false;
                    break;

            }


        }



    }




}
