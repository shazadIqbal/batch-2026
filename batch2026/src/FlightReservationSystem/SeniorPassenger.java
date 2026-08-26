package FlightReservationSystem;

public class SeniorPassenger extends Passenger {

    public SeniorPassenger(Integer id, String name, String email, String passportNumber) {
        super(id, name, email, passportNumber);
    }

    @Override
    public double calculateTicketPrice(double basePrice) {
        return basePrice - (basePrice * 0.30);
    }
}