package com.abhnin.dsalgojavall;

import com.abhnin.dsalgojavall.sorting.BubbleSort;

public class Main {

    public static void main(String[] args){
        int[] unSortedArray = new int[]{ 3,60,35,2,45,320,5 };
        new BubbleSort().sort(unSortedArray);
    }
}
