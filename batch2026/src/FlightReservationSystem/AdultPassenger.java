package FlightReservationSystem;

public class AdultPassenger extends Passenger {

    public AdultPassenger(Integer id, String name, String email, String passportNumber) {
        super(id, name, email, passportNumber);
    }

    @Override
    public double calculateTicketPrice(double basePrice) {
        return basePrice;
    }
}