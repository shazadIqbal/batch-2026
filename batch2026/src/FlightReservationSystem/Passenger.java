package FlightReservationSystem;

import java.util.Objects;

public abstract class Passenger extends Person{


    private String passportNumber;

    public abstract double calculateTicketPrice(double basePrice);

    public Passenger(Integer id, String name, String email, String passportNumber) {
        super(id, name, email);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Passport Number : " + getPassportNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(passenger.getId(), getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

}
