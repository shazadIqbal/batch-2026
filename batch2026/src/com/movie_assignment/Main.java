package com.movie_assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cinema cinema = new Cinema();
        cinema.setShowList(cinema.initShows());

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\n--- MENU ---");
            System.out.println("1) View all shows");
            System.out.println("2) Make booking");
            System.out.println("3) View booking");
            System.out.println("4) View booking by customer phone");
            System.out.println("5) Exit");
            System.out.print("Select option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1:
                    cinema.viewAllShows();
                    break;

                case 2:
                    Customer customer = cinema.createCustomer(scanner);
                    System.out.println("Please tell the movie name:");
                    String movieName = scanner.nextLine();
                    cinema.makeBooking(customer, movieName);
                    break;

                case 3:
                    cinema.viewAllBookings();
                    break;

                case 4:
                    System.out.println("Please enter customer phone number:");
                    String phone = scanner.nextLine();
                    cinema.viewBookingByCustomerPhone(phone);
                    break;

                case 5:
                    flag = false;
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        System.out.println("\n--- SET DEMO ---");
        Set<Plane> treeSetPlane = new TreeSet<>();
        treeSetPlane.add(new Plane("PIA 747"));
        treeSetPlane.add(new Plane("AIR Blue A320"));
        treeSetPlane.add(new Plane("AIR Blue A320"));
        System.out.println("TreeSet: " + treeSetPlane);

        Set<Plane> hashSetPlane = new HashSet<>();
        hashSetPlane.add(new Plane("PIA 747"));
        hashSetPlane.add(new Plane("AIR Blue A320"));
        hashSetPlane.add(new Plane("Emirates 7787"));
        System.out.println("HashSet: " + hashSetPlane);

        Set<Plane> linkedHashSetPlane = new LinkedHashSet<>();
        linkedHashSetPlane.add(new Plane("PIA 747"));
        linkedHashSetPlane.add(new Plane("AIR Blue A320"));
        linkedHashSetPlane.add(new Plane("Emirates 7787"));
        System.out.println("LinkedHashSet: " + linkedHashSetPlane);

        scanner.close();
    }
}