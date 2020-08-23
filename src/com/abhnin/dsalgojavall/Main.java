package com.abhnin.dsalgojavall;

import com.abhnin.dsalgojavall.sorting.BubbleSort;

public class Main {

    public static void main(String[] args){
        int[] unSortedArray = new int[]{ 67, 23, 89, 3, 90, 5, 12, 49, 98787, 686};
        printArray(unSortedArray);
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(unSortedArray);
        printArray(sortedArray);
    }

    static void printArray(int[] arr){
        for (int value : arr) System.out.print(value + " ");
        System.out.println("\n");
    }
}
