package com.Comaprable_Comparator;

public class Card {
    private Integer cardNumber;
    private String name;
    private Integer cvv;
    private String expiryDate;

    public Card() {
    }

    public Card(Integer cardNumber, String name, Integer cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }


    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", name='" + name + '\'' +
                ", cvv=" + cvv +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }


}
