package com.abhnin.dsalgojavall;

import com.abhnin.dsalgojavall.sorting.SortAlgo;
import com.abhnin.dsalgojavall.sorting.Sorter;
import com.abhnin.dsalgojavall.util.Utils;

public class Main {

    public static void main(String[] args){

        int[] unSortedArray = new int[]{ 3,60,35,2,45,320,5 };
        Utils.printArray(unSortedArray);

        Utils.printArray(new Sorter().sort(unSortedArray.clone(), SortAlgo.BubbleSort));
        Utils.printArray(new Sorter().sort(unSortedArray.clone(), SortAlgo.SelectionSort));
        Utils.printArray(new Sorter().sort(unSortedArray.clone(), SortAlgo.InsertionSort));

        System.out.println();

    }
}
