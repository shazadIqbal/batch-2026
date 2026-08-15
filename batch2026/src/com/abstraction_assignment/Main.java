package com.abstraction_assignment;

public class Main {
    public static void main(String[] args) {

        Payment bp = new BankPayment(123,100.0);
        bp.displayPaymentDetails();
        bp.processPayment();


        Payment credit = new CreditCardPayment(232, 50.0);
        credit.displayPaymentDetails();
        credit.processPayment();

        Payment mobile = new MobileWalletPayment(4435,200);
        mobile.displayPaymentDetails();
        mobile.processPayment();

        Payment cash = new CashPayment(5443,900.0);
        cash.displayPaymentDetails();
        cash.processPayment();



    }
}
