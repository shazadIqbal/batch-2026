package com.comparing;

import java.util.Comparator;

public class CardNameComparitor implements Comparator<Card> {


    @Override
    public int compare(Card o1, Card o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
