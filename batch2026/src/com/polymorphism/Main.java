package com.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        Account account;
        if(type.equalsIgnoreCase("current")){
            account = new CurrentAccount("Xyz","123123",10.0);
        }else{
            account = new SavingAccount("ABC","223344",0.0);
        }
        account.deposit(1000.0);
        System.out.println(account);


    }
}
