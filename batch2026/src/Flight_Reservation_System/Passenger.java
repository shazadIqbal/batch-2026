package Flight_Reservation_System;

import java.util.Objects;

public class Passenger extends Person{


    private String passportNumber;

    public Passenger(String id, String name, String email, String passportNumber) {
        super(id, name, email);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }


    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public double calculateTicketPrice(double basePrice) {
        return basePrice;
    }

    // Kya dono Passenger ki ID same hai?"

    @Override
    public boolean equals(Object obj) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Passenger passenger = (Passenger) o;
//        return Objects.equals(passportNumber, passenger.passportNumber);
        if (this == obj)
            return true;
        if (!(obj instanceof Passenger))
            return false;
        Passenger other = (Passenger) obj;
        return Objects.equals(getId(), other.getId());
    }

    //ID ki hash value kya hai means ya ab duplicate ko add krny sy rkoega
    @Override
    public int hashCode() {
        return Objects.hash(getId()); //ku ky humku id ky pass pr compare kwana takay bd mein jakr hum same id exist ko error desky
//        return Objects.hashCode(passportNumber);
    }

    @Override
    public void displayDetails() {
        System.out.println("ID:" + getId());
        System.out.println("Name:" + getName());
        System.out.println("Email:" + getEmail());
        System.out.println("Passport Number:" + getPassportNumber());

    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
