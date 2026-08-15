package com.abstraction_assignment;

public class BankPayment extends Payment{

    public BankPayment(String payments, Double amount) {
        super(payments, amount);
    }


    @Override
    public void processPayment() {
        System.out.println("Bank Payment processing ........");
    }

}
