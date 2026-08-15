package com.abstraction_assignment;

public class BankPayment extends Payment{


    public BankPayment(String paymentId, Double amount) {
        super(paymentId, amount);
    }

    public BankPayment() {
    }

    @Override
    public void processPayment() {
        displayDetails();
        System.out.println("Bank payment processing .....");

    }
}
