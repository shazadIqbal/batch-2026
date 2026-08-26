package Flight_Reservation_System;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        FlightReservationSystem system = new FlightReservationSystem();

        int choice;

        do {

            System.out.println(" FLIGHT RESERVATION SYSTEM");
            System.out.println("--------------------------");
            System.out.println("1. Add Flight");
            System.out.println("2. Add Passenger");
            System.out.println("3. Make Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. View Flights");
            System.out.println("6. View Passengers");
            System.out.println("7. View Reservations");
            System.out.println("8. Cancel Flight");
            System.out.println("9. View Passenger Reservations");
            System.out.println("10. View Flight Passengers");
            System.out.println("11. Display Seat Map");
            System.out.println("12. Display Statistics");
            System.out.println("13. Display Revenue");
            System.out.println("0. Exit");

            System.out.print("\nWhat do you want to do? ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("\nADD FLIGHT");
                    System.out.print("Enter Flight Number: ");
                    String flightNumber = input.nextLine();

                    if (system.searchFlight(flightNumber) != null) {
                        System.out.println("Flight number already exists.");
                        break;
                    }

                    System.out.print("Enter Source: ");
                    String source = input.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = input.nextLine();

                    System.out.print("Enter Total Seats: ");
                    int totalSeats = input.nextInt();

                    System.out.print("Enter Ticket Price: ");
                    double ticketPrice = input.nextDouble();
                    input.nextLine();

                    system.addFlight(
                            flightNumber,
                            source,
                            destination,
                            totalSeats,
                            ticketPrice
                    );

                    break;

                case 2:

                    System.out.println("\nADD PASSENGER");

                    System.out.print("Enter Passenger ID: ");
                    String id = input.nextLine();

                    if (system.searchPassenger(id) != null) {
                        System.out.println("Passenger ID already exists.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Email: ");
                    String email = input.nextLine();

                    System.out.print("Enter Passport Number: ");
                    String passportNumber = input.nextLine();

                    system.addPassenger(
                            id,
                            name,
                            email,
                            passportNumber
                    );

                    break;


                case 3:

                    System.out.println("\nMAKE RESERVATION");

                    System.out.print("Enter Passenger ID: ");
                    String passengerId = input.nextLine();

                    // Check passenger first
                    if (system.searchPassenger(passengerId) == null) {
                        System.out.println("Passenger not found.");
                        break;
                    }

                    System.out.print("Enter Flight Number: ");
                    String reserveFlight = input.nextLine();

                    // Check flight
                    if (system.searchFlight(reserveFlight) == null) {
                        System.out.println("Flight not found.");
                        break;
                    }

                    System.out.print("Enter Seat Number: ");
                    int seatNumber = input.nextInt();
                    input.nextLine();

                    system.makeReservation(
                            passengerId,
                            reserveFlight,
                            seatNumber
                    );

                    break;

                case 4:

                    System.out.println("\nCANCEL RESERVATION");

                    System.out.print("Enter Reservation ID: ");
                    String reservationId = input.nextLine();

                    system.cancelReservation(reservationId);

                    break;

                case 5:

                    System.out.println("\nFLIGHTS");

                    system.viewFlights();

                    break;

                case 6:

                    System.out.println("\nPASSENGERS");

                    system.viewPassengers();

                    break;


                case 7:

                    System.out.println("\nRESERVATIONS");

                    system.viewReservations();

                    break;

                case 8:

                    System.out.println("\nCANCEL FLIGHT");

                    System.out.print("Enter Flight Number: ");
                    String cancelFlight = input.nextLine();

                    system.changeFlightStatus(
                            cancelFlight,
                            FlightStatus.CANCELLED
                    );

                    break;

                case 9:

                    System.out.println("\nPASSENGER RESERVATIONS");

                    System.out.print("Enter Passenger ID: ");
                    String passengerIdForReservations = input.nextLine();

                    system.viewPassengerReservations(
                            passengerIdForReservations
                    );

                    break;

                case 10:

                    System.out.println("\nFLIGHT PASSENGERS");

                    System.out.print("Enter Flight Number: ");
                    String flightNumberForPassengers = input.nextLine();

                    system.viewFlightPassengers(
                            flightNumberForPassengers
                    );

                    break;

                case 11:

                    System.out.println("\nSEAT MAP");

                    System.out.print("Enter Flight Number: ");
                    String seatMapFlight = input.nextLine();

                    system.displaySeatMap(seatMapFlight);

                    break;

                case 12:

                    System.out.println("\nSTATISTICS");

                    system.displayStatistics();

                    break;

                case 13:

                    System.out.println("\nREVENUE");

                    system.displayRevenue();

                    break;

                case 0:

                    System.out.println("\nThank you for using Flight Reservation System.");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0); {

            input.close();
        }
    }
}