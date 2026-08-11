package com.abstraction_assignment;

public abstract class Payment {

    private String paymentId;
    private Double amount;

    public Payment(String paymentId, Double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
    }

    public Payment() {
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void displayDetails(){
        System.out.println("Payment Id : "+this.paymentId);
        System.out.println("Amount : "+this.amount);
    }

    public abstract void processPayment();


}
