package com.abhnin.dsalgojavall.algorithms.sorting;

import com.abhnin.dsalgojavall.algorithms.sorting.sortingalgos.BubbleSort;
import com.abhnin.dsalgojavall.algorithms.sorting.sortingalgos.InsertionSort;
import com.abhnin.dsalgojavall.algorithms.sorting.sortingalgos.SelectionSort;

public class Sorter {
    public int[] sort(int[] unSortedArray, SortAlgo sortAlgo) {
        switch(sortAlgo){
            case BubbleSort:
                return new BubbleSort().sort(unSortedArray);
            case SelectionSort:
                return new SelectionSort().sort(unSortedArray);
            case InsertionSort:
                return new InsertionSort().sort(unSortedArray);
            default:
                return null;
        }
    }
}
