package com.abhnin.dsalgojavall;

import com.abhnin.dsalgojavall.sorting.BubbleSort;

public class Main {

    public static void main(String[] args){
        int[] unSortedArray = new int[]{ 67, 23, 89, 3, 90, 5, 12, 49, 98787, 686};
        new BubbleSort().sort(unSortedArray);
    }
}
