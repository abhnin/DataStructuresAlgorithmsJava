package com.abhnin.dsalgojavall.searching;

public class BinarySearch {
    public int search(int[] array, int numberToSearch) {

        int lowerBound = 0;
        int upperBound = array.length -1;


        while (upperBound - lowerBound >= 0) {
            int middleElement = (lowerBound+ upperBound)/2;
            if (array[middleElement] == numberToSearch){
                return middleElement;
            }else if (array[middleElement] > numberToSearch){
                upperBound = middleElement - 1;
            }else{
                lowerBound = middleElement + 1;
            }
        }

        return -1;
    }

}
