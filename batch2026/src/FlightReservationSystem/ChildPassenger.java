package FlightReservationSystem;

public class ChildPassenger extends Passenger {

    public ChildPassenger(Integer id, String name, String email, String passportNumber) {
        super(id, name, email, passportNumber);
    }

    @Override
    public double calculateTicketPrice(double basePrice) {
        return basePrice - (basePrice * 0.20);
    }
}