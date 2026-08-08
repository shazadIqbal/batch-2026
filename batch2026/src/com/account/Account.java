package com.account;

public class Account {

    // Attributes
    String title;
    Integer accountNumber;
    double balance;

    public Account() {
    }

    public Account(String accountName, Integer accountNumber, double balance) {
        this.title = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Behaviors
    public void deposit(double amount) {
        if (amount >0) {
            balance += amount;
        }
        System.out.println("Incorrect amount");
    }

    public boolean withdraw(Double amount) {
        if (amount < this.balance && amount > 0) {
            this.balance -= amount;
            return true;
        }
        System.out.println("Insufficient Balance!");
        return false;
    }

    public double getProfitRate(){
        return 0.5;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "title='" + title + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}