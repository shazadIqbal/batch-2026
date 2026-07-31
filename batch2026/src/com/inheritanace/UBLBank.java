package com.inheritanace;

public class UBLBank extends Bank {

    public UBLBank(String location, Integer numberOfAccounts) {
        super(location, numberOfAccounts);

    }

    public UBLBank(String location, Integer numberOfAccounts, Integer numberOfEmployees) {
        super(location, numberOfAccounts, numberOfEmployees);
    }

    @Override
    public void deposit() {
        System.out.println("Ubl bank deposit");
    }
}
