package com.abstraction_assignment;

public class CreditCardPayment extends Payment {

        public CreditCardPayment(int paymentId, double amount) {
            super(paymentId, amount);
        }

        @Override
        public void processPayment() {
            System.out.println("Processing Credit Card Payment...");
            System.out.println("---------------------------");
        }
    }

