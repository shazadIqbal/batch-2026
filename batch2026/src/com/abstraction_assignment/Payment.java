package com.abstraction_assignment;

public abstract class Payment {

    private int paymentId;
    private double amount;

    public Payment(Integer paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public Payment() {
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayPaymentDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
    }

    public abstract void processPayment();

    @Override
    public String toString() {
        return "PaymentSystem{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                '}';
    }
}
