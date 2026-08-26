package com.assignment2;


public class Flight {

    private String flightNumber;
    private FlightStatus status;

    public Flight(String flightNumber, FlightStatus status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", status=" + status +
                '}';
    }
}
