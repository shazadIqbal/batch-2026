package com.polymorphism;

public class CurrentAccount extends Account{

    public CurrentAccount() {
        System.out.println("In Child Constructor");
    }

    public CurrentAccount(String title, String accountNumber, Double balance) {
        super(title, accountNumber, balance);
    }

    @Override
    public boolean withdraw(Double amount) {
        boolean result = super.withdraw(amount);
        if(result){
            setBalance(getBalance() - 2.0);
            return true;
        }
        return false;
    }


    @Override
    public Double getProfitRate() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "CurrentAccount{} " + super.toString();
    }
}
