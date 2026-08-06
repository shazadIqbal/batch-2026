package com.polymorphism;

public class Account {
    private String title;
    private String accountNumber;
    private Double balance;

    public Account() {
        System.out.println("In Parent Constructor");
    }

    public Account(String title, String accountNumber, Double balance) {
        this.title = title;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    public void deposit(Double amount){
        if(amount > 0){
            this.balance += amount;
        }else {
            System.out.println("Incorrect Amount");
        }
    }


    public boolean withdraw(Double amount){
        if(amount < this.balance && amount > 0){
            this.balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance / invalid amount");
        return false;
    }

    public Double getProfitRate(){
        return 0.5;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "title='" + title + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
