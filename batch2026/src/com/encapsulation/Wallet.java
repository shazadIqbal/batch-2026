package com.encapsulation;

public class Wallet {
   private String name;
   private Double amount;

    public Wallet(String name, Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public Wallet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        // check precondition
        return amount;
    }

    public void setAmount(Double amount) {
        // pre condition
        // macanishm
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
