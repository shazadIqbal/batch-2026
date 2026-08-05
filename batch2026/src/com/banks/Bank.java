package com.banks;

public class Bank {

    String location;
    Integer numberOfAccounts;

    public Bank(String location, Integer numberOfAccounts) {
        this.location = location;
        this.numberOfAccounts = numberOfAccounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "location='" + location + '\'' +
                ", numberOfAccounts=" + numberOfAccounts +
                '}';
    }
}
