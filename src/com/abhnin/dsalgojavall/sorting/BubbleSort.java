package com.abhnin.dsalgojavall.sorting;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] unSortedArray) {
        int len = unSortedArray.length;
        int temp;

        for (int i = 0; i < len - 2; i++){
            for (int j = 0; j < len -1 - i; j++){
                if (unSortedArray[j] > unSortedArray[j+1]){
                    temp = unSortedArray[j+1];
                    unSortedArray[j+1] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
        }

        return unSortedArray;
    }
}
