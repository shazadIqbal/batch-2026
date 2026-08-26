package FlightReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FlightReservationSystem system = new FlightReservationSystem();

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       FLIGHT RESERVATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1.  Add Flight");
            System.out.println("2.  View Flights");
            System.out.println("3.  Search Flight");
            System.out.println("4.  Search Flights by Route");
            System.out.println("5.  Add Passenger");
            System.out.println("6.  View Passengers");
            System.out.println("7.  Search Passenger");
            System.out.println("8.  Make Reservation");
            System.out.println("9.  Cancel Reservation");
            System.out.println("10. View Reservations");
            System.out.println("11. View Passenger Reservations");
            System.out.println("12. View Flight Passengers");
            System.out.println("13. View Seat Map");
            System.out.println("14. Cancel Flight");
            System.out.println("15. Delete Flight");
            System.out.println("16. Delete Passenger");
            System.out.println("17. Sort Flights");
            System.out.println("18. Sort Passengers");
            System.out.println("19. Display Statistics");
            System.out.println("20. Display Revenue");
            System.out.println("21. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // =========================================
                // 1. ADD FLIGHT
                // =========================================

                case 1:

                    System.out.print("Enter flight number: ");
                    String flightNumber = scanner.nextLine();

                    System.out.print("Enter source: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();

                    System.out.print("Enter total seats: ");
                    int totalSeats = scanner.nextInt();

                    System.out.print("Enter ticket price: ");
                    double ticketPrice = scanner.nextDouble();
                    scanner.nextLine();

                    system.addFlight(
                            flightNumber,
                            source,
                            destination,
                            totalSeats,
                            ticketPrice
                    );

                    break;


                // =========================================
                // 2. VIEW FLIGHTS
                // =========================================

                case 2:

                    system.viewFlights();

                    break;


                // =========================================
                // 3. SEARCH FLIGHT
                // =========================================

                case 3:

                    System.out.print("Enter flight number: ");
                    String searchFlightNumber = scanner.nextLine();

                    Flight flight = system.searchFlight(searchFlightNumber);

                    if (flight != null) {
                        System.out.println(flight);
                    }

                    break;


                // =========================================
                // 4. SEARCH BY ROUTE
                // =========================================

                case 4:

                    System.out.print("Enter source: ");
                    String searchSource = scanner.nextLine();

                    System.out.print("Enter destination: ");
                    String searchDestination = scanner.nextLine();

                    ArrayList<Flight> routeFlights =
                            system.searchFlightsByRoute(
                                    searchSource,
                                    searchDestination
                            );

                    if (routeFlights.isEmpty()) {

                        System.out.println("No flights found for this route.");

                    } else {

                        System.out.println("----- Flights Found -----");

                        for (Flight f : routeFlights) {
                            System.out.println(f);
                        }
                    }

                    break;


                // =========================================
                // 5. ADD PASSENGER
                // =========================================

                case 5:

                    System.out.print("Enter passenger ID: ");
                    int passengerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter passenger name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter passport number: ");
                    String passportNumber = scanner.nextLine();

                    System.out.println();
                    System.out.println("Select passenger type:");
                    System.out.println("1. Adult");
                    System.out.println("2. Child");
                    System.out.println("3. Senior");

                    System.out.print("Enter type: ");
                    int passengerType = scanner.nextInt();
                    scanner.nextLine();

                    Passenger passenger;

                    if (passengerType == 1) {

                        passenger = new AdultPassenger(
                                passengerId,
                                name,
                                email,
                                passportNumber
                        );

                    } else if (passengerType == 2) {

                        passenger = new ChildPassenger(
                                passengerId,
                                name,
                                email,
                                passportNumber
                        );

                    } else if (passengerType == 3) {

                        passenger = new SeniorPassenger(
                                passengerId,
                                name,
                                email,
                                passportNumber
                        );

                    } else {

                        System.out.println("Invalid passenger type.");
                        break;
                    }

                    system.addPassenger(passenger);

                    break;


                // =========================================
                // 6. VIEW PASSENGERS
                // =========================================

                case 6:

                    system.viewPassengers();

                    break;


                // =========================================
                // 7. SEARCH PASSENGER
                // =========================================

                case 7:

                    System.out.print("Enter passenger ID: ");
                    int searchPassengerId = scanner.nextInt();
                    scanner.nextLine();

                    Passenger foundPassenger =
                            system.searchPassenger(searchPassengerId);

                    if (foundPassenger != null) {
                        foundPassenger.displayDetails();
                    }

                    break;


                // =========================================
                // 8. MAKE RESERVATION
                // =========================================

                case 8:

                    System.out.print("Enter passenger ID: ");
                    int reservationPassengerId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter flight number: ");
                    String reservationFlightNumber = scanner.nextLine();

                    System.out.print("Enter seat number: ");
                    int seatNumber = scanner.nextInt();
                    scanner.nextLine();

                    system.makeReservation(
                            reservationPassengerId,
                            reservationFlightNumber,
                            seatNumber
                    );

                    break;


                // =========================================
                // 9. CANCEL RESERVATION
                // =========================================

                case 9:

                    System.out.print("Enter reservation ID: ");
                    String reservationId = scanner.nextLine();

                    system.cancelReservation(reservationId);

                    break;


                // =========================================
                // 10. VIEW RESERVATIONS
                // =========================================

                case 10:

                    system.viewReservations();

                    break;


                // =========================================
                // 11. VIEW PASSENGER RESERVATIONS
                // =========================================

                case 11:

                    System.out.print("Enter passenger ID: ");
                    int passengerReservationId = scanner.nextInt();
                    scanner.nextLine();

                    system.viewPassengerReservations(
                            passengerReservationId
                    );

                    break;


                // =========================================
                // 12. VIEW FLIGHT PASSENGERS
                // =========================================

                case 12:

                    System.out.print("Enter flight number: ");
                    String passengerFlightNumber = scanner.nextLine();

                    system.viewFlightPassengers(
                            passengerFlightNumber
                    );

                    break;


                // =========================================
                // 13. VIEW SEAT MAP
                // =========================================

                case 13:

                    System.out.print("Enter flight number: ");
                    String seatMapFlightNumber = scanner.nextLine();

                    system.viewSeatMap(seatMapFlightNumber);

                    break;


                // =========================================
                // 14. CANCEL FLIGHT
                // =========================================

                case 14:

                    System.out.print("Enter flight number: ");
                    String cancelFlightNumber = scanner.nextLine();

                    system.cancelFlight(cancelFlightNumber);

                    break;


                // =========================================
                // 15. DELETE FLIGHT
                // =========================================

                case 15:

                    System.out.print("Enter flight number: ");
                    String deleteFlightNumber = scanner.nextLine();

                    system.deleteFlight(deleteFlightNumber);

                    break;


                // =========================================
                // 16. DELETE PASSENGER
                // =========================================

                case 16:

                    System.out.print("Enter passenger ID: ");
                    int deletePassengerId = scanner.nextInt();
                    scanner.nextLine();

                    system.deletePassenger(deletePassengerId);

                    break;


                // =========================================
                // 17. SORT FLIGHTS
                // =========================================

                case 17:

                    System.out.println();
                    System.out.println("Sort Flights By:");
                    System.out.println("1. Flight Number");
                    System.out.println("2. Available Seats");
                    System.out.println("3. Ticket Price");
                    System.out.println("4. Destination");

                    System.out.print("Enter choice: ");
                    int flightSortChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (flightSortChoice) {

                        case 1:
                            system.sortFlightsByFlightNumber();
                            break;

                        case 2:
                            system.sortFlightsByAvailableSeats();
                            break;

                        case 3:
                            system.sortFlightsByTicketPrice();
                            break;

                        case 4:
                            system.sortFlightsByDestination();
                            break;

                        default:
                            System.out.println("Invalid sorting choice.");
                    }

                    break;


                // =========================================
                // 18. SORT PASSENGERS
                // =========================================

                case 18:

                    System.out.println();
                    System.out.println("Sort Passengers By:");
                    System.out.println("1. Name");
                    System.out.println("2. ID");

                    System.out.print("Enter choice: ");
                    int passengerSortChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (passengerSortChoice) {

                        case 1:
                            system.sortPassengersByName();
                            break;

                        case 2:
                            system.sortPassengersById();
                            break;

                        default:
                            System.out.println("Invalid sorting choice.");
                    }

                    break;


                // =========================================
                // 19. STATISTICS
                // =========================================

                case 19:

                    system.displayStatistics();

                    break;


                // =========================================
                // 20. REVENUE
                // =========================================

                case 20:

                    system.displayRevenue();

                    break;


                // =========================================
                // 21. EXIT
                // =========================================

                case 21:

                    System.out.println("Exiting Flight Reservation System...");
                    running = false;

                    break;


                // =========================================
                // INVALID OPTION
                // =========================================

                default:

                    System.out.println("Invalid choice. Please select 1-21.");
            }
        }

        scanner.close();

        System.out.println("Program ended.");
    }
}