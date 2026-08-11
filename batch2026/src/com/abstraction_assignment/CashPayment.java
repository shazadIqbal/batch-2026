package com.abstraction_assignment;

public class CashPayment extends Payment{

    public CashPayment(String paymentId, Double amount) {
        super(paymentId, amount);
    }

    public CashPayment() {

    }

    @Override
    public void processPayment() {
        displayDetails();
        System.out.println(" Cash Payment Processing ......");
    }
}
