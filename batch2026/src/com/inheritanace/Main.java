package com.inheritanace;

public class Main {
    public static void main(String[] args) {
       Nokia n1 = new Nokia("Nokia N1","Red",30);

       n1.switchOn();
       n1.switchOff();

       Samsung samsung = new Samsung("Samsung A33","Red",16);

       samsung.switchOn();
       samsung.switchOff();

    }
}
