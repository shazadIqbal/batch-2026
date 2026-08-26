package CinemaTicket;

import java.util.Objects;

public class Booking {

    private Show show;
    private Customer customer;

    public Booking() {
    }

    public Booking(Show show, Customer customer) {
        this.show = show;
        this.customer = customer;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(show, booking.show) && Objects.equals(customer, booking.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(show, customer);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "show=" + show +
                ", customer=" + customer +
                '}';
    }
}
