package com.abstraction_assignment;

public class BankPayment extends Payment {

        public BankPayment(int paymentId, double amount) {
            super(paymentId, amount);
        }

        @Override
        public void processPayment() {
            System.out.println("Processing Bank Payment...");
            System.out.println("---------------------------");
        }
}
