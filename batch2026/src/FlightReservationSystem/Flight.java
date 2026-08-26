package FlightReservationSystem;

public class Flight {

    private String flightNumber;
    private String source;
    private String destination;
    private Integer totalSeats;
    private Integer availableSeats;
    private double ticketPrice;
    private FlightStatus status;

    public Flight(String flightNumber, String source, String destination, Integer totalSeats, double ticketPrice) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.ticketPrice = ticketPrice;
        this.availableSeats = totalSeats;
        this.status = FlightStatus.SCHEDULED;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void changeStatus(FlightStatus status) {
        this.status = status;
    }

    public void decreaseAvailableSeats() {
        availableSeats--;
    }

    public void increaseAvailableSeats() {
        availableSeats++;
    }



    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                ", ticketPrice=" + ticketPrice +
                ", status=" + status +
                '}';
    }
}
