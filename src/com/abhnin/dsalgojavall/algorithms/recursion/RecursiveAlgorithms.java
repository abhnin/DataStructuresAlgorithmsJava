package com.abhnin.dsalgojavall.algorithms.recursion;

import com.abhnin.dsalgojavall.ds.linkedlist.DoublyLinkedList;
import com.abhnin.dsalgojavall.ds.linkedlist.LinkedList;

import java.util.ArrayList;

public class RecursiveAlgorithms {
    public static long factorial(long num){
        if (num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static long mul(long a, long b){
        if (b == 0){
            return 0;
        }
        return a + mul(a, b-1);
    }
    public static int countDigits(long num){
        if ( (num / 10) == 0) return 1;
        return 1 + countDigits(num/10);
    }
    public static long sumOfDigits(long num){
        if ( (num /10)  == 0) return num;
        return (num % 10) + sumOfDigits(num/10);
    }
    public static long fib(int num){
        if (num == 1) return 0;
        else if (num == 2) return 1;
        else if (num == 0) return 0;
        return fib(num -1) + fib(num -2);
    }
}
