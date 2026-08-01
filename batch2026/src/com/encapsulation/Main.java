package com.encapsulation;

public class Main {
    //solid
    public static void main(String[] args) {
        Wallet wallet = new Wallet("NayaPay",300.0);
        //wallet.setAmount(-12.00);
        wallet.getAmount();
        wallet.setAmount(12.00);
        System.out.println(wallet);
    }
}
