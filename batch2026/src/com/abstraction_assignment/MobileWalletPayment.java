package com.abstraction_assignment;

public class MobileWalletPayment extends Payment{


    public MobileWalletPayment(int paymentId, double amount) {
        super(paymentId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Mobile Payment...");
        System.out.println("---------------------------");
    }
}
