package Flight_Reservation_System;

import java.util.ArrayList;

public class FlightReservationSystem {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;
    private ArrayList<Reservation> reservations;

    public FlightReservationSystem() {
        flights = new ArrayList<>();
        passengers = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    // =========================
    // FLIGHT MANAGEMENT
    // =========================

    public void addFlight(String flightNumber, String source, String destination,
                          int totalSeats, double ticketPrice) {

        // Check duplicate flight number
        for (Flight existingFlight : flights) {

            if (existingFlight.getFlightNumber().equals(flightNumber)) {
                System.out.println("Flight number already exists.");
                return;
            }
        }

        // Check total seats
        if (totalSeats <= 0) {
            System.out.println("Total seats must be greater than zero.");
            return;
        }

        // Create new flight
        Flight flight = new Flight(
                flightNumber,
                source,
                destination,
                totalSeats,
                ticketPrice,
                FlightStatus.SCHEDULED
        );

        // Add flight to ArrayList
        flights.add(flight);

        System.out.println("Flight added successfully.");
    }


    // View all flights
    public void viewFlights() {

        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }


    // Search flight by flight number
    public Flight searchFlight(String flightNumber) {

        for (Flight flight : flights) {

            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }

        return null;
    }

    // Search flights by source and destination
    public void searchFlightsByRoute(String source, String destination) {

        boolean found = false;

        for (Flight flight : flights) {

            if (flight.getSource().equalsIgnoreCase(source)
                    && flight.getDestination().equalsIgnoreCase(destination)) {

                System.out.println(flight);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights found for this route.");
        }
    }

    // Search flights with required available seats
    public void searchFlightsByAvailableSeats(int requiredSeats) {

        boolean found = false;

        for (Flight flight : flights) {

            if (flight.getAvailableSeats() >= requiredSeats) {
                System.out.println(flight);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flights have enough available seats.");
        }
    }

    // Change flight status
    public void changeFlightStatus(String flightNumber, FlightStatus status) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            System.out.println("Flight not found.");
            return;
        }

        flight.setStatus(status);

        System.out.println("Flight status updated successfully.");
    }

    // Delete flight
    public void deleteFlight(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            System.out.println("Flight not found.");
            return;
        }

        // Check active reservations
        for (Reservation reservation : reservations) {

            if (reservation.getFlight().equals(flight)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Flight cannot be deleted because it has active reservations.");
                return;
            }
        }

        flights.remove(flight);

        System.out.println("Flight deleted successfully.");
    }


    // PASSENGER MANAGEMENT

    public void addPassenger(String id, String name, String email, String passportNumber) {

        // Check duplicate passenger ID
        for (Passenger existingPassenger : passengers) {

            if (existingPassenger.getId().equals(id)) {
                System.out.println("Passenger ID already exists.");
                return;
            }
        }

        // Check empty information
        if (name == null || name.isEmpty()
                || email == null || email.isEmpty()
                || passportNumber == null || passportNumber.isEmpty()) {

            System.out.println("Name, email and passport number cannot be empty.");
            return;
        }

        Passenger passenger = new Passenger(
                id,
                name,
                email,
                passportNumber
        );

        passengers.add(passenger);

        System.out.println("Passenger added successfully.");
    }

    // View all passengers
    public void viewPassengers() {

        if (passengers.isEmpty()) {
            System.out.println("No passengers available.");
            return;
        }

        for (Passenger passenger : passengers) {
            System.out.println(passenger);
        }
    }

    // Search passenger by ID
    public Passenger searchPassenger(String id) {

        for (Passenger passenger : passengers) {

            if (passenger.getId().equals(id)) {
                return passenger;
            }
        }

        return null;
    }

