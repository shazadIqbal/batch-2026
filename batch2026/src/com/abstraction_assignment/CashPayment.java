package com.abstraction_assignment;

public class CashPayment extends Payment {


    public CashPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }


    @Override
    public void processPayment() {
        System.out.println("Payment was paid via Cash...");
        System.out.println("---------------------------");

    }
}
