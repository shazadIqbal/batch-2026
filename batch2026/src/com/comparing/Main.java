package com.comparing;

import com.collections_3.Employee;
import com.collections_3.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> cardList = new ArrayList<>();

        cardList.add(new Card("stepway",112334455,123,
                LocalDate.of(2027,11,1)));

        cardList.add(new Card("ali",112334543,222,
                LocalDate.of(2028,11,1)));

        Collections.sort(cardList,Comparator.comparing(Card::getCvv).reversed());


        //Comparator.comparing(ClassName :: method Name)

        cardList.forEach(c -> System.out.println(c));

        Employee employee = new Employee(1,"TAHA", Status.ACTIVE);



    }
}
