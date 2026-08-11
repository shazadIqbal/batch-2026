package com.abstraction_assignment;

public class CreditCard extends Payment{

    public CreditCard(String paymentId, Double amount) {
        super(paymentId, amount);
    }

    public CreditCard() {
    }

    @Override
    public void processPayment() {
        displayDetails();
        System.out.println("Credit Car payment processing ......");
    }
}
