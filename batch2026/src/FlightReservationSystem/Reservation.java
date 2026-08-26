package FlightReservationSystem;

public class Reservation {

    private String reservationId;
    private Passenger passenger;
    private Flight flight;
    private Integer seatNumber;
    private ReservationStatus reservationStatus;
    private PaymentStatus paymentStatus;
    private double finalPrice;


    private static int reservationCounter = 1;

    public Reservation(Passenger passenger, Flight flight, Integer seatNumber, double finalPrice) {

        this.reservationId = String.format("R%03d", reservationCounter);
        reservationCounter++;

        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.finalPrice = finalPrice;

        this.reservationStatus = ReservationStatus.CONFIRMED;
        this.paymentStatus = PaymentStatus.PAID;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

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

    public void cancel() {
        reservationStatus = ReservationStatus.CANCELLED;
    }

    public void refund() {
        paymentStatus = PaymentStatus.REFUNDED;
    }




}
