package com.abhnin.dsalgojavall.sorting.sortingalgos;

import com.abhnin.dsalgojavall.sorting.Sort;

public class BubbleSort implements Sort {
    public int[] sort(int[] unSortedArray) {
        int lastIndex = unSortedArray.length - 1;
        int temp;

        for (int i=0; i <= lastIndex; i++){
            for (int j = 0; j <= lastIndex - 1 - i ; j++){
                if ( unSortedArray[j+1] < unSortedArray[j] ){
                    temp = unSortedArray[j+1];
                    unSortedArray[j+1] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
        }

        return unSortedArray;
    }
}
