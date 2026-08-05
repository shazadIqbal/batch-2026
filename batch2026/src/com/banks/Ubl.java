package com.banks;

public class Ubl {

    String location;
    Integer numberOfAccounts;

    public Ubl(String location, Integer numberOfAccounts) {
        this.location = location;
        this.numberOfAccounts = numberOfAccounts;
    }

    @Override
    public String toString() {
        return "Ubl{" +
                "Location='" + Location + '\'' +
                ", numberOfAccounts=" + numberOfAccounts +
                '}';
    }
}
