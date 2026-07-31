package com.inheritanace;

public class Bank {

    String location;
    Integer numberOfAccounts;
    Integer numberOfEmployees;

    public Bank(String location, Integer numberOfAccounts, Integer numberOfEmployees) {
        this.location = location;
        this.numberOfAccounts = numberOfAccounts;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Bank(String location, Integer numberOfAccounts) {
        this.location = location;
        this.numberOfAccounts = numberOfAccounts;
    }

    public Bank(String location) {
        this.location = location;
    }

    public Bank(Integer numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    public Bank() {
    }


    public void deposit(){
        System.out.println("Bank deposit");
    }

    @Override
    public String toString() {
        return "Bank{" +
                "location='" + location + '\'' +
                ", numberOfAccounts=" + numberOfAccounts +
                '}';
    }
}
