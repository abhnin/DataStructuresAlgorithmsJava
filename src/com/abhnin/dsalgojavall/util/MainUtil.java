package com.abhnin.dsalgojavall.util;

import com.abhnin.dsalgojavall.algorithms.searching.BinarySearch;
import com.abhnin.dsalgojavall.algorithms.sorting.SortAlgo;
import com.abhnin.dsalgojavall.algorithms.sorting.Sorter;

import java.util.Random;

public class MainUtil {
    public static void sortRun(){
        int arrayLength = 3000;
        int maxInt = 2147483647;
        Random random = new Random();
        int[] unSortedArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            unSortedArray[i] = random.nextInt(maxInt);
        }

        Utils.printArray(unSortedArray);

        Sorter sorter = new Sorter();

        Utils.printArray(sorter.sort(unSortedArray.clone(), SortAlgo.BubbleSort));
        Utils.printArray(sorter.sort(unSortedArray.clone(), SortAlgo.SelectionSort));
        Utils.printArray(sorter.sort(unSortedArray.clone(), SortAlgo.InsertionSort));
    }
    public static void searchRun() {
        int[] arr = { 2, 3, 4, 10, 40, 6333335 };
        BinarySearch binarySearch = new BinarySearch();
        int foundAt = binarySearch.search(arr, 6333335);
        System.out.println("Found at position: " + ++foundAt);
    }
}
