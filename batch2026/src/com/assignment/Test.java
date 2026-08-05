package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag){
            System.out.println("press 1 for again input");
            System.out.println("press 2 for exit");

            int input = sc.nextInt();

            switch (input){
                case 2 :
                    flag = false;
                    break;
            }

        }

    }
}
