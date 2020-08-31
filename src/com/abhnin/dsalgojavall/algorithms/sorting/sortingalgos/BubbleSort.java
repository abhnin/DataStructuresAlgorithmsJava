package com.abhnin.dsalgojavall.algorithms.sorting.sortingalgos;

import com.abhnin.dsalgojavall.algorithms.sorting.MasterSort;
import com.abhnin.dsalgojavall.algorithms.sorting.Sortable;

public class BubbleSort extends MasterSort implements Sortable {
    @Override
    public int[] sort(int[] unSortedArray) {
        setStartTime(System.nanoTime());
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
        setEndTime(System.nanoTime());
        return unSortedArray;
    }
}
