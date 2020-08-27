package com.abhnin.dsalgojavall.util;

import java.util.HashMap;

public class Utils {
    public static void printArray(int[] arr){
        for (int value : arr) System.out.print(value + " ");
        System.out.println("\n");
    }
    public static int indexOfMinimumValueInTheArray(int[] arr, int startIndex){
        int len = arr.length;
        int minIndex = startIndex;

        for (int i=startIndex; i < len - 1; i++){
            if (arr[i+1] < arr[minIndex] ){
                minIndex = i + 1;
            }
        }

        return minIndex;
    }
}
