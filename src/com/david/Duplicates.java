package com.david;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    static final Scanner SCANNER = new Scanner (System.in);
    public static void main(String[] args){
        System.out.println("Please enter arrays length: ");
        final int[] numList = new int[SCANNER.nextInt()];
        System.out.println("Please enter array values: ");
        for (int i = 0 ; i < numList.length ; i++) {
            numList[i] = SCANNER.nextInt();
        }
        Arrays.sort( numList );
        int [] noDupArr = removeDuplicates( numList );
        System.out.println("The new array is: ");
        for (int i = 0; i < noDupArr.length ; i++) {
            System.out.print(noDupArr[i] + " ");
        }
    }

    static int[] removeDuplicates ( int[] arr ){
        int countDup = 0;
        int countMoreThanTwice = 0;
        for (int i = 0; i < (arr.length - 1) ; i++) {
            if ( arr[i] == arr[ i+1 ]) {
                countDup++;
                while (i < ( arr.length - 2)) {
                    if (arr[i+1] == arr[i + 2]) {
                        i++;
                        countMoreThanTwice++;
                    } else {
                        break;
                    }
                }
            }
        }
        int newLength = ( arr.length - ( countDup + countMoreThanTwice ));
        int [] newArr = new int[ newLength ];
        int i = 0;
                for (int j = 0; j < newArr.length ; j++) {
                    while ( i < arr.length-1 ){
                        if ( arr[i] != arr[i+1]){
                            newArr[j] = arr[i];
                            i++;
                            break;
                        }else { i++; }
                    }
                }
                newArr[ newLength-1 ] = arr[arr.length-1 ];
            return newArr;
    }
}
