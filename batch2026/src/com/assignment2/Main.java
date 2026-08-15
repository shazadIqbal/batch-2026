package com.assignment2;

public class Main {

    public static void main(String[] args) {

        Flight flight = new Flight("PK101",FlightStatus.SCHEDULED);

        if(flight.getStatus().equals(FlightStatus.DEPARTED)){

        }

        for(FlightStatus status : FlightStatus.values()){
            System.out.println(status);
        }

        System.out.println(flight);
    }
}
