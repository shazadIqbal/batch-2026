package cinema;

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
         System.out.println("1 : View All Shows ");
         System.out.println("2 : Make Booking ");
         System.out.println("3 : View All Bookings ");
         System.out.println("4 : View Booking with Customer Phone Number ");
         System.out.println("5 : EXIT ");

         Integer input = scanner.nextInt();

         switch (input){

             case 1:
                 cinema.viewAllShows();

                 break;
             case 2:
                 Customer customer = cinema.createCustomer(scanner);
                 System.out.println("Please tell the movie name");
                 String movieName = scanner.next();
                 cinema.makeBooking(customer, movieName);
                 break;

             case 3:
                 cinema.viewAllBookings();
                         break;

             case 4:
                 System.out.println("Please enter customer phone number");
                 String phone = scanner.next();
                 cinema.viewBookingByCustomerPhone(phone);
                 break;

             case 5:
                 flag = false;
                 break;

         }
     }


    }

}
