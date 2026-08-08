package com.account;

public class Current extends Account {

    public Current() {
    }

    public Current(String accountName, Integer accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }

    @Override
    public double getProfitRate() {
        return 0;
    }

    @Override
    public boolean withdraw(Double amount) {
        boolean result = super.withdraw(amount);
        if (result){
            setBalance(getBalance() - 2.0);
            return true;
        }
        return false;


    }
}
