package com.account;

public class Saving extends Account {

    public Saving() {

    }

    public Saving(String accountName, Integer accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }

    @Override
    public boolean withdraw(Double amount) {
        if (super.withdraw(amount)) {
            setBalance(getBalance() - (amount * 0.1));
            return true;
        }
        return false;
    }
    public double getProfitRate() {
        return 0.6;
    }
}