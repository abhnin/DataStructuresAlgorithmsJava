package com.abhnin.dsalgojavall.sorting.sortingalgos;

import com.abhnin.dsalgojavall.sorting.Sortable;
import com.abhnin.dsalgojavall.util.Utils;

public class SelectionSort implements Sortable {
    @Override
    public int[] sort(int[] unSortedArray) {
        int len = unSortedArray.length;
        int tempIndex, temp;

        for (int i = 0; i < len; i++){
            tempIndex = Utils.indexOfMinimumValueInTheArray(unSortedArray, i);
            temp = unSortedArray[tempIndex];
            unSortedArray[tempIndex] = unSortedArray[i];
            unSortedArray[i] = temp;
        }
        return unSortedArray;
    }
}
