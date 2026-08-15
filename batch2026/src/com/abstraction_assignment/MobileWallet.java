package com.abstraction_assignment;

public class MobileWallet extends Payment{

    public MobileWallet(String paymentId, Double amount) {
        super(paymentId, amount);
    }

    public MobileWallet() {
    }

    @Override
    public void processPayment() {
        displayDetails();
        System.out.println("Mobile Wallet payment Processing ......");
    }
}
