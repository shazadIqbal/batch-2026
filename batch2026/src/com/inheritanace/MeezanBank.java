package com.inheritanace;

public class MeezanBank extends Bank{

    public MeezanBank(String location, Integer numberOfAccounts, Integer numberOfEmployees) {
        super(location, numberOfAccounts, numberOfEmployees);
    }

    @Override
    public void deposit() {
        System.out.println("Mezan bank deposit");
    }
}
