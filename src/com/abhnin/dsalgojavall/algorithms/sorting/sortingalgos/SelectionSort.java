package com.abhnin.dsalgojavall.algorithms.sorting.sortingalgos;

import com.abhnin.dsalgojavall.algorithms.sorting.MasterSort;
import com.abhnin.dsalgojavall.algorithms.sorting.Sortable;

public class SelectionSort extends MasterSort implements Sortable {
    @Override
    public int[] sort(int[] unSortedArray) {
        setStartTime(System.nanoTime());
            int len = unSortedArray.length;
            int tempIndex = 0, temp = 0;

            for (int i = 0; i < len; i++){
                tempIndex = i;
                for (int j=i; j < len-1; j++){
                    if (unSortedArray[j+1] < unSortedArray[tempIndex] ){
                        tempIndex = j + 1;
                    }
                }

                temp = unSortedArray[tempIndex];
                unSortedArray[tempIndex] = unSortedArray[i];
                unSortedArray[i] = temp;
            }

        setEndTime(System.nanoTime());
        return unSortedArray;
    }
}
