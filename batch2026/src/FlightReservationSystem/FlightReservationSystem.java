package FlightReservationSystem;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Comparator;

public class FlightReservationSystem {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;
    private ArrayList<Reservation> reservations;

    public FlightReservationSystem() {
        flights = new ArrayList<>();
        passengers = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addFlight(String flightNumber, String source, String destination,
                          int totalSeats, double ticketPrice) {

        // Check if the flight number already exists
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                System.out.println("Flight number already exists.");
                return;
            }
        }

        // Check if total seats is valid
        if (totalSeats <= 0) {
            System.out.println("Total seats must be greater than zero.");
            return;
        }

        // Create the Flight object
        Flight flight = new Flight(
                flightNumber,
                source,
                destination,
                totalSeats,
                ticketPrice
        );

        // Add the Flight object to the ArrayList
        flights.add(flight);

        System.out.println("Flight added successfully.");
    }

    public void viewFlights() {

        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }

        System.out.println("----- All Flights -----");

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Flight searchFlight(String flightNumber) {

        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return flight;
            }
        }

        System.out.println("Flight not found.");
        return null;
    }
    public ArrayList<Flight> searchFlightsByRoute(String source, String destination) {

        ArrayList<Flight> results = new ArrayList<>();

        for (Flight flight : flights) {

            if (flight.getSource().equalsIgnoreCase(source)
                    && flight.getDestination().equalsIgnoreCase(destination)) {

                results.add(flight);
            }
        }

        return results;
    }

    public ArrayList<Flight> searchFlightsByAvailableSeats(int requiredSeats) {

        ArrayList<Flight> results = new ArrayList<>();

        if (requiredSeats <= 0) {
            System.out.println("Required seats must be greater than zero.");
            return new ArrayList<>();
        }

        for (Flight flight : flights) {

            if (flight.getAvailableSeats() >= requiredSeats) {
                results.add(flight);
            }
        }

        return results;
    }

    public void addPassenger(Passenger passenger) {

        if (passenger == null) {
            System.out.println("Passenger cannot be null.");
            return;
        }

        if (passenger.getName() == null || passenger.getName().trim().isEmpty()) {
            System.out.println("Passenger name cannot be empty.");
            return;
        }

        if (passenger.getEmail() == null || passenger.getEmail().trim().isEmpty()) {
            System.out.println("Passenger email cannot be empty.");
            return;
        }

        if (passenger.getPassportNumber() == null ||
                passenger.getPassportNumber().trim().isEmpty()) {
            System.out.println("Passport number cannot be empty.");
            return;
        }

        for (Passenger existingPassenger : passengers) {
            if (existingPassenger.getId().equals(passenger.getId())) {
                System.out.println("Passenger ID already exists.");
                return;
            }
        }

        passengers.add(passenger);

        System.out.println("Passenger added successfully.");
    }

    public void viewPassengers() {

        if (passengers.isEmpty()) {
            System.out.println("No passengers available.");
            return;
        }

        System.out.println("----- All Passengers -----");

        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }

    public Passenger searchPassenger(Integer id) {

        for (Passenger passenger : passengers) {

            if (passenger.getId().equals(id)) {
                return passenger;
            }
        }

        System.out.println("Passenger not found.");
        return null;
    }

    public void changeFlightStatus(String flightNumber, FlightStatus newStatus) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        if (newStatus == null) {
            System.out.println("Flight status cannot be null.");
            return;
        }

        flight.changeStatus(newStatus);

        System.out.println("Flight status changed to " + newStatus);
    }

    public void makeReservation(Integer passengerId, String flightNumber, int seatNumber) {

        Passenger passenger = searchPassenger(passengerId);

        if (passenger == null) {
            return;
        }

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        if (flight.getStatus() == FlightStatus.CANCELLED
                || flight.getStatus() == FlightStatus.DEPARTED
                || flight.getStatus() == FlightStatus.COMPLETED) {

            System.out.println("This flight cannot accept new reservations.");
            return;
        }

        if (flight.getAvailableSeats() <= 0) {
            System.out.println("No seats available on this flight.");
            return;
        }

        if (seatNumber < 1 || seatNumber > flight.getTotalSeats()) {
            System.out.println("Invalid seat number.");
            return;
        }

        for (Reservation reservation : reservations) {

            if (reservation.getFlight().equals(flight)
                    && reservation.getSeatNumber().equals(seatNumber)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("This seat is already reserved.");
                return;
            }
        }

        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().equals(passenger)
                    && reservation.getFlight().equals(flight)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Passenger already has an active reservation for this flight.");
                return;
            }
        }

        double finalPrice = passenger.calculateTicketPrice(
                flight.getTicketPrice()
        );

        Reservation reservation = new Reservation(
                passenger,
                flight,
                seatNumber,
                finalPrice
        );

        reservations.add(reservation);

        flight.decreaseAvailableSeats();

        System.out.println("Reservation created successfully.");
        System.out.println(reservation);
    }

    public void viewReservations() {

        if (reservations.isEmpty()) {
            System.out.println("No reservations available.");
            return;
        }

        System.out.println("----- All Reservations -----");

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    public void cancelReservation(String reservationId) {

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId().equalsIgnoreCase(reservationId)) {

                if (reservation.getReservationStatus() == ReservationStatus.CANCELLED) {
                    System.out.println("Reservation is already cancelled.");
                    return;
                }

                reservation.cancel();

                if (reservation.getPaymentStatus() == PaymentStatus.PAID) {
                    reservation.refund();
                }

                reservation.getFlight().increaseAvailableSeats();

                System.out.println("Reservation " + reservationId + " cancelled successfully.");
                return;
            }
        }

        System.out.println("Reservation not found.");
    }

    public void viewFlightPassengers(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        boolean found = false;

        System.out.println("----- Passengers on " + flight.getFlightNumber() + " -----");

        for (Reservation reservation : reservations) {

            if (reservation.getFlight().getFlightNumber().equalsIgnoreCase(flightNumber)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println(reservation.getPassenger());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No passengers found on this flight.");
        }
    }

    public void viewSeatMap(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        System.out.println("----- Seat Map for " + flight.getFlightNumber() + " -----");

        for (int seat = 1; seat <= flight.getTotalSeats(); seat++) {

            boolean reserved = false;

            for (Reservation reservation : reservations) {

                if (reservation.getFlight().getFlightNumber().equalsIgnoreCase(flightNumber)
                        && reservation.getSeatNumber() == seat
                        && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                    reserved = true;
                    break;
                }
            }

            if (reserved) {
                System.out.print(seat + " [X]  ");
            } else {
                System.out.print(seat + " [ ]  ");
            }
        }

        System.out.println();
    }

    public void cancelFlight(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        if (flight.getStatus() == FlightStatus.CANCELLED) {
            System.out.println("Flight is already cancelled.");
            return;
        }

        if (flight.getStatus() == FlightStatus.DEPARTED) {
            System.out.println("A departed flight cannot be cancelled.");
            return;
        }

        if (flight.getStatus() == FlightStatus.COMPLETED) {
            System.out.println("A completed flight cannot be cancelled.");
            return;
        }

        flight.changeStatus(FlightStatus.CANCELLED);

        for (Reservation reservation : reservations) {

            if (reservation.getFlight().equals(flight)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                reservation.cancel();

                if (reservation.getPaymentStatus() == PaymentStatus.PAID) {
                    reservation.refund();
                }
            }
        }

        System.out.println("Flight " + flightNumber + " cancelled successfully.");
    }

    public void deleteFlight(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return;
        }

        for (Reservation reservation : reservations) {

            if (reservation.getFlight().getFlightNumber().equalsIgnoreCase(flightNumber)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Flight cannot be deleted because it has active reservations.");
                return;
            }
        }

        flights.remove(flight);

        System.out.println("Flight " + flightNumber + " deleted successfully.");
    }

    public void deletePassenger(Integer passengerId) {

        Passenger passenger = searchPassenger(passengerId);

        if (passenger == null) {
            return;
        }

        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().getId().equals(passengerId)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Passenger cannot be deleted because they have active reservations.");
                return;
            }
        }

        passengers.remove(passenger);

        System.out.println("Passenger " + passengerId + " deleted successfully.");
    }

    // Sort by available Flight number

    public void sortFlightsByFlightNumber() {

        flights.sort(Comparator.comparing(Flight::getFlightNumber));

        System.out.println("Flights sorted by flight number.");

        viewFlights();
    }

    // Sort by available seats
    public void sortFlightsByAvailableSeats() {

        flights.sort(Comparator.comparing(Flight::getAvailableSeats));

        System.out.println("Flights sorted by available seats.");

        viewFlights();
    }

    // Sort by ticket price
    public void sortFlightsByTicketPrice() {

        flights.sort(Comparator.comparing(Flight::getTicketPrice));

        System.out.println("Flights sorted by ticket price.");

        viewFlights();
    }

    // Sort by destination
    public void sortFlightsByDestination() {

        flights.sort(Comparator.comparing(Flight::getDestination));

        System.out.println("Flights sorted by destination.");

        viewFlights();
    }

    // Sort passengers by name

    public void sortPassengersByName() {

        passengers.sort(Comparator.comparing(Passenger::getName));

        System.out.println("Passengers sorted by name.");

        viewPassengers();
    }

    // Sort passengers by ID

    public void sortPassengersById() {

        passengers.sort(Comparator.comparing(Passenger::getId));

        System.out.println("Passengers sorted by ID.");

        viewPassengers();
    }

    public void displayStatistics() {

        int totalAvailableSeats = 0;
        int totalOccupiedSeats = 0;

        for (Flight flight : flights) {
            totalAvailableSeats += flight.getAvailableSeats();
            totalOccupiedSeats += flight.getTotalSeats() - flight.getAvailableSeats();
        }

        System.out.println("----- SYSTEM STATISTICS -----");
        System.out.println("Total Flights: " + flights.size());
        System.out.println("Total Passengers: " + passengers.size());
        System.out.println("Total Reservations: " + reservations.size());
        System.out.println("Available Seats: " + totalAvailableSeats);
        System.out.println("Occupied Seats: " + totalOccupiedSeats);
    }

    public void displayRevenue() {

        double totalRevenue = 0;

        for (Reservation reservation : reservations) {

            if (reservation.getReservationStatus() == ReservationStatus.CONFIRMED
                    && reservation.getPaymentStatus() == PaymentStatus.PAID) {

                totalRevenue += reservation.getFinalPrice();
            }
        }

        System.out.println("----- TOTAL REVENUE -----");
        System.out.println("Total Revenue: " + totalRevenue);
    }

    public void findMostPopularFlight() {

        Flight mostPopularFlight = null;
        int highestBookings = 0;

        for (Flight flight : flights) {

            int bookingCount = 0;

            for (Reservation reservation : reservations) {

                if (reservation.getFlight().equals(flight)
                        && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                    bookingCount++;
                }
            }

            if (bookingCount > highestBookings) {
                highestBookings = bookingCount;
                mostPopularFlight = flight;
            }
        }

        if (mostPopularFlight == null) {
            System.out.println("No active reservations found.");
            return;
        }

        System.out.println("----- MOST POPULAR FLIGHT -----");
        System.out.println("Flight: " + mostPopularFlight.getFlightNumber());
        System.out.println("Route: " + mostPopularFlight.getSource()
                + " -> " + mostPopularFlight.getDestination());
        System.out.println("Active Reservations: " + highestBookings);
    }

    public void findPassengerWithHighestBookings() {

        Passenger topPassenger = null;
        int highestBookings = 0;

        for (Passenger passenger : passengers) {

            int bookingCount = 0;

            for (Reservation reservation : reservations) {

                if (reservation.getPassenger().equals(passenger)
                        && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                    bookingCount++;
                }
            }

            if (bookingCount > highestBookings) {
                highestBookings = bookingCount;
                topPassenger = passenger;
            }
        }

        if (topPassenger == null) {
            System.out.println("No active reservations found.");
            return;
        }

        System.out.println("----- PASSENGER WITH HIGHEST BOOKINGS -----");
        System.out.println("Passenger: " + topPassenger.getName());
        System.out.println("Passenger ID: " + topPassenger.getId());
        System.out.println("Active Bookings: " + highestBookings);
    }

    public void mostPopularDestination() {

        String mostPopularDestination = null;
        int highestBookings = 0;

        for (Flight flight: flights) {

            int bookingCount = 0;

            for (Reservation reservation : reservations) {

                if (reservation.getFlight().equals(flight)
                        && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                    bookingCount++;
                }

                if (bookingCount > highestBookings) {
                    highestBookings = bookingCount;
                    mostPopularDestination = flight.getDestination();
                }
        }
            if (mostPopularDestination == null){
                System.out.println("No active reservations found.");
                return;
            }

            System.out.println("----- MOST POPULAR DESTINATION -----");
            System.out.println("Destination: " + mostPopularDestination);
            System.out.println("Active Reservations: " + highestBookings);
        }
    }

    public void viewPassengerReservations(Integer passengerId) {

        Passenger passenger = searchPassenger(passengerId);

        if (passenger == null) {
            return;
        }

        boolean found = false;

        System.out.println("----- Reservations for " + passenger.getName() + " -----");

        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().getId().equals(passengerId)) {

                System.out.println(reservation);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No reservations found for this passenger.");
        }
    }
}
