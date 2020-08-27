package com.abhnin.dsalgojavall.sorting.sortingalgos;

import com.abhnin.dsalgojavall.sorting.Sortable;

public class InsertionSort implements Sortable {
    @Override
    public int[] sort(int[] unSortedArray) {
        int len = unSortedArray.length;
        int temp;

        for (int i = 0; i < len -1; i++){
            if (unSortedArray[i + 1] < unSortedArray[i]){
                for (int j = i+ 1; j > 0; j--){
                    if (unSortedArray[j] < unSortedArray[j-1]){
                        temp = unSortedArray[j];
                        unSortedArray[j] = unSortedArray[j-1];
                        unSortedArray[j-1] = temp;
                    }
                }
            }
        }

        return unSortedArray;
    }
}
