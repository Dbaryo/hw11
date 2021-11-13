package com.david;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    static final Scanner SCANNER = new Scanner (System.in);
    public static void main(String[] args){
        System.out.println("Please enter the length of the array: ");
        int arrLength = SCANNER.nextInt();
        System.out.println("Your randomized array is: ");
        int [] array = randomizedArray( arrLength );
        for (int i = 0; i < arrLength; i++) {
            System.out.print( array[i] + " ");
        }
    }

    static int [] randomizedArray ( int x){
        Random random = new Random();
        int[] randomArr = new int[ x ];
        for (int i = 0; i < x ; i++) {
            randomArr[i] = ( random.nextInt(100) + 1 );
        }
        return randomArr;
    }
}
