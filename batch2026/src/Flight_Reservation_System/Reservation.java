package Flight_Reservation_System;

public class Reservation {

    private String reservationId;
    private Passenger passenger;
    private Flight flight;
    private int seatNumber;
    private ReservationStatus reservationStatus;
    private PaymentStatus paymentStatus;
    private double finalPrice;

    private static int reservationCounter = 0;

    public Reservation(Passenger passenger, Flight flight, int seatNumber, ReservationStatus reservationStatus, PaymentStatus paymentStatus, double finalPrice) {

        reservationCounter++;

        this.reservationId = String.format("R%03d", reservationCounter);

        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.reservationStatus = reservationStatus;
        this.paymentStatus = paymentStatus;
        this.finalPrice = finalPrice;
    }

    public String getReservationId() {
        return reservationId;
    }

//    public void setReservationId(String reservationId) {
//        this.reservationId = reservationId;
//    } koi baad mein  ID change kar sakta hai  aur sir ny kha ha autmatically genrate hu

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

//    public static int getReservationCounter() {
//        return reservationCounter;
//    } isku bhi remove krha ku ky iska koi kaam nh ha

//    public static void setReservationCounter(int reservationCounter) {
//        Reservation.reservationCounter = reservationCounter;
//    } isku bhi remove krha ku ky koi baad mein bahar se counter ko  bhara sakta


    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId='" + reservationId + '\'' +
                ", passenger=" + passenger +
                ", flight=" + flight +
                ", seatNumber=" + seatNumber +
                ", reservationStatus=" + reservationStatus +
                ", paymentStatus=" + paymentStatus +
                ", finalPrice=" + finalPrice +
                '}';
    }
}




