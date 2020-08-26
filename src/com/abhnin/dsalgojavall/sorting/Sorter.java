package com.abhnin.dsalgojavall.sorting;

import com.abhnin.dsalgojavall.sorting.sortingalgos.BubbleSort;

public class Sorter {
    public int[] sort(int[] unSortedArray, SortAlgo sortAlgo) {
        switch(sortAlgo){
            case BubbleSort:
                return new BubbleSort().sort(unSortedArray);
            default:
                return null;
        }
    }
}
