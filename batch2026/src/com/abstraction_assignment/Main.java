package com.abstraction_assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCard("101",5000.0);
        Payment mobileWallet = new MobileWallet("102",5000.0);
        Payment bankPayment = new BankPayment("103",5000.0);
        Payment cashPayment = new CashPayment("104",400.0);

        List<Payment> paymentList = new LinkedList<>();
        paymentList.add(creditCard);
        paymentList.add(mobileWallet);
        paymentList.add(bankPayment);
        paymentList.add(cashPayment);

        paymentList.forEach(p-> {
            p.processPayment();
            System.out.println(" --------------------------------------------   ");
        });




    }
}
