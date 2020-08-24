package com.abhnin.dsalgojavall.sorting;

public class BubbleSort extends SortUtils implements Sort {
    @Override
    public void sort(int[] unSortedArray) {
        printArray(unSortedArray);
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

        printArray(unSortedArray);
    }
}
