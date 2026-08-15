package com.comparing;

import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private String name;
    private Integer number;
    private Integer cvv;
    private LocalDate expiry;

    public Card(String name, Integer number, Integer cvv, LocalDate expiry) {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public LocalDate getExpiry() {
        return expiry;
    }

    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(number, card.number) && Objects.equals(cvv, card.cvv) && Objects.equals(expiry, card.expiry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, cvv, expiry);
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", cvv=" + cvv +
                ", expiry=" + expiry +
                '}';
    }
}
