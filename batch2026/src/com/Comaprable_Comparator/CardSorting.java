package com.Comaprable_Comparator;

import java.util.Comparator;

public class CardSorting implements Comparator<Card> {


    @Override
    public int compare(Card c1, Card c2) {
        return c1.getCvv().compareTo(c2.getCvv());
    }
}