    // Delete passenger
    public void deletePassenger(String id) {

        Passenger passenger = searchPassenger(id);

        if (passenger == null) {
            System.out.println("Passenger not found.");
            return;
        }

        // Check active reservations
        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().equals(passenger)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Passenger cannot be deleted because they have active reservations.");
                return;
            }
        }

        passengers.remove(passenger);

        System.out.println("Passenger deleted successfully.");
    }


    // RESERVATION MANAGEMENT

    public void makeReservation(String passengerId, String flightNumber, int seatNumber) {

        Passenger passenger = searchPassenger(passengerId);
        Flight flight = searchFlight(flightNumber);

        // Passenger must exist
        if (passenger == null) {
            System.out.println("Passenger not found.");
            return;
        }

        // Flight must exist
        if (flight == null) {
            System.out.println("Flight not found.");
            return;
        }

        // Check flight status
        if (flight.getStatus() == FlightStatus.CANCELLED
                || flight.getStatus() == FlightStatus.DEPARTED
                || flight.getStatus() == FlightStatus.COMPLETED) {

            System.out.println("This flight cannot accept new reservations.");
            return;
        }

        // Check available seats
        if (flight.getAvailableSeats() <= 0) {
            System.out.println("No seats available.");
            return;
        }

        // Check seat number
        if (seatNumber < 1 || seatNumber > flight.getTotalSeats()) {
            System.out.println("Invalid seat number.");
            return;
        }

        // Check duplicate seat
        for (Reservation reservation : reservations) {

            if (reservation.getFlight().equals(flight)
                    && reservation.getSeatNumber() == seatNumber
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("This seat is already reserved.");
                return;
            }
        }

        // Check duplicate passenger booking
        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().equals(passenger)
                    && reservation.getFlight().equals(flight)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println("Passenger already has an active reservation on this flight.");
                return;
            }
        }

        // Calculate ticket price
        double finalPrice = passenger.calculateTicketPrice(flight.getTicketPrice());

        // Create reservation
        Reservation reservation = new Reservation(
                passenger,
                flight,
                seatNumber,
                ReservationStatus.CONFIRMED,
                PaymentStatus.PAID,
                finalPrice
        );

        reservations.add(reservation);

        // Decrease available seats
        flight.setAvailableSeats(flight.getAvailableSeats() - 1);

        System.out.println("Reservation created successfully.");
        System.out.println(reservation);
    }


    // Cancel reservation
    public void cancelReservation(String reservationId) {

        Reservation reservation = null;

        for (Reservation r : reservations) {

            if (r.getReservationId().equals(reservationId)) {
                reservation = r;
                break;
            }
        }

        if (reservation == null) {
            System.out.println("Reservation not found.");
            return;
        }

        if (reservation.getReservationStatus() == ReservationStatus.CANCELLED) {
            System.out.println("Reservation is already cancelled.");
            return;
        }

        reservation.setReservationStatus(ReservationStatus.CANCELLED);

        // Refund if payment was made
        if (reservation.getPaymentStatus() == PaymentStatus.PAID) {
            reservation.setPaymentStatus(PaymentStatus.REFUNDED);
        }

        // Make seat available again
        Flight flight = reservation.getFlight();

        flight.setAvailableSeats(flight.getAvailableSeats() + 1);

        System.out.println("Reservation cancelled successfully.");
    }



    // VIEW RESERVATIONS

    public void viewReservations() {

        if (reservations.isEmpty()) {
            System.out.println("No reservations available.");
            return;
        }

        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }

    // Passenger reservations
    public void viewPassengerReservations(String passengerId) {

        Passenger passenger = searchPassenger(passengerId);

        if (passenger == null) {
            System.out.println("Passenger not found.");
            return;
        }

        boolean found = false;

        for (Reservation reservation : reservations) {

            if (reservation.getPassenger().equals(passenger)) {
                System.out.println(reservation);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No reservations found for this passenger.");
        }
    }

    // Flight passengers
    public void viewFlightPassengers(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            System.out.println("Flight not found.");
            return;
        }

        boolean found = false;

        for (Reservation reservation : reservations) {

            if (reservation.getFlight().equals(flight)
                    && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                System.out.println(reservation.getPassenger());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No passengers booked on this flight.");
        }
    }


    // SEAT MAP

    public void displaySeatMap(String flightNumber) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            System.out.println("Flight not found.");
            return;
        }

        for (int seat = 1; seat <= flight.getTotalSeats(); seat++) {

            boolean reserved = false;

            for (Reservation reservation : reservations) {

                if (reservation.getFlight().equals(flight)
                        && reservation.getSeatNumber() == seat
                        && reservation.getReservationStatus() == ReservationStatus.CONFIRMED) {

                    reserved = true;
                    break;
                }
            }

            if (reserved) {
                System.out.print(seat + " [X] ");
            } else {
                System.out.print(seat + " [ ] ");
            }
        }

        System.out.println();
    }


    // STATISTICS

    public void displayStatistics() {

        int availableSeats = 0;
        int occupiedSeats = 0;

        for (Flight flight : flights) {

            availableSeats += flight.getAvailableSeats();
            occupiedSeats += flight.getTotalSeats() - flight.getAvailableSeats();
        }

        System.out.println("Total Flights: " + flights.size());
        System.out.println("Total Passengers: " + passengers.size());
        System.out.println("Total Reservations: " + reservations.size());
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Occupied Seats: " + occupiedSeats);
    }


    // REVENUE

    public double calculateRevenue() {

        double totalRevenue = 0;

        for (Reservation reservation : reservations) {

            if (reservation.getReservationStatus() == ReservationStatus.CONFIRMED
                    && reservation.getPaymentStatus() == PaymentStatus.PAID) {

                totalRevenue += reservation.getFinalPrice();
            }
        }

        return totalRevenue;
    }

    public void displayRevenue() {
        System.out.println("Total Revenue: " + calculateRevenue());
    }
}

