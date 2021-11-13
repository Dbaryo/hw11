package com.david;

import java.util.Scanner;

public class Factorial {

    static final Scanner SCANNER = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a POSITIVE and WHOLE number: ");
        int number = SCANNER.nextInt();
        System.out.println( factorial( number ));
    }

    static int factorial ( int x ){
        int factAnswer = 1;
        for (int i = 2; i <= x ; i++) {
            factAnswer = factAnswer * i;
        }
        return factAnswer;
    }
}
