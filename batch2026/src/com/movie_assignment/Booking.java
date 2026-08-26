package com.movie_assignment;

public class Booking {
    private Show show;
    private Customer customer;

    public Booking(Show show, Customer customer) {
        this.show = show;
        this.customer = customer;
    }

    public Booking() {
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
    public String toString() {
        return "Booking{" +
                "show=" + show +
                ", customer=" + customer +
                '}';
    }
}
